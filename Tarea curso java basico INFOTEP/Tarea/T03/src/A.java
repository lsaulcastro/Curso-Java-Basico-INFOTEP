
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sauld
 */
public class A extends javax.swing.JFrame {

    /**
     * Creates new form A
     */
    public A() {
//        buttonGroup1.add(jRadioButtonWindows);
//        buttonGroup1.add(jRadioButtonMac);
//        buttonGroup1.add(jRadioButtonLinux);
        initComponents();
          buttonGroup1.add(jRadioButtonWindows);
        buttonGroup1.add(jRadioButtonMac);
        buttonGroup1.add(jRadioButtonLinux);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonWindows = new javax.swing.JRadioButton();
        jRadioButtonLinux = new javax.swing.JRadioButton();
        jRadioButtonMac = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxProgramacion = new javax.swing.JCheckBox();
        jCheckBoxAdmin = new javax.swing.JCheckBox();
        jCheckBoxGrafico = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, null));

        jLabel1.setText("Elige un sistema operativo");

        jRadioButtonWindows.setText("Windows");

        jRadioButtonLinux.setText("Linux");

        jRadioButtonMac.setText("Mac");
        jRadioButtonMac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMacActionPerformed(evt);
            }
        });

        jLabel2.setText("Elige tu especialidad");

        jCheckBoxProgramacion.setText("Programacion");

        jCheckBoxAdmin.setText("Administracion");

        jCheckBoxGrafico.setText("Diseño grafico");

        jLabel3.setText("Horas que dedicas en el ordenador");

        jLabel4.setText("0");
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jSlider1.setMaximum(10);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintTrack(false);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxGrafico)
                            .addComponent(jCheckBoxAdmin)
                            .addComponent(jRadioButtonMac)
                            .addComponent(jRadioButtonWindows)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButtonLinux)
                            .addComponent(jLabel2)
                            .addComponent(jCheckBoxProgramacion)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonLinux)
                .addGap(3, 3, 3)
                .addComponent(jRadioButtonMac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxProgramacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxGrafico)
                .addGap(4, 4, 4)
                .addComponent(jCheckBoxAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMacActionPerformed

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
      // jLabel4.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jLabel4AncestorAdded

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
      jLabel4.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButtonLinux.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonLinux.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
         if (jRadioButtonLinux.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonLinux.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n* "+ jCheckBoxGrafico.getText() +"\n* "+ jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
          if (jRadioButtonLinux.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonLinux.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n* " + jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
          }
            if (jRadioButtonLinux.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonLinux.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()  +"\n* " + jCheckBoxGrafico.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
          if (jRadioButtonLinux.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonLinux.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxGrafico.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }if (jRadioButtonLinux.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonLinux.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }if (jRadioButtonLinux.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonLinux.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxProgramacion.getText() + "\n* " + jCheckBoxGrafico.getText() +"\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
        
        
        //Windows
         if (jRadioButtonWindows.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonWindows.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
         if (jRadioButtonWindows.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonWindows.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n* "+ jCheckBoxGrafico.getText() +"\n* "+ jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
          if (jRadioButtonWindows.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonWindows.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n* " + jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
          }
            if (jRadioButtonWindows.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonWindows.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()  +"\n* " + jCheckBoxGrafico.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
          if (jRadioButtonWindows.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonWindows.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxGrafico.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }if (jRadioButtonWindows.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonWindows.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }if (jRadioButtonWindows.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonWindows.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxProgramacion.getText() + "\n* " + jCheckBoxGrafico.getText() +"\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
        //Mac
         if ( jRadioButtonMac.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonMac.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
         if ( jRadioButtonMac.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonMac.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n* "+ jCheckBoxGrafico.getText() +"\n* "+ jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
          if ( jRadioButtonMac.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonMac.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()+"\n* " + jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
          }
            if ( jRadioButtonMac.isSelected()&& jCheckBoxAdmin.isSelected() == true && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonMac.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxAdmin.getText()  +"\n* " + jCheckBoxGrafico.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
          if (jRadioButtonMac.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonMac.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxGrafico.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }if (jRadioButtonMac.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == false && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonMac.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxProgramacion.getText() + "\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }if (jRadioButtonMac.isSelected()&& jCheckBoxAdmin.isSelected() == false && jCheckBoxGrafico.isSelected() == true && jCheckBoxProgramacion.isSelected() == true ){
            JOptionPane.showMessageDialog(null,"El sistema operativo elegido es: " + jRadioButtonMac.getText() + "\nSu especialidad o especialidades son:\n* " + jCheckBoxProgramacion.getText() + "\n* " + jCheckBoxGrafico.getText() +"\n Las horas dedicadas al ordemador son: " + jSlider1.getValue() +" Horas" );
        }
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
            java.util.logging.Logger.getLogger(A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxAdmin;
    private javax.swing.JCheckBox jCheckBoxGrafico;
    private javax.swing.JCheckBox jCheckBoxProgramacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonLinux;
    private javax.swing.JRadioButton jRadioButtonMac;
    private javax.swing.JRadioButton jRadioButtonWindows;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
