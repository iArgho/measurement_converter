/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package measurement;

/**
 *
 * @author Ar G Ho
 */
public class currency_converter extends javax.swing.JFrame {

    /**
     * Creates new form currency_converter
     */
    public currency_converter() {
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

        Text = new javax.swing.JTextField();
        bc2 = new javax.swing.JComboBox<>();
        bc1 = new javax.swing.JComboBox<>();
        to = new javax.swing.JTextField();
        ti = new javax.swing.JTextField();
        A1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 0, 51));
        Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Text.setText("Currency Converter");
        Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionPerformed(evt);
            }
        });
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 50, 419, 76));

        bc2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        bc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladeshi taka", "Indian rupee", "British pound", "American dollar", "Canadian dollar", "Euro", "Saudi riyal" }));
        getContentPane().add(bc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 285, 228, 68));

        bc1.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        bc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladeshi taka", "Indian rupee", "British pound", "American dollar", "Canadian dollar", "Euro", "Saudi riyal", " ", " ", " " }));
        getContentPane().add(bc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 285, 228, 68));
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 222, 135, 45));
        getContentPane().add(ti, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 223, 135, 45));

        A1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        A1.setText("Covert");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 220, 106, 45));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        
    /*private javax.swing.JButton A1;
    private javax.swing.JTextField Text;
    private javax.swing.JComboBox<String> bc1;
    private javax.swing.JComboBox<String> bc2;
    private javax.swing.JTextField ti;
    private javax.swing.JTextField to;
       */
        String bs1 = (String) bc1.getSelectedItem();
        String s1 = ti.getText();
        String bs2 = (String) bc2.getSelectedItem();
        double v = Double.valueOf(s1);
        if (bs1.equals("Bangladeshi taka")) {
            if (bs2.equals("Bangladeshi taka")) {
                to.setText(s1);
            } 
            else if (bs2.equals("Indian rupee")) {
                v = v * 0.84;
                to.setText(Double.toString(v));
            } else if (bs2.equals("British pound")) {
                v = v * 0.0095;
                to.setText(Double.toString(v));
            } else if (bs2.equals("American dollar")) {
                v = v * .012;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Canadian dollar")) {
                v = v * 0.16;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Euro")) {
                v = v * .011;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Saudi riyal")) {
                v = v * .044;
                to.setText(Double.toString(v));
            }
        } 
         if (bs1.equals("Indian rupee")) {
            if (bs2.equals("Indian rupee")) {
                to.setText(s1);
            } 
            else if (bs2.equals("Bangladeshi taka")) {
                v = v * 1.19;
                to.setText(Double.toString(v));
            } else if (bs2.equals("British pound")) {
                v = v * 0.011;
                to.setText(Double.toString(v));
            } else if (bs2.equals("American dollar")) {
                v = v * .014;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Canadian dollar")) {
                v = v * 0.19;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Euro")) {
                v = v * .013;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Saudi riyal")) {
                v = v * .053;
                to.setText(Double.toString(v));
            }
        } 
         
           if (bs1.equals("British pound")) {
            if (bs2.equals("British pound")) {
                to.setText(s1);
            } 
            else if (bs2.equals("Bangladeshi taka")) {
                v = v * 105.4;
                to.setText(Double.toString(v));
            } else if (bs2.equals("Indian rupee")) {
                v = v * 88.79;
                to.setText(Double.toString(v));
            } else if (bs2.equals("American dollar")) {
                v = v * 1.25;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Canadian dollar")) {
                v = v * 1.65;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Euro")) {
                v = v * 1.13;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Saudi riyal")) {
                v = v *4.68;
                to.setText(Double.toString(v));
            }
        }
           
           
             if (bs1.equals("American dollar")) {
            if (bs2.equals("American dollar")) {
                to.setText(s1);
            } 
            else if (bs2.equals("Bangladeshi taka")) {
                v = v * 84.52;
                to.setText(Double.toString(v));
            } else if (bs2.equals("Indian rupee")) {
                v = v * 71.2;
                to.setText(Double.toString(v));
            } else if (bs2.equals("British pound")) {
                v = v * .8;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Canadian dollar")) {
                v = v * 1.33;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Euro")) {
                v = v * .91;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Saudi riyal")) {
                v = v *3.75;
                to.setText(Double.toString(v));
            }
        } 
             
             
                  if (bs1.equals("Canadian dollar")) {
            if (bs2.equals("Canadian dollar")) {
                to.setText(s1);
            } 
            else if (bs2.equals("Bangladeshi taka")) {
                v = v * 63.74;
                to.setText(Double.toString(v));
            } else if (bs2.equals("Indian rupee")) {
                v = v * 53.69;
                to.setText(Double.toString(v));
            } else if (bs2.equals("British pound")) {
                v = v * .6;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("American dollar")) {
                v = v * .75;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Euro")) {
                v = v * .68;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Saudi riyal")) {
                v = v *2.83;
                to.setText(Double.toString(v));
            }
        }
                  
                  
                  
               
                  if (bs1.equals("Euro")) {
            if (bs2.equals("Euro")) {
                to.setText(s1);
            } 
            else if (bs2.equals("Bangladeshi taka")) {
                v = v * 93.1;
                to.setText(Double.toString(v));
            } else if (bs2.equals("Indian rupee")) {
                v = v * 78.42;
                to.setText(Double.toString(v));
            } else if (bs2.equals("British pound")) {
                v = v * .88;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("American dollar")) {
                v = v * 1.1;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Canadian dollar")) {
                v = v * 1.46;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Saudi riyal")) {
                v = v *4.13;
                to.setText(Double.toString(v));
            }
        } 
                  
                  
                      
                  if (bs1.equals("Saudi riyal")) {
            if (bs2.equals("Saudi riyal")) {
                to.setText(s1);
            } 
            else if (bs2.equals("Bangladeshi taka")) {
                v = v * 22.53;
                to.setText(Double.toString(v));
            } else if (bs2.equals("Indian rupee")) {
                v = v * 18.98;
                to.setText(Double.toString(v));
            } else if (bs2.equals("British pound")) {
                v = v * .21;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("American dollar")) {
                v = v * .27;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Canadian dollar")) {
                v = v * .35;
                to.setText(Double.toString(v));
            }
            else if (bs2.equals("Euro")) {
                v = v *.24;
                to.setText(Double.toString(v));
            }
        } 
        
    }//GEN-LAST:event_A1ActionPerformed

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
            java.util.logging.Logger.getLogger(currency_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currency_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currency_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currency_converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currency_converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JTextField Text;
    private javax.swing.JComboBox<String> bc1;
    private javax.swing.JComboBox<String> bc2;
    private javax.swing.JTextField ti;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}