package view;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Restaurant = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Homepanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Hotel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Hospitals = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Shopping = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Maps = new javax.swing.JPanel();
        Heritage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        JDesktopPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        panel_lod = new javax.swing.JPanel();
        img_boutique2 = new javax.swing.JLabel();
        contact_lod = new javax.swing.JButton();
        directions_lod = new javax.swing.JButton();
        panel_platinum = new javax.swing.JPanel();
        img_annapurna1 = new javax.swing.JLabel();
        directions_platinum = new javax.swing.JButton();
        contact_platinum = new javax.swing.JButton();
        panel_marriott1 = new javax.swing.JPanel();
        img_mariott1 = new javax.swing.JLabel();
        directions_marriott1 = new javax.swing.JButton();
        contact_mariott = new javax.swing.JButton();
        save_Mariott = new javax.swing.JButton();
        panel_shanker2 = new javax.swing.JPanel();
        img_shanker2 = new javax.swing.JLabel();
        contact_shanker2 = new javax.swing.JButton();
        directions_shanker2 = new javax.swing.JButton();
        save_Shanker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("City Guide");

        Restaurant.setBackground(new java.awt.Color(250, 250, 250));
        Restaurant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestaurantMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RestaurantMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RestaurantMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurant.png"))); // NOI18N
        jLabel4.setText("Restaurant");

        javax.swing.GroupLayout RestaurantLayout = new javax.swing.GroupLayout(Restaurant);
        Restaurant.setLayout(RestaurantLayout);
        RestaurantLayout.setHorizontalGroup(
            RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestaurantLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        RestaurantLayout.setVerticalGroup(
            RestaurantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestaurantLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Homepanel.setBackground(new java.awt.Color(250, 250, 250));
        Homepanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Homepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomepanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomepanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomepanelMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        jLabel5.setText("Home");

        javax.swing.GroupLayout HomepanelLayout = new javax.swing.GroupLayout(Homepanel);
        Homepanel.setLayout(HomepanelLayout);
        HomepanelLayout.setHorizontalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomepanelLayout.setVerticalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Restaurant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Homepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(Homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Restaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        Hotel.setBackground(new java.awt.Color(250, 250, 250));
        Hotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HotelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HotelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HotelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotel.png"))); // NOI18N
        jLabel6.setText("Hotel/Lodges");

        javax.swing.GroupLayout HotelLayout = new javax.swing.GroupLayout(Hotel);
        Hotel.setLayout(HotelLayout);
        HotelLayout.setHorizontalGroup(
            HotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HotelLayout.setVerticalGroup(
            HotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Hospitals.setBackground(new java.awt.Color(250, 250, 250));
        Hospitals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HospitalsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HospitalsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HospitalsMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medical.png"))); // NOI18N
        jLabel8.setText("Hospitals");

        javax.swing.GroupLayout HospitalsLayout = new javax.swing.GroupLayout(Hospitals);
        Hospitals.setLayout(HospitalsLayout);
        HospitalsLayout.setHorizontalGroup(
            HospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalsLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HospitalsLayout.setVerticalGroup(
            HospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Shopping.setBackground(new java.awt.Color(250, 250, 250));
        Shopping.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShoppingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShoppingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShoppingMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping-bag.png"))); // NOI18N
        jLabel10.setText("Shopping");

        javax.swing.GroupLayout ShoppingLayout = new javax.swing.GroupLayout(Shopping);
        Shopping.setLayout(ShoppingLayout);
        ShoppingLayout.setHorizontalGroup(
            ShoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ShoppingLayout.setVerticalGroup(
            ShoppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Maps.setBackground(new java.awt.Color(250, 250, 250));
        Maps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MapsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MapsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MapsMouseExited(evt);
            }
        });

        Heritage.setBackground(new java.awt.Color(250, 250, 250));
        Heritage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeritageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HeritageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HeritageMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/museum-art.png"))); // NOI18N
        jLabel2.setText("Heritage/Culture");

        javax.swing.GroupLayout HeritageLayout = new javax.swing.GroupLayout(Heritage);
        Heritage.setLayout(HeritageLayout);
        HeritageLayout.setHorizontalGroup(
            HeritageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeritageLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeritageLayout.setVerticalGroup(
            HeritageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeritageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MapsLayout = new javax.swing.GroupLayout(Maps);
        Maps.setLayout(MapsLayout);
        MapsLayout.setHorizontalGroup(
            MapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heritage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MapsLayout.setVerticalGroup(
            MapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MapsLayout.createSequentialGroup()
                .addComponent(Heritage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Hotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Shopping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Maps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Hospitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Hospitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Shopping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Maps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));
        JDesktopPanel.setToolTipText("");
        JDesktopPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel9.setText("Trending Places ");

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(null);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_lod.setBackground(new java.awt.Color(255, 245, 238));
        panel_lod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LORD OF THE DRINKS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12))); // NOI18N

        img_boutique2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/l_o_d.jpg"))); // NOI18N
        img_boutique2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contact_lod.setBackground(new java.awt.Color(255, 255, 255));
        contact_lod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_lod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contact_lod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_lodcontact_boutiqueActionPerformed(evt);
            }
        });

        directions_lod.setBackground(new java.awt.Color(255, 255, 255));
        directions_lod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_lod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        directions_lod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_lodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_lodLayout = new javax.swing.GroupLayout(panel_lod);
        panel_lod.setLayout(panel_lodLayout);
        panel_lodLayout.setHorizontalGroup(
            panel_lodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_lodLayout.createSequentialGroup()
                .addComponent(directions_lod)
                .addGap(37, 37, 37)
                .addComponent(contact_lod)
                .addGap(204, 204, 204))
            .addComponent(img_boutique2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel_lodLayout.setVerticalGroup(
            panel_lodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_boutique2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_lodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_lodLayout.createSequentialGroup()
                        .addComponent(directions_lod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(panel_lodLayout.createSequentialGroup()
                        .addComponent(contact_lod)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panel_platinum.setBackground(new java.awt.Color(255, 245, 238));
        panel_platinum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLUB PLATINUM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 12))); // NOI18N

        img_annapurna1.setBackground(new java.awt.Color(255, 245, 238));
        img_annapurna1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/platinum_.jpg"))); // NOI18N
        img_annapurna1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        directions_platinum.setBackground(new java.awt.Color(255, 255, 255));
        directions_platinum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map.png"))); // NOI18N
        directions_platinum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        directions_platinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directions_platinumActionPerformed(evt);
            }
        });

        contact_platinum.setBackground(new java.awt.Color(255, 255, 255));
        contact_platinum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contactlogo.png"))); // NOI18N
        contact_platinum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contact_platinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_platinumcontact_boutiqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_platinumLayout = new javax.swing.GroupLayout(panel_platinum);
        panel_platinum.setLayout(panel_platinumLayout);
        panel_platinumLayout.setHorizontalGroup(
            panel_platinumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_platinumLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(directions_platinum)
                .addGap(32, 32, 32)
                .addComponent(contact_platinum)
                .addGap(212, 212, 212))
            .addGroup(panel_platinumLayout.createSequentialGroup()
                .addComponent(img_annapurna1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_platinumLayout.setVerticalGroup(
            panel_platinumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_platinumLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(img_annapurna1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_platinumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(directions_platinum)
                    .addComponent(contact_platinum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_marriott1.setBackground(new java.awt.Color(255, 245, 238));
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
            .addGroup(panel_marriott1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(directions_marriott1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contact_mariott, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(save_Mariott, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(panel_marriott1Layout.createSequentialGroup()
                .addComponent(img_mariott1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        panel_shanker2.setBackground(new java.awt.Color(255, 245, 238));
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
        save_Shanker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ShankerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_shanker2Layout = new javax.swing.GroupLayout(panel_shanker2);
        panel_shanker2.setLayout(panel_shanker2Layout);
        panel_shanker2Layout.setHorizontalGroup(
            panel_shanker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shanker2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(directions_shanker2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contact_shanker2)
                .addGap(118, 118, 118)
                .addComponent(save_Shanker)
                .addGap(78, 78, 78))
            .addGroup(panel_shanker2Layout.createSequentialGroup()
                .addComponent(img_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        panel_shanker2Layout.setVerticalGroup(
            panel_shanker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_shanker2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_shanker2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(contact_shanker2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_Shanker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(directions_shanker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JDesktopPanelLayout = new javax.swing.GroupLayout(JDesktopPanel);
        JDesktopPanel.setLayout(JDesktopPanelLayout);
        JDesktopPanelLayout.setHorizontalGroup(
            JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPanelLayout.createSequentialGroup()
                .addGroup(JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDesktopPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panel_marriott1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JDesktopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(JDesktopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_lod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_platinum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 80, Short.MAX_VALUE))
            .addGroup(JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JDesktopPanelLayout.createSequentialGroup()
                    .addGap(0, 528, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 528, Short.MAX_VALUE)))
        );
        JDesktopPanelLayout.setVerticalGroup(
            JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDesktopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addGroup(JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_platinum, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_lod, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_marriott1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_shanker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(JDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JDesktopPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JDesktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MapsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapsMouseExited
       ;
    }//GEN-LAST:event_MapsMouseExited

    private void MapsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapsMouseEntered
       
    }//GEN-LAST:event_MapsMouseEntered

    private void MapsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapsMouseClicked
       
    }//GEN-LAST:event_MapsMouseClicked

    private void ShoppingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShoppingMouseExited
        resetColor(Shopping);
    }//GEN-LAST:event_ShoppingMouseExited

    private void ShoppingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShoppingMouseEntered
        setColor(Shopping);
    }//GEN-LAST:event_ShoppingMouseEntered

    private void ShoppingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShoppingMouseClicked
        Shopping shopping1 = new Shopping();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(shopping1).setVisible(true);
    }//GEN-LAST:event_ShoppingMouseClicked

    private void HospitalsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospitalsMouseExited
        resetColor(Hospitals);
    }//GEN-LAST:event_HospitalsMouseExited

    private void HospitalsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospitalsMouseEntered
        setColor(Hospitals);
    }//GEN-LAST:event_HospitalsMouseEntered

    private void HospitalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospitalsMouseClicked
      Hospitals hospital1 = new Hospitals();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(hospital1).setVisible(true);
    }//GEN-LAST:event_HospitalsMouseClicked

    private void HotelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HotelMouseExited
        resetColor(Hotel);
    }//GEN-LAST:event_HotelMouseExited

    private void HotelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HotelMouseEntered
        setColor(Hotel);
    }//GEN-LAST:event_HotelMouseEntered

    private void HotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HotelMouseClicked
        Hotel hotel1 = new Hotel();
        JDesktopPanel.removeAll();
        JDesktopPanel.add(hotel1).setVisible(true);
    }//GEN-LAST:event_HotelMouseClicked

    private void RestaurantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaurantMouseExited
        resetColor(Restaurant);
    }//GEN-LAST:event_RestaurantMouseExited

    private void RestaurantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaurantMouseEntered
        setColor(Restaurant);
    }//GEN-LAST:event_RestaurantMouseEntered

    private void RestaurantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaurantMouseClicked
       Restaurant restaurant1 = new Restaurant();
       JDesktopPanel.removeAll();
       JDesktopPanel.add(restaurant1).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_RestaurantMouseClicked

    private void HeritageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeritageMouseExited
        resetColor(Heritage);
    }//GEN-LAST:event_HeritageMouseExited

    private void HeritageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeritageMouseEntered
        setColor(Heritage);
    }//GEN-LAST:event_HeritageMouseEntered

    private void HeritageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeritageMouseClicked
       HeritageHomepage heritage = new HeritageHomepage();
       JDesktopPanel.removeAll();
       JDesktopPanel.add(heritage).setVisible(true); 
    }//GEN-LAST:event_HeritageMouseClicked

    private void HomepanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomepanelMouseEntered
        setColor(Homepanel);
    }//GEN-LAST:event_HomepanelMouseEntered

    private void HomepanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomepanelMouseExited
        resetColor(Homepanel);
    }//GEN-LAST:event_HomepanelMouseExited

    private void HomepanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomepanelMouseClicked
        Home home1 = new Home();
       JDesktopPanel.removeAll();
       JDesktopPanel.add(home1).setVisible(true); 
    }//GEN-LAST:event_HomepanelMouseClicked

    private void contact_lodcontact_boutiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_lodcontact_boutiqueActionPerformed
        new LodDetails().setVisible(true);
    }//GEN-LAST:event_contact_lodcontact_boutiqueActionPerformed

    private void directions_lodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_lodActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir/27.7179392,85.3446312/kathmandu+boutique+hotel/@27.7127867,85.3086803,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb18fbf85b5015:0x67b5d6aa5fd77def!2m2!1d85.3079041!2d27.7101891").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_lodActionPerformed

    private void directions_platinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_platinumActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.google.com/maps/dir//Club+Platinum,+Teendhara+Marg,+Kathmandu+44600/@27.7096768,85.3167578,17z/data=!4m8!4m7!1m0!1m5!1m1!1s0x39eb19f5904ae5c3:0x106efc1a81bf9353!2m2!1d85.3189507!2d27.7098354").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_platinumActionPerformed

    private void contact_platinumcontact_boutiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_platinumcontact_boutiqueActionPerformed
        new PlatinumDetails().setVisible(true);
    }//GEN-LAST:event_contact_platinumcontact_boutiqueActionPerformed

    private void directions_marriott1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directions_marriott1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://google.com/maps/dir/27.7179392,85.3446312/marriott+kathmandu/@27.7150685,85.3255871,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x39eb190f430461db:0x9bf0669a1f62b934!2m2!1d85.3239387!2d27.7130926?hl=en").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_directions_marriott1ActionPerformed

    private void contact_mariottcontact_boutiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_mariottcontact_boutiqueActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.marriott.com/hotels/travel/ktmmc-kathmandu-marriott-hotel/").toURI());
        }
        catch(Exception e){}
    }//GEN-LAST:event_contact_mariottcontact_boutiqueActionPerformed

    private void save_MariottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_MariottActionPerformed
    }//GEN-LAST:event_save_MariottActionPerformed

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

    private void save_ShankerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ShankerActionPerformed
    }//GEN-LAST:event_save_ShankerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to logout?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Logged Out");
            new Login().setVisible(true);
            dispose();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
                setColor(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
                resetColor(jPanel4);

    }//GEN-LAST:event_jPanel4MouseExited
public void setColor(JPanel p){
    p.setBackground(new Color(255,255,255));
}
public void resetColor(JPanel p1){
    p1.setBackground(new Color(250,250,250));
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Heritage;
    private javax.swing.JPanel Homepanel;
    private javax.swing.JPanel Hospitals;
    private javax.swing.JPanel Hotel;
    private javax.swing.JPanel JDesktopPanel;
    private javax.swing.JPanel Maps;
    private javax.swing.JPanel Restaurant;
    private javax.swing.JPanel Shopping;
    private javax.swing.JButton contact_lod;
    private javax.swing.JButton contact_mariott;
    private javax.swing.JButton contact_platinum;
    private javax.swing.JButton contact_shanker2;
    private javax.swing.JButton directions_lod;
    private javax.swing.JButton directions_marriott1;
    private javax.swing.JButton directions_platinum;
    private javax.swing.JButton directions_shanker2;
    private javax.swing.JLabel img_annapurna1;
    private javax.swing.JLabel img_boutique2;
    private javax.swing.JLabel img_mariott1;
    private javax.swing.JLabel img_shanker2;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel_lod;
    private javax.swing.JPanel panel_marriott1;
    private javax.swing.JPanel panel_platinum;
    private javax.swing.JPanel panel_shanker2;
    private javax.swing.JButton save_Mariott;
    private javax.swing.JButton save_Shanker;
    // End of variables declaration//GEN-END:variables
}
