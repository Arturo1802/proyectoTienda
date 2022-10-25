    //ARTURO BONILLA MEDINA 

package proyecto_final;

import java.util.ArrayList;

 
public class Cliente extends Persona{
    private int idCliente;
    private int tipoCLiente;
    private double saldo;
    static double Limite=5000;
    static int numClientes;
    public static  ArrayList<String> lista = new ArrayList<String>();
    
    public String aListar(){
        return idCliente+"\t"+nombre+"\t\t"+sexo+"\t\t"+estadoCivil+"\t\t"+telefono+"\t"+tipoCLiente+"\t\t"+saldo+"\t"+this.edad();
    }
    
    public static void listar(){
        System.out.println("ID\tNombre\t\t\tSexo\tEstado Civil\t\tTelefono\tTipo Cliente\tSaldo\tEdad");
        
        for (int i = 1; i <=numClientes; i++) {
              System.out.println(lista.get(i-1));          
        }
    } 
    public Cliente() {
        numClientes++;
        this.idCliente=numClientes+1;
        lista.add(idCliente, this.aListar());
    }

    public Cliente(String nombre, char sexo, int estadoCivil, String telefono, int tipoCLiente, double saldo ,Fecha fecha) {
        super(nombre, sexo, estadoCivil, telefono, fecha);
        this.tipoCLiente = tipoCLiente;
        this.saldo = 0;
        numClientes++;
        this.idCliente=numClientes+1;
//        lista.add(idCliente, this.aListar());
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }  
    public int getTipoCLiente() {
        return tipoCLiente;
    }

    public void setTipoCLiente(int tipoCLiente) {
        this.tipoCLiente = tipoCLiente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    public double creditoDisponible(){ 
        return Limite-saldo;
    }
    public double determinaDescuento(){
        switch (tipoCLiente) {
            case 1:
                return 0; 
            case 2:
                return 0.05; 
            case 3:
                return 0.1;
            default:
                return 0; 
        } 
    }
    public boolean incrementaSaldo(double montoCompra){
        if (creditoDisponible()>=montoCompra) {
            saldo+=montoCompra;
            return true;
        } else {
            return false;
                   
        }
    }
    public void decrementaSaldo(double abono){
        saldo-=abono;
   }
    
    
    @Override
    protected void finalize() throws Throwable {
        lista.remove(idCliente-2);
        super.finalize(); 
        numClientes--;
    } 

    @Override
    public String accion() {
        switch(situacionR()){
            case 1:
                return "Realice su compra en linea por favor";
            case 2: 
                return "Pase con cuidado, use el cubrebocas";
            case 3:
                return "Pase";
             default:
                 return "?";
        }
    }
    
    
 

     
}
