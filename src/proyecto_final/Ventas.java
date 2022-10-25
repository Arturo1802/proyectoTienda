/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

class MiTabla extends DefaultTableModel{ 
    @Override 
    public boolean isCellEditable(int i, int i1) {
        if (i1==2) {
            return true;
        } else {
            return false;
        }
    } 
    
}


/**
 *
 * @author Boni
 */
public class Ventas extends javax.swing.JFrame { 
    
    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        llenarListas();
    }
    private void llenarListas(){
         listaClientes.removeAllItems();
         listaEmpleados.removeAllItems();
         jTable1.setModel(new DefaultTableModel());
        try {
            File f=new File("Empleados.txt");
            FileReader fr= new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;  
            while((linea = br.readLine())!=null){
                String[] empTemporal=linea.split("%");
                String stringTemporal="";
                for (int i = 0; i < empTemporal.length; i++) {
                stringTemporal+=empTemporal[i]+" ";
                }
                listaEmpleados.addItem(stringTemporal);     
            }
            
        } catch (Exception e) {
        }
        try {
            File f=new File("Clientes.txt");
            FileReader fr= new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;   
            while((linea = br.readLine())!=null){
                String[] tmp=linea.split("%");
                String tmps="";
                for (int i = 0; i < tmp.length; i++) {
                tmps+=tmp[i]+" ";
                }
                listaClientes.addItem(tmps);  
            } 
        } catch (Exception e) {
        }
        jTable1.setModel(new DefaultTableModel());
        try {
            File f=new File("Articulos.txt");
            FileReader fr= new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea; 
            MiTabla dm=new MiTabla();
            dm.addColumn("Articulo");
            dm.addColumn("Precio");
            dm.addColumn("Cantidad"); 
            while((linea = br.readLine())!=null){ 
                String[] artTemporal=linea.split("%");
                String stringTemporal="";
                for (int i = 0; i < artTemporal.length; i++) {
                stringTemporal+=artTemporal[i]+" ";
                } 
                dm.addRow(new Object[]{artTemporal[0],artTemporal[1],"0"}); 
            }
           
            jTable1.setModel(dm);
            
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        listaEmpleados = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        venta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        listaClientes = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jLabel1.setText("Seleccionar empleado");

        venta.setText("Completar venta");
        venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar cliente");

        listaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaClientesActionPerformed(evt);
            }
        });

        jButton2.setText("Menú Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton2KeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaEmpleados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(venta, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaActionPerformed
         String empTicket="",cliTicket="" ;
        try { 
            
            int  cantidad[];
            double precio[] ;             //Arreglos para guardar variables por separado
            String articulo[];                       //
            String existenciaArticulos[]=new String[jTable1.getModel().getRowCount()];               //
            File fa=new File("Articulos.txt");  
            String _articulos[]=new String[jTable1.getModel().getRowCount()];
            String articulosSeparado[];
             if (fa.exists()) { 
                 BufferedReader br=new BufferedReader(new FileReader(fa));
                 
                 String linea;
                 int ctrlArt=0; 
                 while((linea=br.readLine())!=null){ 
                     _articulos[ctrlArt]=linea;
                     ctrlArt++;
                 }
                 
                 for (int i = 0; i < _articulos.length; i++) {  
                      articulosSeparado=_articulos[i].split("%"); 
                     existenciaArticulos[i]=articulosSeparado[2];      
                 }
                 br.close();
             } else {
                 System.out.println("No existe/esta vacio");
             }
            
            
            int j=0;
            for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {//recorre la tabla por completo
                if (jTable1.getModel().getValueAt(i, 2).toString().matches("\\d")) {//El primer if comprueba que el valor sea un digito(Caracter de escape de tipo REGEX) 
                    j++;//variable para contabilizar los que tienen cantidad valida e inicializar los arreglos Articulo[] Precio[] Cantidad[] (Prevenir NullPointer)
                } 
            }
            articulo=new String[j];
            precio=new double[j];
            cantidad=new int[j];  
            int ctrlCant=0;
            BufferedWriter bwa= new BufferedWriter(new FileWriter(fa));
            int cantidadactual;
            String art[];
            for (int i = 0; i < jTable1.getModel().getRowCount();i++ ) { //variable de control (para que no cuente todos los objetos de la tabla sino que contabilice cuantos Tipos de articulo lleva el cliente)
                if (Integer.parseInt(jTable1.getModel().getValueAt(i, 2).toString())>0 && Integer.parseInt(jTable1.getModel().getValueAt(i, 2).toString())<Integer.parseInt(existenciaArticulos[i])) {
                    articulo[ctrlCant]=(String) jTable1.getModel().getValueAt(i, 0);
                    precio[ctrlCant]=Double.parseDouble(jTable1.getModel().getValueAt(i, 1).toString());
                    cantidad[ctrlCant]=Integer.parseInt(jTable1.getModel().getValueAt(i, 2).toString());  
                    art=_articulos[i].split("%");
                    cantidadactual=(Integer.parseInt(art[2])-cantidad[ctrlCant]);
                    bwa.write(art[0]+"%"+art[1]+"%"+cantidadactual); 
                    bwa.newLine();
                    ctrlCant++; 
                }else{ 
                    bwa.write(_articulos[i]);
                    bwa.newLine();
                }   
            } 
            bwa.close(); 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            File fe=new File("Empleados.txt");
            double ventaN=0;
             if (fe.exists()) { 
                 BufferedReader br=new BufferedReader(new FileReader(fe)); 
                 String linea;
                 int numL=0;
                 while((linea= br.readLine())!= null){  
                     numL++;
                 }
                 String[] _empleados= new String[numL]; 
                 linea="";
                 numL=0;  
                 br=new BufferedReader(new FileReader(fe));
                 while((linea= br.readLine())!= null){   
                     _empleados[numL]=linea; 
                     numL++;
                 }
                 br.close();
                BufferedWriter bw=new BufferedWriter(new FileWriter(fe));
                Empleado e;
                
                for (int i = 0; i < _empleados.length; i++) {   
                    String[] empTemp = _empleados[i].split("%"); 
                     
                    if (listaEmpleados.getSelectedIndex()==i) {  
                        e=new Empleado(empTemp[0], empTemp[1].charAt(0), Persona.estadoCivilInt(empTemp[2]) , empTemp[3], new Fecha(empTemp[4]));
                        empTicket=empTemp[0]; 
                        if (empTemp.length>5) {
                            e.setTotalVentas(Double.parseDouble(empTemp[5])); 
                            for (int k = 0; k < articulo.length; k++) {
                            ventaN+=precio[k]*cantidad[k];
                            } 
                            e.incrementaVentas(ventaN); 
                            String cambio=empTemp[0]+"%"+empTemp[1]+"%"+empTemp[2]+"%"+empTemp[3]+"%"+empTemp[4]+"%"+e.getTotalVentas();
                            bw.write(cambio);
                            bw.newLine();
                        } else {
                            bw.write(_empleados[i]+"%"+e.getTotalVentas());
                            bw.newLine();
                        } 
                        listaEmpleados.setSelectedIndex(-1);
                    } else { 
                        e=new Empleado(empTemp[0], empTemp[1].charAt(0), Persona.estadoCivilInt(empTemp[2]) , empTemp[3], new Fecha(empTemp[4])); 
                        if (empTemp.length>5) {
                            bw.write(_empleados[i]);
                            bw.newLine();
                        } else {
                            bw.write(_empleados[i]+"%"+e.getTotalVentas());
                            bw.newLine();
                        }
                    } 
                }  
                bw.close();   
             } else {
                 System.out.println("El archivo de empleados no existe/está vacio");
             }
             
/////////////////////////////////////////////////////////////////////////////////////////////// ////////////////////////////////////////////////////////

            File fc=new File("Clientes.txt");
            Cliente c = null;
            
             if (fc.exists()) {
                 BufferedReader br=new BufferedReader(new FileReader(fc)); 
                 String linea;
                 int numL=0;
                 while((linea= br.readLine())!= null){  
                     numL++;
                 }
                 String[] _clientes= new String[numL]; 
                 linea="";
                 numL=0;  
                 br=new BufferedReader(new FileReader(fc));
                 while((linea= br.readLine())!= null){   
                     _clientes[numL]=linea; 
                     numL++;
                 }
                 br.close();
                BufferedWriter bw=new BufferedWriter(new FileWriter(fc));
                
                 for (int i = 0; i < _clientes.length; i++) { 
                    String[] tmp = _clientes[i].split("%"); 
                     if (listaClientes.getSelectedIndex()==i) { 
                        c=new Cliente(tmp[0],tmp[1].charAt(0),Persona.estadoCivilInt(tmp[2]),tmp[3],Integer.parseInt(tmp[4]),Double.parseDouble(tmp[7]),new Fecha(tmp[5])); 
                         String cambio;
                        if (c.incrementaSaldo(ventaN)) {
                              cambio=tmp[0]+"%"+tmp[1]+"%"+tmp[2]+"%"+tmp[3]+"%"+tmp[4]+"%"+tmp[5]+"%"+tmp[6]+"%"+c.getSaldo();
                         } else {
                               cambio=_clientes[i];
                         } 
                        bw.write(cambio);
                        bw.newLine();
                     } else { 
                         c=new Cliente(tmp[0],tmp[1].charAt(0),Persona.estadoCivilInt(tmp[2]),tmp[3],Integer.parseInt(tmp[4]),Double.parseDouble(tmp[7]),new Fecha(tmp[5])); 
                         bw.write(_clientes[i]);
                         bw.newLine();
                     }
                     cliTicket=c.getNombre();
                    
                 }
                 bw.close();
                
//                  
                
             } else {
                 System.out.println("El archivo de clientes no existe/está vacio"); 
             }
             
             
             ////////////////////////////////////////////////////////////////////////////////////////////////
             
            if (c.creditoDisponible()>ventaN) {
                File ticket=null; 
                 int tick=0;
                 do {                
                    ticket=new File((tick+1)+".txt"); 
                    tick++;
                } while (ticket.exists());
                BufferedWriter bw=new BufferedWriter(new FileWriter(ticket));
                bw.write("Venta: "+tick);
                bw.newLine();
                bw.write("Cliente:");
                bw.newLine();
                bw.write(cliTicket);
                bw.newLine();
                bw.write("Empleado:");
                bw.newLine();
                bw.write(empTicket);
                bw.newLine();
                bw.write("Articulo\t\t\tCantidad\t\t\tPrecio"); 
                bw.newLine();
                for (int i = 0; i < articulo.length; i++) {
                    if (articulo[i]!=null) {
                        bw.write(articulo[i]+"\t\t\t\t"+cantidad[i]+"\t\t\t\t"+precio[i]);   
                    } else {
                        bw.write("\t\t\t\t\t\t\t"+cantidad[i]+"\t\t\t\t"+precio[i]);   
                    }
                    bw.newLine();
                }
                bw.write("Total:⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉⇉"+ventaN);
                bw.close();
            } else {
                 JOptionPane.showMessageDialog(null, "Credito excedido");
            }
            /////////////////////////////////////////////////////////////////////////
        } catch (Exception e) {
            e.printStackTrace();
        }
        llenarListas();
    }//GEN-LAST:event_ventaActionPerformed

    private void listaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaClientesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProyectoTienda p=new ProyectoTienda();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyTyped
          
    }//GEN-LAST:event_jButton2KeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> listaClientes;
    private javax.swing.JComboBox<String> listaEmpleados;
    private javax.swing.JButton venta;
    // End of variables declaration//GEN-END:variables
}