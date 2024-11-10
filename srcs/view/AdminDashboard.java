package view;
import javax.swing.JOptionPane;
import model.Customer;

public class AdminDashboard extends javax.swing.JFrame {

    public AdminDashboard() {
        initComponents();
        setResizable(false);
        setTitle("Admin DashBoard");
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admRes = new javax.swing.JButton();
        admHos = new javax.swing.JButton();
        admHer = new javax.swing.JButton();
        admNig = new javax.swing.JButton();
        admSho = new javax.swing.JButton();
        admHot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UserAdm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        admRes.setBackground(new java.awt.Color(255, 204, 204));
        admRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restaurant.png"))); // NOI18N
        admRes.setText("Restaurants");
        admRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admResActionPerformed(evt);
            }
        });

        admHos.setBackground(new java.awt.Color(255, 204, 204));
        admHos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical.png"))); // NOI18N
        admHos.setText("Hospital");
        admHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admHosActionPerformed(evt);
            }
        });

        admHer.setBackground(new java.awt.Color(255, 204, 204));
        admHer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/museum-art.png"))); // NOI18N
        admHer.setText("Heritage Sites");
        admHer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admHerActionPerformed(evt);
            }
        });

        admNig.setBackground(new java.awt.Color(255, 204, 204));
        admNig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cocktail.png"))); // NOI18N
        admNig.setText("Nightlife");
        admNig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admNigActionPerformed(evt);
            }
        });

        admSho.setBackground(new java.awt.Color(255, 204, 204));
        admSho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shopping-bag.png"))); // NOI18N
        admSho.setText("Shopping");
        admSho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admShoActionPerformed(evt);
            }
        });

        admHot.setBackground(new java.awt.Color(255, 204, 204));
        admHot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel.png"))); // NOI18N
        admHot.setText("Hotels");
        admHot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admHotActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Choose any to change");

        UserAdm.setBackground(new java.awt.Color(255, 204, 204));
        UserAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer-service.png"))); // NOI18N
        UserAdm.setText("Users");
        UserAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAdmActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(admHer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admHos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admNig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admSho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admHot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(admRes)
                .addGap(35, 35, 35)
                .addComponent(admHos)
                .addGap(34, 34, 34)
                .addComponent(admHer)
                .addGap(36, 36, 36)
                .addComponent(admNig)
                .addGap(30, 30, 30)
                .addComponent(admSho)
                .addGap(32, 32, 32)
                .addComponent(admHot)
                .addGap(27, 27, 27)
                .addComponent(UserAdm)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admResActionPerformed
        new AdmRestaurant().setVisible(true);
        dispose();
    }//GEN-LAST:event_admResActionPerformed

    private void admHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admHosActionPerformed
        new AdmHospital().setVisible(true);
        dispose();
    }//GEN-LAST:event_admHosActionPerformed

    private void admHerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admHerActionPerformed
        new AdmHeritage().setVisible(true);
        dispose();
    }//GEN-LAST:event_admHerActionPerformed

    private void admNigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admNigActionPerformed
        new AdmNightlife().setVisible(true);
        dispose();
    }//GEN-LAST:event_admNigActionPerformed

    private void admShoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admShoActionPerformed
        new AdmShopping().setVisible(true);
        dispose();
    }//GEN-LAST:event_admShoActionPerformed

    private void admHotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admHotActionPerformed
        new AdmHotel().setVisible(true);
        dispose();
    }//GEN-LAST:event_admHotActionPerformed

    private void UserAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAdmActionPerformed
        new AdmUserDetail().setVisible(true);
        dispose();
    }//GEN-LAST:event_UserAdmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to logout?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Logged Out");
            new Login().setVisible(true);
            dispose();
            }        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
   /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UserAdm;
    private javax.swing.JButton admHer;
    private javax.swing.JButton admHos;
    private javax.swing.JButton admHot;
    private javax.swing.JButton admNig;
    private javax.swing.JButton admRes;
    private javax.swing.JButton admSho;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
