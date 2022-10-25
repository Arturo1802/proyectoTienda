    //ARTURO BONILLA MEDINA
//ELSA PAOLA RIVAS MARTINEZ

package proyecto_final;

import java.util.ArrayList;
import java.util.Random;

 
public class Articulo {
    private int idArticulo;
    private String descripcion;
    private double precioVenta;
    private int existencia;
    private double costo;
    static int numArticulos=0;
    static ArrayList<String> lista = new ArrayList<String>();
    
    public Articulo() {
        
        idArticulo=numArticulos+1;
        lista.add(idArticulo, this.aListar());
    }

    
    public Articulo(int idArticulo,String descripcion, double precioVenta, int existencia, double costo) {
        this.idArticulo=idArticulo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
        this.costo = costo; 
        lista.add(this.idArticulo,this.aListar());
        numArticulos++; 
    }

    @Override
    protected void finalize() throws Throwable{
        lista.remove(idArticulo-1);
        super.finalize();
        numArticulos--;
        
    }
    
    
    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + ", descripcion=" + descripcion + ", precioVenta=" + precioVenta + ", existencia=" + existencia + ", costo=" + costo + '}';
    }
    public String aListar(){
        return idArticulo+"\t"+descripcion+"\t\t"+precioVenta+"\t\t"+existencia+"\t\t"+costo; 
    }
    
    
    public boolean decrementaExistencia(int cantidad){
        if (cantidad<=existencia) {
            existencia-=cantidad;
            return true;
        } else {
            return false;
        }
    }
    public static void listarArticulos(){
        System.out.println("ID\tDescripcion\tPrecio de Venta\t\tExistencia\tCosto\t\n");
        for (int i = 1; i <=numArticulos ; i++) {
            System.out.println(lista.get(i-1));
        } 
    }
    
    public String ticket(Cliente c, Empleado e){
        Random r=new Random();
        int a=r.nextInt(30);
        if (decrementaExistencia(a)) {
            double sub=(costo-(c.determinaDescuento()*costo));
            e.incrementaVentas(sub*a);
            return a+"\t"+this.descripcion+"\t"+costo+"\n"+(c.determinaDescuento()*costo)+"\t"+sub+"\nTotal\t\t\t\t\t\t\t"+(sub*a);
        } else {
            return "No se completo la venta";
        }
    }
     
}
