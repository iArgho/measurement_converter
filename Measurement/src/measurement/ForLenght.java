package measurement;

public class ForLenght extends javax.swing.JFrame {

    public ForLenght() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(null).createEntityManager();
        b1 = new javax.swing.JComboBox<>();
        b2 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        t2 = new javax.swing.JTextField();
        c = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        b1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimeter", "Inch", "Feet", "Meter" }));
        b1.setToolTipText("");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 301, 75));

        b2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        b2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimeter", "Inch", "Feet", "Meter" }));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 301, 75));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 290, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 170, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 300, 50));

        c.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c.setText("Convert");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 140, 50));

        jTextField1.setFont(new java.awt.Font("Sylfaen", 2, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 10, 59));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Length Converter");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 320, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

    }//GEN-LAST:event_b2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
        String bs1 = (String) b1.getSelectedItem();
        String s1 = t1.getText();
        String bs2 = (String) b2.getSelectedItem();
        double v = Double.valueOf(s1);
        if (bs1.equals("Centimeter")) {
            if (bs2.equals("Centimeter")) {
                t2.setText(s1);
            } else if (bs2.equals("Inch")) {
                v = v * 0.394;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Feet")) {
                v = v * 0.0328;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Meter")) {
                v = v * 0.01;
                t2.setText(Double.toString(v));
            }
        } 
 
        else if (bs1.equals("Meter")) 
       {
            if (bs2.equals("Meter")) {
                t2.setText(s1);
            } else if (bs2.equals("Centimeter")) {
                v = v * 100;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Inch")) {
                v = v * 39.37;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Feet")) {
                v = v * 3.28;
                t2.setText(Double.toString(v));
            }
    }//GEN-LAST:event_cActionPerformed
          else if (bs1.equals("Inch")) 
       {
            if (bs2.equals("Inch")) {
                t2.setText(s1);
            } else if (bs2.equals("Centimeter")) {
                v = v * 2.54;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Meter")) {
                v = v * 0.0254;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Feet")) {
                v = v * 0.0833333;
                t2.setText(Double.toString(v));
            }
    }      
           else if (bs1.equals("Feet")) 
       {
            if (bs2.equals("Feet")) {
                t2.setText(s1);
            } else if (bs2.equals("Centimeter")) {
                v = v * 30.48;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Meter")) {
                v = v * 0.3048;
                t2.setText(Double.toString(v));
            } else if (bs2.equals("Feet")) {
                v = v * 0.12;
                t2.setText(Double.toString(v));
            }
    }      
    }

    public static void main(String[] args) {
        ForLenght lenght = new ForLenght();
        lenght.setVisible(true);
        lenght.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> b1;
    private javax.swing.JComboBox<String> b2;
    private javax.swing.JButton c;
    private javax.persistence.EntityManager entityManager1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
