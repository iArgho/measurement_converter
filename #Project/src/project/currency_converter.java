/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

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

        bc1 = new javax.swing.JComboBox<>();
        ti = new javax.swing.JTextField();
        A1 = new javax.swing.JButton();
        to = new javax.swing.JTextField();
        bc2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1119, 550));
        setMinimumSize(new java.awt.Dimension(1119, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        bc1.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        bc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladeshi taka", "Indian rupee", "British pound", "American dollar", "Canadian dollar", "Euro", "Saudi riyal", " ", " ", " " }));
        getContentPane().add(bc1);
        bc1.setBounds(160, 320, 228, 68);
        getContentPane().add(ti);
        ti.setBounds(160, 230, 230, 45);

        A1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        A1.setText("Covert");
        A1.setFocusPainted(false);
        A1.setFocusable(false);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1);
        A1.setBounds(464, 342, 106, 45);

        to.setEditable(false);
        getContentPane().add(to);
        to.setBounds(685, 240, 230, 45);

        bc2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        bc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangladeshi taka", "Indian rupee", "British pound", "American dollar", "Canadian dollar", "Euro", "Saudi riyal" }));
        getContentPane().add(bc2);
        bc2.setBounds(690, 320, 228, 68);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("<");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 400, 48, 36);

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\Project - Measurement Converter\\IMG-2901.JPG")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-50, 0, 1230, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        P00001__Choice_1 main = new P00001__Choice_1();
        main.setVisible(true);
        main.setLocationRelativeTo(null);
        main.setTitle("Converter");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JComboBox<String> bc1;
    private javax.swing.JComboBox<String> bc2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField ti;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
