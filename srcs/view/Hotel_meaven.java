
import java.awt.Desktop;
import java.net.URL;
public class Hotel_meaven extends javax.swing.JFrame {

    /**
     * Creates new form Hotel_maven
     */
    public Hotel_meaven() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_mulberry = new javax.swing.JPanel();
        img_mulberry = new javax.swing.JLabel();
        title_mulberry = new javax.swing.JLabel();
        contact_mulberry = new javax.swing.JButton();
        directions_mulberry = new javax.swing.JButton();
        panel_shanker = new javax.swing.JPanel();
        img_shanker = new javax.swing.JLabel();
        title_shanker = new javax.swing.JLabel();
        contact_shanker = new javax.swing.JButton();
        directions_shanker = new javax.swing.JButton();
        panel_mulberry1 = new javax.swing.JPanel();
        img_mulberry1 = new javax.swing.JLabel();
        title_mulberry1 = new javax.swing.JLabel();
        contact_mulberry1 = new javax.swing.JButton();
        directions_mulberry1 = new javax.swing.JButton();
        panel_shanker1 = new javax.swing.JPanel();
        img_shanker1 = new javax.swing.JLabel();
        title_shanker1 = new javax.swing.JLabel();
        contact_shanker1 = new javax.swing.JButton();
        directions_shanker1 = new javax.swing.JButton();
        designPane = new javax.swing.JPanel();
        panel_marriott1 = new javax.swing.JPanel();
        img_mariott1 = new javax.swing.JLabel();
        directions_marriott1 = new javax.swing.JButton();
        contact_mariott = new javax.swing.JButton();
        save_Mariott = new javax.swing.JButton();
        panel_ktmboutique1 = new javax.swing.JPanel();
        img_boutique1 = new javax.swing.JLabel();
        contact_boutique1 = new javax.swing.JButton();
        directions_boutique = new javax.swing.JButton();
        save_Boutique = new javax.swing.JButton();
        panel_mulberry2 = new javax.swing.JPanel();
        img_mulberry2 = new javax.swing.JLabel();
        contact_mulberry2 = new javax.swing.JButton();
        directions_mulberry2 = new javax.swing.JButton();
        save_Mulberry = new javax.swing.JButton();
        panel_shanker2 = new javax.swing.JPanel();
        img_shanker2 = new javax.swing.JLabel();
        contact_shanker2 = new javax.swing.JButton();
        directions_shanker2 = new javax.swing.JButton();
        save_Shanker = new javax.swing.JButton();

        panel_mulberry.setBackground(new java.awt.Color(0, 255, 204));

        img_mulberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mulberry.jpg"))); // NOI18N
        img_mulberry.setText("jLabel2");

        title_mulberry.setFont(new java.awt.Font("Swis721 BlkRnd BT", 0, 12)); // NOI18N
        title_mulberry.setText("Mulberry Hotel");

        contact_mulberry.setBackground(new java.awt.Color(255, 255, 255));
        contact_mulberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_mulberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_mulberryActionPerformed(evt);
            }
        });

        directions_mulberry.setBackground(new java.awt.Color(255, 255, 255));
        directions_mulberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_mulberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_mulberryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_mulberryLayout = new javax.swing.GroupLayout(panel_mulberry);
        panel_mulberry.setLayout(panel_mulberryLayout);
        panel_mulberryLayout.setHorizontalGroup(
            panel_mulberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mulberryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_mulberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_mulberry, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_mulberryLayout.createSequentialGroup()
                        .addComponent(title_mulberry, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(directions_mulberry, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contact_mulberry, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_mulberryLayout.setVerticalGroup(
            panel_mulberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mulberryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_mulberry, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_mulberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_mulberryLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(title_mulberry, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addGroup(panel_mulberryLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_mulberryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directions_mulberry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contact_mulberry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        panel_shanker.setBackground(new java.awt.Color(0, 255, 204));

        img_shanker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotelshanker.jpg"))); // NOI18N
        img_shanker.setText("jLabel3");

        title_shanker.setFont(new java.awt.Font("Swis721 BlkRnd BT", 0, 12)); // NOI18N
        title_shanker.setText("   Hotel Shanker");

        contact_shanker.setBackground(new java.awt.Color(255, 255, 255));
        contact_shanker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_shanker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_shankerActionPerformed(evt);
            }
        });

        directions_shanker.setBackground(new java.awt.Color(255, 255, 255));
        directions_shanker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_shanker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_shankerActionPerformed(evt);
            }
        });

        panel_mulberry1.setBackground(new java.awt.Color(0, 255, 204));

        img_mulberry1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mulberry.jpg"))); // NOI18N
        img_mulberry1.setText("jLabel2");

        title_mulberry1.setFont(new java.awt.Font("Swis721 BlkRnd BT", 0, 12)); // NOI18N
        title_mulberry1.setText("Mulberry Hotel");

        contact_mulberry1.setBackground(new java.awt.Color(255, 255, 255));
        contact_mulberry1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_mulberry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_mulberry1ActionPerformed(evt);
            }
        });

        directions_mulberry1.setBackground(new java.awt.Color(255, 255, 255));
        directions_mulberry1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_mulberry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_mulberry1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_mulberry1Layout = new javax.swing.GroupLayout(panel_mulberry1);
        panel_mulberry1.setLayout(panel_mulberry1Layout);
        panel_mulberry1Layout.setHorizontalGroup(
            panel_mulberry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mulberry1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_mulberry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_mulberry1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_mulberry1Layout.createSequentialGroup()
                        .addComponent(title_mulberry1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(directions_mulberry1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contact_mulberry1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_mulberry1Layout.setVerticalGroup(
            panel_mulberry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mulberry1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_mulberry1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_mulberry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_mulberry1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(title_mulberry1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addGroup(panel_mulberry1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_mulberry1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directions_mulberry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contact_mulberry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        panel_shanker1.setBackground(new java.awt.Color(0, 255, 204));

        img_shanker1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotelshanker.jpg"))); // NOI18N
        img_shanker1.setText("jLabel3");

        title_shanker1.setFont(new java.awt.Font("Swis721 BlkRnd BT", 0, 12)); // NOI18N
        title_shanker1.setText("   Hotel Shanker");

        contact_shanker1.setBackground(new java.awt.Color(255, 255, 255));
        contact_shanker1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_shanker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_shanker1ActionPerformed(evt);
            }
        });

        directions_shanker1.setBackground(new java.awt.Color(255, 255, 255));
        directions_shanker1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_shanker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_shanker1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_shanker1Layout = new javax.swing.GroupLayout(panel_shanker1);
        panel_shanker1.setLayout(panel_shanker1Layout);
        panel_shanker1Layout.setHorizontalGroup(
            panel_shanker1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shanker1Layout.createSequentialGroup()
                .addGroup(panel_shanker1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_shanker1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(img_shanker1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_shanker1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title_shanker1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(directions_shanker1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contact_shanker1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_shanker1Layout.setVerticalGroup(
            panel_shanker1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shanker1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_shanker1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_shanker1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_shanker1Layout.createSequentialGroup()
                        .addComponent(title_shanker1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_shanker1Layout.createSequentialGroup()
                        .addGroup(panel_shanker1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(directions_shanker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contact_shanker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout panel_shankerLayout = new javax.swing.GroupLayout(panel_shanker);
        panel_shanker.setLayout(panel_shankerLayout);
        panel_shankerLayout.setHorizontalGroup(
            panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shankerLayout.createSequentialGroup()
                .addGroup(panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_shankerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(img_shanker, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_shankerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title_shanker, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(directions_shanker, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contact_shanker, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_shankerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_mulberry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(71, 71, 71)
                    .addComponent(panel_shanker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panel_shankerLayout.setVerticalGroup(
            panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shankerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_shanker, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_shankerLayout.createSequentialGroup()
                        .addComponent(title_shanker, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_shankerLayout.createSequentialGroup()
                        .addGroup(panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(directions_shanker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contact_shanker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_shankerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panel_shankerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panel_mulberry1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel_shanker1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        designPane.setBackground(new java.awt.Color(255, 255, 204));
        designPane.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 102), new java.awt.Color(204, 204, 204)));

        panel_marriott1.setBackground(new java.awt.Color(204, 204, 204));
        panel_marriott1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KATHMANDU MARIOTT HOTEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12))); // NOI18N

        img_mariott1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marriott_ext.jpg"))); // NOI18N
        img_mariott1.setText("jLabel1");
        img_mariott1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        directions_marriott1.setBackground(new java.awt.Color(255, 255, 255));
        directions_marriott1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_marriott1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        directions_marriott1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_marriott1ActionPerformed(evt);
            }
        });

        contact_mariott.setBackground(new java.awt.Color(255, 255, 255));
        contact_mariott.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_mariott.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contact_mariott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_mariottcontact_boutiqueActionPerformed(evt);
            }
        });

        save_Mariott.setBackground(new java.awt.Color(255, 255, 255));
        save_Mariott.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/savee.png"))); // NOI18N
        save_Mariott.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save_Mariott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_MariottActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_marriott1Layout = new javax.swing.GroupLayout(panel_marriott1);
        panel_marriott1.setLayout(panel_marriott1Layout);
        panel_marriott1Layout.setHorizontalGroup(
            panel_marriott1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_marriott1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_mariott1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panel_marriott1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(directions_marriott1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contact_mariott, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(save_Mariott, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        panel_marriott1Layout.setVerticalGroup(
            panel_marriott1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_marriott1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_mariott1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_marriott1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directions_marriott1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contact_mariott, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_Mariott, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_ktmboutique1.setBackground(new java.awt.Color(204, 204, 204));
        panel_ktmboutique1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KATHMANDU BOUTIQUE HOTEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12))); // NOI18N

        img_boutique1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ktmboutique.jpg"))); // NOI18N
        img_boutique1.setText("jLabel1");
        img_boutique1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contact_boutique1.setBackground(new java.awt.Color(255, 255, 255));
        contact_boutique1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_boutique1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contact_boutique1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_boutique1contact_boutiqueActionPerformed(evt);
            }
        });

        directions_boutique.setBackground(new java.awt.Color(255, 255, 255));
        directions_boutique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_boutique.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        directions_boutique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_boutiqueActionPerformed(evt);
            }
        });

        save_Boutique.setBackground(new java.awt.Color(255, 255, 255));
        save_Boutique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/savee.png"))); // NOI18N
        save_Boutique.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save_Boutique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_BoutiqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ktmboutique1Layout = new javax.swing.GroupLayout(panel_ktmboutique1);
        panel_ktmboutique1.setLayout(panel_ktmboutique1Layout);
        panel_ktmboutique1Layout.setHorizontalGroup(
            panel_ktmboutique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ktmboutique1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ktmboutique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ktmboutique1Layout.createSequentialGroup()
                        .addComponent(img_boutique1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_ktmboutique1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(directions_boutique, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(contact_boutique1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save_Boutique, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        panel_ktmboutique1Layout.setVerticalGroup(
            panel_ktmboutique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ktmboutique1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_boutique1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ktmboutique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contact_boutique1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(directions_boutique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_Boutique, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_mulberry2.setBackground(new java.awt.Color(204, 204, 204));
        panel_mulberry2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MULBERRY HOTEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12))); // NOI18N

        img_mulberry2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mulberry.jpg"))); // NOI18N
        img_mulberry2.setText("jLabel2");
        img_mulberry2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contact_mulberry2.setBackground(new java.awt.Color(255, 255, 255));
        contact_mulberry2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_mulberry2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contact_mulberry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_mulberry2ActionPerformed(evt);
            }
        });

        directions_mulberry2.setBackground(new java.awt.Color(255, 255, 255));
        directions_mulberry2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_mulberry2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        directions_mulberry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_mulberry2ActionPerformed(evt);
            }
        });

        save_Mulberry.setBackground(new java.awt.Color(255, 255, 255));
        save_Mulberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/savee.png"))); // NOI18N
        save_Mulberry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save_Mulberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_MulberryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_mulberry2Layout = new javax.swing.GroupLayout(panel_mulberry2);
        panel_mulberry2.setLayout(panel_mulberry2Layout);
        panel_mulberry2Layout.setHorizontalGroup(
            panel_mulberry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mulberry2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_mulberry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_mulberry2Layout.createSequentialGroup()
                        .addComponent(img_mulberry2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_mulberry2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(directions_mulberry2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contact_mulberry2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(save_Mulberry, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        panel_mulberry2Layout.setVerticalGroup(
            panel_mulberry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mulberry2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_mulberry2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mulberry2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directions_mulberry2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(contact_mulberry2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_Mulberry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_shanker2.setBackground(new java.awt.Color(204, 204, 204));
        panel_shanker2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HOTEL SHANKER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12))); // NOI18N

        img_shanker2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotelshanker.jpg"))); // NOI18N
        img_shanker2.setText("jLabel3");
        img_shanker2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contact_shanker2.setBackground(new java.awt.Color(255, 255, 255));
        contact_shanker2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_shanker2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contact_shanker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_shanker2ActionPerformed(evt);
            }
        });

        directions_shanker2.setBackground(new java.awt.Color(255, 255, 255));
        directions_shanker2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_shanker2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        directions_shanker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_shanker2ActionPerformed(evt);
            }
        });

        save_Shanker.setBackground(new java.awt.Color(255, 255, 255));
        save_Shanker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/savee.png"))); // NOI18N
        save_Shanker.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panel_shanker2Layout = new javax.swing.GroupLayout(panel_shanker2);
        panel_shanker2.setLayout(panel_shanker2Layout);
        panel_shanker2Layout.setHorizontalGroup(
            panel_shanker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shanker2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(directions_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contact_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(save_Shanker, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_shanker2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panel_shanker2Layout.setVerticalGroup(
            panel_shanker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shanker2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_shanker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directions_shanker2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(contact_shanker2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_Shanker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout designPaneLayout = new javax.swing.GroupLayout(designPane);
        designPane.setLayout(designPaneLayout);
        designPaneLayout.setHorizontalGroup(
            designPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designPaneLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(designPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_mulberry2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_marriott1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(designPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(designPaneLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(panel_ktmboutique1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(designPaneLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(panel_shanker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        designPaneLayout.setVerticalGroup(
            designPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(designPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_ktmboutique1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_marriott1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(designPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_mulberry2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(designPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(designPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void directions_marriott1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_marriott1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://google.com/maps/dir/27.7179392,85.3446312/marriott+kathmandu/@27.7150685,85.3255871,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb190f430461db:0x9bf0669a1f62b934!2m2!1d85.3239387!2d27.7130926?hl=en").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_marriott1ActionPerformed

    private void contact_mulberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_mulberryActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("http://www.mulberrynepal.com/contact-us/").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_mulberryActionPerformed

    private void directions_mulberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_mulberryActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/Hotel+Mulberry,+Jyatha+Galli,+Kathmandu/@27.7177627,85.3196827,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb18fd8c5c03ed:0x560379d6ad5bc91d!2m2!1d85.3132375!2d27.7126449").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_mulberryActionPerformed

    private void contact_shankerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_shankerActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.shankerhotel.com.np/contact-page").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_shankerActionPerformed

    private void directions_shankerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_shankerActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/Hotel+Shanker+Kathmandu,+Kathmandu/@27.7193521,85.3221907,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb191b68aa7bc3:0x295bea250f832f8d!2m2!1d85.3194684!2d27.7188945").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_shankerActionPerformed

    private void contact_mulberry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_mulberry1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("http://www.mulberrynepal.com/contact-us/").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_mulberry1ActionPerformed

    private void directions_mulberry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_mulberry1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/Hotel+Mulberry,+Jyatha+Galli,+Kathmandu/@27.7177627,85.3196827,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb18fd8c5c03ed:0x560379d6ad5bc91d!2m2!1d85.3132375!2d27.7126449").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_mulberry1ActionPerformed

    private void contact_shanker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_shanker1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.shankerhotel.com.np/contact-page").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_shanker1ActionPerformed

    private void directions_shanker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_shanker1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/Hotel+Shanker+Kathmandu,+Kathmandu/@27.7193521,85.3221907,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb191b68aa7bc3:0x295bea250f832f8d!2m2!1d85.3194684!2d27.7188945").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_shanker1ActionPerformed

    private void contact_mulberry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_mulberry2ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("http://www.mulberrynepal.com/contact-us/").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_mulberry2ActionPerformed

    private void directions_mulberry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_mulberry2ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/Hotel+Mulberry,+Jyatha+Galli,+Kathmandu/@27.7177627,85.3196827,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb18fd8c5c03ed:0x560379d6ad5bc91d!2m2!1d85.3132375!2d27.7126449").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_mulberry2ActionPerformed

    private void contact_shanker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_shanker2ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.shankerhotel.com.np/contact-page").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_shanker2ActionPerformed

    private void directions_shanker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_shanker2ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/Hotel+Shanker+Kathmandu,+Kathmandu/@27.7193521,85.3221907,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb191b68aa7bc3:0x295bea250f832f8d!2m2!1d85.3194684!2d27.7188945").toURI());     
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_shanker2ActionPerformed

    private void contact_mariottcontact_boutiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_mariottcontact_boutiqueActionPerformed
    try{
            Desktop.getDesktop().browse(new URL("https://www.marriott.com/hotels/travel/ktmmc-kathmandu-marriott-hotel/").toURI());
        }
        catch(Exception e){}    }//GEN-LAST:event_contact_mariottcontact_boutiqueActionPerformed

    private void contact_boutique1contact_boutiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_boutique1contact_boutiqueActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.kathmanduboutiquehotel.com/").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_boutique1contact_boutiqueActionPerformed

    private void directions_boutiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_boutiqueActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/kathmandu+boutique+hotel/@27.7127867,85.3086803,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb18fbf85b5015:0x67b5d6aa5fd77def!2m2!1d85.3079041!2d27.7101891").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_boutiqueActionPerformed

    private void save_MariottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_MariottActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_MariottActionPerformed

    private void save_BoutiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_BoutiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_BoutiqueActionPerformed

    private void save_MulberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_MulberryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_MulberryActionPerformed

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
            java.util.logging.Logger.getLogger(Hotel_meaven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hotel_meaven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hotel_meaven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hotel_meaven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hotel_meaven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contact_boutique1;
    private javax.swing.JButton contact_mariott;
    private javax.swing.JButton contact_mulberry;
    private javax.swing.JButton contact_mulberry1;
    private javax.swing.JButton contact_mulberry2;
    private javax.swing.JButton contact_shanker;
    private javax.swing.JButton contact_shanker1;
    private javax.swing.JButton contact_shanker2;
    private javax.swing.JPanel designPane;
    private javax.swing.JButton directions_boutique;
    private javax.swing.JButton directions_marriott1;
    private javax.swing.JButton directions_mulberry;
    private javax.swing.JButton directions_mulberry1;
    private javax.swing.JButton directions_mulberry2;
    private javax.swing.JButton directions_shanker;
    private javax.swing.JButton directions_shanker1;
    private javax.swing.JButton directions_shanker2;
    private javax.swing.JLabel img_boutique1;
    private javax.swing.JLabel img_mariott1;
    private javax.swing.JLabel img_mulberry;
    private javax.swing.JLabel img_mulberry1;
    private javax.swing.JLabel img_mulberry2;
    private javax.swing.JLabel img_shanker;
    private javax.swing.JLabel img_shanker1;
    private javax.swing.JLabel img_shanker2;
    private javax.swing.JPanel panel_ktmboutique1;
    private javax.swing.JPanel panel_marriott1;
    private javax.swing.JPanel panel_mulberry;
    private javax.swing.JPanel panel_mulberry1;
    private javax.swing.JPanel panel_mulberry2;
    private javax.swing.JPanel panel_shanker;
    private javax.swing.JPanel panel_shanker1;
    private javax.swing.JPanel panel_shanker2;
    private javax.swing.JButton save_Boutique;
    private javax.swing.JButton save_Mariott;
    private javax.swing.JButton save_Mulberry;
    private javax.swing.JButton save_Shanker;
    private javax.swing.JLabel title_mulberry;
    private javax.swing.JLabel title_mulberry1;
    private javax.swing.JLabel title_shanker;
    private javax.swing.JLabel title_shanker1;
    // End of variables declaration//GEN-END:variables
}
