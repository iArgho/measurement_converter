/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter;

/**
 *
 * @author Ar G Ho
 */
public class temperature extends javax.swing.JFrame {

    /**
     * Creates new form temperature
     */
    public temperature() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JComboBox<>();
        b2 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        A = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        b1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius scale", "Fahrenheit scale", "Kelvin scale" }));
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 303, 293, 61));

        b2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        b2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius scale", "Fahrenheit scale", "Kelvin scale" }));
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 303, 295, 61));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 214, 202, 45));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 214, 191, 45));

        A.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        A.setText("Convert");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 316, 114, 43));

        jTextField1.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Temperature Converter");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 410, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
     
        
    }//GEN-LAST:event_t2ActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
             String bs1 = (String) b1.getSelectedItem();
        String s1 = t1.getText();
        String bs2 = (String) b2.getSelectedItem();
        double v = Double.valueOf(s1);
        if (bs1.equals("Celsius scale")) {
            if (bs2.equals("Celsius scale")) {
                t2.setText(s1);
            } 
            else if (bs2.equals("Fahrenheit scale")) {
                v = v * 1.8 + 32;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Kelvin scale")) {
                v = v +273.15;
                t2.setText(Double.toString(v));
            } 
             } 
        else  if (bs1.equals("Fahrenheit scale")) {
            if (bs2.equals("Fahrenheit scale")) {
                t2.setText(s1);
            } 
            else if (bs2.equals("Celsius scale")) {
                v = (v-32)*0.55555555555;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Kelvin scale")) {
                v = (v-32)*0.55 +273.15;
                t2.setText(Double.toString(v));
            }
        }
          else  if (bs1.equals("Kelvin scale")) {
            if (bs2.equals("Kelvin scale")) {
                t2.setText(s1);
            } 
            else if (bs2.equals("Celsius scale")) {
                v = v- 273.15;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Fahrenheit scale")) {
                v = (v-273.15)*1.8 +32;
                t2.setText(Double.toString(v));
            } 
    }//GEN-LAST:event_AActionPerformed
        }
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
            java.util.logging.Logger.getLogger(temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(temperature.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new temperature().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JComboBox<String> b1;
    private javax.swing.JComboBox<String> b2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
