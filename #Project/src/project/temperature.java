
package project;

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

        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JComboBox<>();
        A = new javax.swing.JButton();
        b2 = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1019, 512));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 202, 45));

        b1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        b1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius scale", "Fahrenheit scale", "Kelvin scale" }));
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 293, 61));

        A.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        A.setText("Convert");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 114, 43));

        b2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        b2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius scale", "Fahrenheit scale", "Kelvin scale" }));
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 295, 61));

        t2.setEditable(false);
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 191, 45));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 48, 36));

        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\Project - Measurement Converter\\IMG-2902.JPG")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1062, 552));
        jLabel2.setMinimumSize(new java.awt.Dimension(1062, 552));
        jLabel2.setPreferredSize(new java.awt.Dimension(1062, 552));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
        String bs1 = (String) b1.getSelectedItem();
        String s1 = t1.getText();
        String bs2 = (String) b2.getSelectedItem();
        double v = Double.valueOf(s1);
        if (bs1.equals("Celsius scale")) {
            if (bs2.equals("Celsius scale")) {
                t2.setText(s1);
            } else if (bs2.equals("Fahrenheit scale")) {
                v = v * 1.8 + 32;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Kelvin scale")) {
                v = v + 273.15;
                t2.setText(Double.toString(v));
            }
        } else if (bs1.equals("Fahrenheit scale")) {
            if (bs2.equals("Fahrenheit scale")) {
                t2.setText(s1);
            } else if (bs2.equals("Celsius scale")) {
                v = (v - 32) * 0.55555555555;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Kelvin scale")) {
                v = (v - 32) * 0.55 + 273.15;
                t2.setText(Double.toString(v));
            }
        } else if (bs1.equals("Kelvin scale")) {
            if (bs2.equals("Kelvin scale")) {
                t2.setText(s1);
            } else if (bs2.equals("Celsius scale")) {
                v = v - 273.15;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Fahrenheit scale")) {
                v = (v - 273.15) * 1.8 + 32;
                t2.setText(Double.toString(v));
            }
    }//GEN-LAST:event_AActionPerformed
    }
    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed

    }//GEN-LAST:event_t2ActionPerformed

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
    private javax.swing.JButton A;
    private javax.swing.JComboBox<String> b1;
    private javax.swing.JComboBox<String> b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
