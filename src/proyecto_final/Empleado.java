//ARTURO BONILLA MEDINA 

package proyecto_final;

import java.util.ArrayList;

 
public class Empleado extends Persona{
    private int idEmpleado; 
    private double totalVentas=0;
    static double sueldoBase=5000;
    static int numEmpleados;
    static ArrayList<String> lista = new ArrayList<String>(); 
    
    public String aListar(){
        return idEmpleado+"\t"+nombre+"\t"+sexo+"\t"+estadoCivil+"\t"+telefono+"\t"+totalVentas+"\t"+this.edad();
    }
    public static void listar(){
        System.out.println("ID\tNombre\t\t\tSexo\tEstado Civil\tTelefono\t\tTotal de Ventas\tEdad");
        for (int i = 1; i <=numEmpleados; i++) {
            System.out.println(lista.get(i-1));
        }
    }

    public Empleado() {
        super();
        numEmpleados++;
        lista.add(idEmpleado, this.aListar());
    }

    public Empleado(  String nombre, char sexo, int estadoCivil, String telefono,Fecha fecha) {
        super(nombre, sexo, estadoCivil, telefono, fecha);
        this.totalVentas = 0; 
        this.totalVentas = 0;
        numEmpleados++;
        this.idEmpleado=idEmpleado;
        lista.add(this.idEmpleado, this.aListar());
        this.fecha = fecha;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public static double getSueldoBase() {
        return sueldoBase;
    }

    public static void setSueldoBase(double sueldoBase) {
        Empleado.sueldoBase = sueldoBase;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    } 
    /**
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        lista.remove(idEmpleado-1);
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        numEmpleados--;
    }
    public double porcentajeComision(){
        if (totalVentas<5000) {
            return 0.03;
        } else {
            if (totalVentas>5000 && totalVentas<8000) {
                return 0.05;
            } else {
                if (totalVentas>8000) {
                    return 0.1;
                }
            }
        }
        return 0;  
    }
    
    public void incrementaVentas(double venta){
        totalVentas+=venta; 
    
     }
    
    public double calculaComision(){
        return totalVentas*porcentajeComision();
    }
    public double calcularSueldoBruto(){
    return calculaComision()+sueldoBase;
    }
    public double calcularISR(){
        return calcularSueldoBruto()*.25;
    }
    public double calculaSalarioNeto(){
        return calcularSueldoBruto()-calcularISR();
    }

    @Override
    public String accion() {
        switch(situacionR()){
            case 1:
                return "Regrese a casa, se le ordena cuarentena forzosa";
            case 2: 
                return "Use bien el cubrebocas y use gel antibacterial";
            case 3:
                return "Trabaje con cuidado";
             default:
                 return "?";
        }
    }

     
    
    
    
}
