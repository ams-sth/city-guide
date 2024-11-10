package view;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Hospitals extends javax.swing.JInternalFrame {

    public Hospitals() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null); 
        getContentPane().setBackground(Color.white);
        
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel509 = new javax.swing.JLabel();
        jLabel510 = new javax.swing.JLabel();
        jLabel511 = new javax.swing.JLabel();
        jLabel498 = new javax.swing.JLabel();
        jLabel499 = new javax.swing.JLabel();
        jLabel497 = new javax.swing.JLabel();
        jLabel503 = new javax.swing.JLabel();
        jLabel504 = new javax.swing.JLabel();
        jLabel505 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        call1 = new javax.swing.JButton();
        map1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        call2 = new javax.swing.JButton();
        map2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        call3 = new javax.swing.JButton();
        map3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        call4 = new javax.swing.JButton();
        map4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        call5 = new javax.swing.JButton();
        map5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        call6 = new javax.swing.JButton();
        map6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("Norvic International Hospital");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("Norvic International Hospital");

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel20.setText("Grande International Hospital");

        jLabel509.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/world-wide-web (1).png"))); // NOI18N

        jLabel510.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/google-maps.png"))); // NOI18N

        jLabel511.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map (1).png"))); // NOI18N

        jLabel498.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/world-wide-web (1).png"))); // NOI18N

        jLabel499.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/google-maps.png"))); // NOI18N

        jLabel497.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map (1).png"))); // NOI18N

        jLabel503.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/world-wide-web (1).png"))); // NOI18N

        jLabel504.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/google-maps.png"))); // NOI18N

        jLabel505.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map (1).png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 245, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Norvic International Hospital", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 160));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/norvic-international-hospital_20210713171541 .jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 150));
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        call1.setBackground(new java.awt.Color(255, 255, 255));
        call1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/call.png"))); // NOI18N
        call1.setInheritsPopupMenu(true);
        call1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call1ActionPerformed(evt);
            }
        });

        map1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/location.png"))); // NOI18N
        map1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(map1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(call1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(call1)
                    .addComponent(map1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 245, 238));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alka Hospital Pvt Ltd", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 160));
        jPanel3.setVerifyInputWhenFocusTarget(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ALKA-Hospital-214x127.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setFocusTraversalPolicyProvider(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 150));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        call2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/call.png"))); // NOI18N
        call2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call2ActionPerformed(evt);
            }
        });

        map2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/location.png"))); // NOI18N
        map2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(map2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(call2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(map2)
                    .addComponent(call2))
                .addGap(42, 42, 42))
        );

        jPanel4.setBackground(new java.awt.Color(255, 245, 238));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sumeru Hospital ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 160));

        jLabel3.setBackground(new java.awt.Color(255, 245, 238));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sumeru-hospital-logo-1.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 150));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        call3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/call.png"))); // NOI18N
        call3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call3ActionPerformed(evt);
            }
        });

        map3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/location.png"))); // NOI18N
        map3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(map3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(call3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(call3)
                    .addComponent(map3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 245, 238));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nepal Cancer Hospital and Research", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 160));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nepal-Cancer-Hospital-and-Research-Centre-1302.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        call4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/call.png"))); // NOI18N
        call4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call4ActionPerformed(evt);
            }
        });

        map4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/location.png"))); // NOI18N
        map4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(map4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(call4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(call4)
                    .addComponent(map4))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 245, 238));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nidan Hospital", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(250, 160));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nidan-Hospital.jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 150));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        call5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/call.png"))); // NOI18N
        call5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call5ActionPerformed(evt);
            }
        });

        map5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/location.png"))); // NOI18N
        map5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(map5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(call5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(map5)
                    .addComponent(call5))
                .addGap(19, 19, 19))
        );

        jPanel7.setBackground(new java.awt.Color(255, 245, 238));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Global Hospital ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(250, 160));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/globalhospital.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 150));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        call6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/call.png"))); // NOI18N
        call6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call6ActionPerformed(evt);
            }
        });

        map6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/location.png"))); // NOI18N
        map6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(map6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(call6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(map6)
                    .addComponent(call6))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jButton1.setText("Other Hospital");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new NorvicHospitalImage().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void call1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call1ActionPerformed
        JOptionPane.showMessageDialog(null, "Phone No: 01-5970032 \n"+"Website: https://www.norvichospital.com \n"+"Location: Thapathali, Kathmandu", "Contacts", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_call1ActionPerformed

    private void map1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Norvic+International+Hospital/@27.6899471,85.3170579,17z/data=!3m1!4b1!4m5!3m4!1s0x39eb19b163529399:0x522e7f4734ac0fb9!8m2!3d27.6899471!4d85.3192466").toURI());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_map1ActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        new AlkaHospitalImage().setVisible(true);
    }//GEN-LAST:event_jLabel2MousePressed

    private void call2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call2ActionPerformed
        JOptionPane.showMessageDialog(null, "Phone No:01-5970795, 01-5455555, 01-545333 \n"+"Email: info@alkahospital.com\n"+"Location: Jawalakhel, Lalitpur", "Contacts", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_call2ActionPerformed

    private void map2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map2ActionPerformed

        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Alka+Hospital+Pvt+Ltd/@27.6741796,85.3130076,17z/data=!4m9!1m2!2m1!1salka+hospital+map!3m5!1s0x39eb182d8aa9395d:0x9ef19733ca3f3625!8m2!3d27.6741796!4d85.3151963!15sChFhbGthIGhvc3BpdGFsIG1hcJIBEHByaXZhdGVfaG9zcGl0YWw").toURI());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_map2ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        new SumeruHospitalImage().setVisible(true);
    }//GEN-LAST:event_jLabel3MousePressed

    private void call3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call3ActionPerformed
        JOptionPane.showMessageDialog(null, "Phone No:01-5275377, 01-5275088, 01-5275099, 9801203070, 01-5275103, 01-5003433, 01-5229155, 9843484037, 9802003377\n"+ "Email:info@sumeruhospital.org.np\n"+"Location:Dhapakhel, Lalitpur\n", "Contacts", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_call3ActionPerformed

    private void map3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map3ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Sumeru+Hospital/@27.6447152,85.3258716,15z/data=!4m5!3m4!1s0x0:0xf19c1c450d730b63!8m2!3d27.6447152!4d85.3258716").toURI());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_map3ActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        new NepalCancerHospitalandResearchImage().setVisible(true);
    }//GEN-LAST:event_jLabel4MousePressed

    private void call4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call4ActionPerformed
        JOptionPane.showMessageDialog(null, "Phone No:01-5251312\n"+"Email:info@nch.com.np\n"+"Location:Harisiddhi, Lalitpur\n", "Contacts", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_call4ActionPerformed

    private void map4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map4ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps?q=nepal+cancer+and+research+hospital&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjL3omTqt71AhVoT2wGHXg2BuEQ_AUoAXoECAIQAw").toURI());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_map4ActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        new NidanHospitalImage().setVisible(true);
    }//GEN-LAST:event_jLabel5MousePressed

    private void call5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call5ActionPerformed
        JOptionPane.showMessageDialog(null, "Phone No:(977-1) 5431333, 5431822, 5431297\n"+"Email:info@nidanhospital.com\n"+"Location:Lalitpur, Pulchowk, opposite to Namaste Supermarket", "Contacts", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_call5ActionPerformed

    private void map5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map5ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/place/Nidan+Hospital+Ltd./@27.6789865,85.3136981,17z/data=!3m1!4b1!4m5!3m4!1s0x39eb19ca54b5d72d:0xfc3de0186b0553b!8m2!3d27.6789865!4d85.3158868").toURI());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_map5ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        new GlobalHospitalImage().setVisible(true);
    }//GEN-LAST:event_jLabel6MousePressed

    private void call6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call6ActionPerformed
        JOptionPane.showMessageDialog(null, "Phone No:(977-1) 5201809, 5200445, 5201920\n"+"Location:Gwarko, Kathmandu\n", "Contacts", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_call6ActionPerformed

    private void map6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map6ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps?q=global+hospital+pvt+ltd&um=1&ie=UTF-8&sa=X&ved=2ahUKEwiWy9KTq971AhUhSWwGHTOABMUQ_AUoAXoECAIQAw").toURI());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_map6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new OtherHospital().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton call1;
    private javax.swing.JButton call2;
    private javax.swing.JButton call3;
    private javax.swing.JButton call4;
    private javax.swing.JButton call5;
    private javax.swing.JButton call6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel497;
    private javax.swing.JLabel jLabel498;
    private javax.swing.JLabel jLabel499;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel503;
    private javax.swing.JLabel jLabel504;
    private javax.swing.JLabel jLabel505;
    private javax.swing.JLabel jLabel509;
    private javax.swing.JLabel jLabel510;
    private javax.swing.JLabel jLabel511;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton map1;
    private javax.swing.JButton map2;
    private javax.swing.JButton map3;
    private javax.swing.JButton map4;
    private javax.swing.JButton map5;
    private javax.swing.JButton map6;
    // End of variables declaration//GEN-END:variables
}
