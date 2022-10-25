    //ARTURO BONILLA MEDINA
//ELSA PAOLA RIVAS MARTINEZ

package proyecto_final;
 
import java.util.Random;
import java.util.Scanner;


 
public class Utilidades {
    
   
   public int validarInt(Scanner v){ 
       int n=0;
       while(!v.hasNextInt()){
           System.out.println("Ingrese un numero entero");
           n=v.nextInt();
       }
       return n;
   }
   public double validarDouble(Scanner v){ 
       double n=0;
       while(!v.hasNextDouble()){
           System.out.println("Ingrese un numero decimal");
           n=v.nextDouble();
       }
       return n;
   }
   public static void opClientes(Cliente c1, Cliente c2) throws Throwable{
       Scanner v = new Scanner(System.in);
   System.out.println("1.Eliminar un Cliente \n2.Listado de Clientes \n3.Abono a saldo\n4.Accion COVID\n5.Salir");
                switch (v.nextInt()) {
                    case 1:
                        System.out.println("Eliminar:\n1. Cliente 1\n2. Cliente 2");
                        switch (v.nextInt()) {
                            case 1:
                                c1.finalize();
                                break;
                            case 2:
                                c2.finalize();
                                break;
                            
                            default: break;
                        }
                        break;
                    
                    case 2:
                        Cliente.listar();
                        break;
                    
                    case 3:
                        System.out.println("Abonar a:\n 1. Cliente 1\n2. Cliente 2");
                        switch (v.nextInt()) {
                            case 1:
                                System.out.println("Abonar a cliente 1");
                                c1.setSaldo(c1.getSaldo()-v.nextDouble());
                                break;
                            
                            case 2:
                                System.out.println("Abonar a cliente 2");
                                c2.setSaldo(c2.getSaldo()-v.nextDouble());
                                break; 
                            default:
                                break;
                             
                        }
                        break;
                    
                    case 4:
                        System.out.println("Seleccione el cliente");
                        System.out.println("1."+Cliente.lista.get(0));
                        System.out.println("2."+Cliente.lista.get(1));
                        
                        switch (v.nextInt()) {
                            case 1:
                                System.out.println(c1.accion());
                                break;
                            
                            case 2:
                                System.out.println(c2.accion());
                                break;
                            
                            default:
                                break;
                        }
                    default:
                        Thread.sleep(1500);
                        System.out.println("Saliendo");
                        break;
                }
   }
   public static void opEmleados(Empleado e1, Empleado e2) throws Throwable{
       Scanner v = new Scanner(System.in);
       System.out.println("1. Eliminar un Empleado\n 2. Listado de Empleados \n3. Nómina \n4.Accion COVID");
       switch (v.nextInt()) {
           case 1:
               System.out.println("Eliminar:\n1. Empleado 1\n2. Empleado 2");
                        switch (v.nextInt()) {
                            case 1:
                                e1.finalize();
                                break;
                            case 2:
                                e2.finalize();
                                break;
                            
                            default: break;
                        }
               break;
           
           case 2:
               Empleado.listar();
               break;
           
           case 3:
               System.out.println("Nomina de :\n1. Cliente 1\n2. Cliente 2");
                        switch (v.nextInt()) {
                            case 1:
                                System.out.println("ID\tNombre\t\t\tSexo\tEstado Civil\tTelefono\t\tTotal de Ventas");
                                e1.aListar();
                                break;
                            case 2:
                                System.out.println("ID\tNombre\t\t\tSexo\tEstado Civil\tTelefono\t\tTotal de Ventas");
                                e1.aListar();
                                break;
                            
                            default: break;
                        }
               break;
           case 4:
               System.out.println("Seleccione el Empleado");
                        System.out.println("1."+Empleado.lista.get(0));
                        System.out.println("2."+Empleado.lista.get(1)); 
                        switch (v.nextInt()) {
                            case 1:
                                System.out.println(e1.accion());
                                break;
                            
                            case 2:
                                System.out.println(e2.accion());
                                break;
                            default:
                                break;
                        }
               break;
           default:
               Thread.sleep(1500);
               System.out.println("Saliendo");
               break;
       }
   }
//   public static String venta(Empleado e1, Empleado e2, Articulo a1, Articulo a2, Cliente c1,Cliente c2){
//        Random r= new Random();
//        switch (r.nextInt(2)) {
//            case 1: 
//                switch (r.nextInt(2)) {
//                case 1:
//                     switch (r.nextInt(2)) {
//                case 1:
//                    
//                     return "Cantidad\tDescripcion\t\tPrecio\tDescuento\tSubtotal\n"+a1.ticket(c1,e1); 
//                case 2: 
//                    return "Cantidad\tDescripcion\t\tPrecio\tDescuento\tSubtotal\n"+a1.ticket(c2,e2);  
//            }
//                 break; 
//                case 2:
//                    switch (r.nextInt(2)) {
//                case 1:
//                     return "Cantidad\tDescripcion\t\tPrecio\tDescuento\tSubtotal\n"+a2.ticket(c2, e1); 
//            
//                case 2:
//                    return "Cantidad\tDescripcion\t\tPrecio\tDescuento\tSubtotal\n"+a2.ticket(c1,e2);  
//            }
//                  break;
//            
//            }
//                break; 
//        }
//       return null; 
//    } 
}
