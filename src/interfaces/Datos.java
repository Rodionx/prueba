/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author xp
 */
public class Datos extends javax.swing.JDialog {

    /**
     * Creates new form CambiarContraseña
     */
    public Datos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public String selectedRadio(){
        String sexo ="";
        if(radioHombre.isSelected()){
            sexo = sexo + radioHombre.getText();
        }else if(radioMujer.isSelected()){
            sexo = sexo + radioMujer.getText();
        }else if(radioSi.isSelected()){
            sexo = sexo + radioSi.getText();
        }
        return sexo;
    }
    
    public String selectedCheckBox(){
        String aficiones = "";
        if(checkBoxCine.isSelected()){
            aficiones = aficiones + checkBoxCine.getText() + " | ";
        }
        if(checkBoxDeportes.isSelected()){
            aficiones = aficiones + checkBoxDeportes.getText() + " | ";
        }
        if(checkBoxLeer.isSelected()){
            aficiones = aficiones + checkBoxLeer.getText() + " | ";
        }
        if(checkBoxViajar.isSelected()){
            aficiones = aficiones + checkBoxViajar.getText() + " | ";
        }
        return aficiones;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DNIField = new javax.swing.JTextField();
        apellidosField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        provinciaCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        checkBoxLeer = new javax.swing.JCheckBox();
        checkBoxCine = new javax.swing.JCheckBox();
        checkBoxViajar = new javax.swing.JCheckBox();
        checkBoxDeportes = new javax.swing.JCheckBox();
        radioHombre = new javax.swing.JRadioButton();
        radioMujer = new javax.swing.JRadioButton();
        radioSi = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos");

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Provincia:");

        DNIField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIFieldActionPerformed(evt);
            }
        });

        provinciaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álava ", "Albacete ", "Alicante", "Almería ", "Asturias ", "Ávila ", "Badajoz ", "Barcelona ", "Burgos ", "Cáceres ", "Cádiz ", "Cantabria ", "Castellón ", "Ciudad Real", "Córdoba ", "Cuenca ", "Gerona ", "Granada ", "Guadalajara ", "Guipúzcoa ", "Huelva ", "Huesca ", "Islas Baleares", "Jaén ", " La Coruña", "La Rioja", "Las Palmas", "León", "Lérida", "Lugo ", "Madrid ", "Málaga ", "Murcia ", "Navarra ", "Orense ", "Palencia ", "Pontevedra ", "Salamanca ", "Santa Cruz de Tenerife", "Segovia ", "Sevilla ", "Soria ", "Tarragona ", "Teruel ", "Toledo ", "Valencia ", "Valladolid ", "Vizcaya", "Zamora ", "Zaragoza " }));

        jLabel5.setText("Fecha de Nacimiento:");

        jSpinner1.setModel(new javax.swing.SpinnerDateModel());

        jLabel6.setText("Aficiones:");

        checkBoxLeer.setText("Leer");
        checkBoxLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLeerActionPerformed(evt);
            }
        });

        checkBoxCine.setText("Cine");

        checkBoxViajar.setText("Viajar ");

        checkBoxDeportes.setText("Deportes");

        buttonGroup1.add(radioHombre);
        radioHombre.setText("Hombre");

        buttonGroup1.add(radioMujer);
        radioMujer.setText("Mujer");

        buttonGroup1.add(radioSi);
        radioSi.setText("Si, porfavor");

        jLabel7.setText("Sexo:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Escriba aqui:");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("CONTINUAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ATRÁS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMujer)
                            .addComponent(radioSi)
                            .addComponent(radioHombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidosField)
                            .addComponent(nombreField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DNIField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(provinciaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxLeer)
                            .addComponent(checkBoxViajar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBoxCine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBoxDeportes)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addGap(79, 79, 79)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provinciaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBoxLeer)
                        .addComponent(radioHombre)
                        .addComponent(checkBoxCine)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxViajar)
                    .addComponent(checkBoxDeportes)
                    .addComponent(radioMujer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSi)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DNIFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNIFieldActionPerformed

    private void checkBoxLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLeerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxLeerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTextArea1.setText("DNI: " + DNIField.getText() + "\n");
       jTextArea1.append("Nombre: " + nombreField.getText() + "\n");
       jTextArea1.append("Apellidos: " + apellidosField.getText() + "\n");
       jTextArea1.append("Provincia: " + provinciaCombo.getSelectedItem() + "\n");
       jTextArea1.append("F.Nacimiento: " + jSpinner1.getValue() + "\n");
       jTextArea1.append("Aficiones: " + selectedCheckBox() + "\n");
       jTextArea1.append("Sexo: " + selectedRadio() + "\n");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Datos dialog = new Datos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNIField;
    private javax.swing.JTextField apellidosField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxCine;
    private javax.swing.JCheckBox checkBoxDeportes;
    private javax.swing.JCheckBox checkBoxLeer;
    private javax.swing.JCheckBox checkBoxViajar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JComboBox<String> provinciaCombo;
    private javax.swing.JRadioButton radioHombre;
    private javax.swing.JRadioButton radioMujer;
    private javax.swing.JRadioButton radioSi;
    // End of variables declaration//GEN-END:variables
}
