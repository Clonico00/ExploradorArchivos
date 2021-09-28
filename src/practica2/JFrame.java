package practica2;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
    }
    
    public String fD(File file){
        if(file.isDirectory()){
            return "Es un directorio";
        }else{
            return "Es un fichero";
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        directorioLabel = new javax.swing.JLabel();
        extensionLabel = new javax.swing.JLabel();
        directorioField = new javax.swing.JFormattedTextField();
        extensionField = new javax.swing.JFormattedTextField();
        extensionButton = new javax.swing.JButton();
        directorioButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dirTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Explorador Basico");

        directorioLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        directorioLabel.setText("Indique directorio");

        extensionLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        extensionLabel.setText("Indique extension");

        directorioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorioFieldActionPerformed(evt);
            }
        });

        extensionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extensionFieldActionPerformed(evt);
            }
        });

        extensionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica2/lupa (1).png"))); // NOI18N
        extensionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extensionButtonActionPerformed(evt);
            }
        });

        directorioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica2/lupa (1).png"))); // NOI18N
        directorioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorioButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(dirTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extensionLabel)
                    .addComponent(directorioLabel))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extensionField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directorioField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directorioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extensionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directorioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(directorioLabel)
                        .addComponent(directorioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extensionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(extensionLabel)
                        .addComponent(extensionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void directorioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorioFieldActionPerformed

    private void extensionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extensionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extensionFieldActionPerformed

    private void directorioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorioButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("Tamaño");
        tabla.addColumn("Extension");
        tabla.addColumn("F/D");
        
        String path = directorioField.getText();
        File carpeta = new File(path);
        
        if(carpeta.exists()==false){
            JOptionPane.showMessageDialog(null,"No existe la ruta","ERROR", 0);
            
        }else{
            File[] listado = carpeta.listFiles();
     
        for (int i = 0; i < listado.length; i++) {
            if(listado[i].isDirectory()){
                tabla.addRow(new Object[]{listado[i].getName(),listado[i].length(),"",fD(listado[i])});
            }else{
                tabla.addRow(new Object[]{listado[i].getName(),listado[i].length(),listado[i].getName().substring (listado[i].getName().lastIndexOf (".") + 1),fD(listado[i])});

            }

            }
        dirTable.setModel(tabla);
        }
        
    }//GEN-LAST:event_directorioButtonActionPerformed

    private void extensionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extensionButtonActionPerformed
        //TODO add your handling code here:
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("Tamaño");
        tabla.addColumn("Extension");
        tabla.addColumn("F/D");
        
        String path = directorioField.getText();
        String ext = extensionField.getText();
        if(ext.isEmpty()){
            JOptionPane.showMessageDialog(null,"No existe la extension","ERROR", 0);
        }else{
            File carpeta = new File(path);
            if(carpeta.exists()==false){
                JOptionPane.showMessageDialog(null,"No existe la ruta","ERROR", 0);

            }else{
                File[] listado = carpeta.listFiles();

                for (int i = 0; i < listado.length; i++) {
                    if(listado[i].getName().endsWith("."+ext)){
                        tabla.addRow(new Object[]{listado[i].getName(),listado[i].length(), listado[i].getName().substring (listado[i].getName().lastIndexOf (".") + 1),fD(listado[i])});

                    }
                }
                dirTable.setModel(tabla);
            }

        }


    }//GEN-LAST:event_extensionButtonActionPerformed

   
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dirTable;
    private javax.swing.JButton directorioButton;
    private javax.swing.JFormattedTextField directorioField;
    private javax.swing.JLabel directorioLabel;
    private javax.swing.JButton extensionButton;
    private javax.swing.JFormattedTextField extensionField;
    private javax.swing.JLabel extensionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
