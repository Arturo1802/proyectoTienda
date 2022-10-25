/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Boni
 */
public class Articulos extends javax.swing.JFrame {

    /**
     * Creates new form Articulos
     */
    public Articulos() {
        initComponents();
        llenarArticulos();
    }
    
    public void llenarArticulos(){
        jTable1.setModel(new DefaultTableModel());
        try {
            File f=new File("Articulos.txt");
            FileReader fr= new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea; 
            DefaultTableModel dm=new DefaultTableModel();
            dm.addColumn("Articulo");
            dm.addColumn("Precio");
            dm.addColumn("Existencia"); 
            while((linea = br.readLine())!=null){
                String[] artTemporal=linea.split("%");
                String stringTemporal="";
                for (int i = 0; i < artTemporal.length; i++) {
                stringTemporal+=artTemporal[i]+" ";
                }
                dm.addRow(new Object[]{artTemporal[0],artTemporal[1],artTemporal[2]}); 
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        articulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precio = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        existencia = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jButton2.setText("Menú Principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Articulo", "Precio", "Existencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Articulo");

        articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articuloActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio");

        precio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel3.setText("Existencia");

        jButton3.setText("Quitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(articulo)
                    .addComponent(jLabel2)
                    .addComponent(precio)
                    .addComponent(jLabel3)
                    .addComponent(existencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProyectoTienda p=new ProyectoTienda();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String _nombre = "";try {
            
            File f= new File("Articulos.txt");
            if (f.exists()) {
                FileReader fr=new FileReader(f);
                BufferedReader br= new BufferedReader(fr);
                String linea;
                 
                while((linea = br.readLine())!=null){
                String cliente[] = linea.split("%");
                _nombre=cliente[1];
                }
                if (_nombre.equals(articulo.getText())) {
                    return;
                } 
                
            } else {
                System.out.println("No existe el archivo");
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
        if(articulo.getText().equals("") || 
                precio.getText().equals("") || 
                existencia.getText().equals("") || 
                _nombre.contains(articulo.getText()) ){}else{   
        Articulo ar= new Articulo(0, articulo.getText(), Double.parseDouble(precio.getText()), Integer.parseInt(existencia.getText()), Double.parseDouble(precio.getText()));
        try {
            File f = new File("Articulos.txt" );
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()){
                fw = new FileWriter(f,true);
                bw= new BufferedWriter(fw); 
                bw.write(ar.getDescripcion()+"%"+ar.getPrecioVenta()+"%"+ar.getExistencia());
                bw.newLine();
            }else{
                fw = new FileWriter(f);
                bw= new BufferedWriter(fw);  
                bw.write(ar.getDescripcion()+"%"+ar.getPrecioVenta()+"%"+ar.getExistencia());
                bw.newLine();
            }
            bw.close();
            fw.close();
            llenarArticulos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e+" Error con el archivo");
        }
        }
        articulo.setText("");
        precio.setText("");
        existencia.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_articuloActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {
            File f = new File("Articulos.txt");
            if (f.exists()) {
            
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                int numL = 0;
                while((linea = br.readLine())!=null){
                    numL++;
                }
                String[] _articulos=new String[numL];
                br= new BufferedReader(new FileReader(f));
                int o=0; 
                while((linea= br.readLine())!= null){

                    _articulos[o]=linea;
                    o++;
                }
                br.close();
                fr.close();
                FileWriter fw=new FileWriter(f);
                BufferedWriter bw= new BufferedWriter(fw); 

                for (int i = 0; i < _articulos.length; i++) {
                    String[] l = _articulos[i].split("%");
                    if (jTable1.getSelectedRow()==i) {
                        JOptionPane.showMessageDialog(null, "Eliminado exitosamente"); 
                        jTable1.clearSelection();
                    } else {  
                        bw.write(_articulos[i]);
                        bw.newLine();
                    }

                } 

                bw.close();
                fw.close();  
        } else {
             JOptionPane.showMessageDialog(null,"Error, archivo vacio");
        }
        } catch (Exception e) {
        }
         llenarArticulos();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Articulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField articulo;
    private javax.swing.JFormattedTextField existencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField precio;
    // End of variables declaration//GEN-END:variables
}
