package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.HotelController;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.Hotel;

public class AdmHotel extends javax.swing.JFrame {

    public AdmHotel() {
        initComponents();
        show_hot();
        setResizable(false);
        setTitle("Hotel Detail");
    }
    public ArrayList<Hotel> resList(){
         ArrayList<Hotel> resList = new ArrayList<>();
         try {
//            
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cityguide";
//            // create the connection object
            
            Connection con = DriverManager.getConnection(url,username,password);
            
            String query1 = "SELECT * FROM sanjin_hotel";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Hotel detailhot;
            while(rs.next()){
                detailhot = new Hotel(rs.getInt("rID"),rs.getString("rName"),rs.getString("rLocation"),rs.getString("rPhone"),rs.getString("rEmail"),rs.getString("openTime"));
                resList.add(detailhot);
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
         return resList;
    }
    public void show_hot(){
        ArrayList<Hotel> list = resList();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Rest.getModel();
        Object[] row = new Object[6];
        for(int i =0; i<list.size();i++){
            row[0] = list.get(i).getrID();
            row[1] = list.get(i).getrName();
            row[2] = list.get(i).getrLocation();
            row[3] = list.get(i).getrPhone();
            row[4] = list.get(i).getrEmail();
            row[5] = list.get(i).getopenTime();
            model.addRow(row);
        }
    }
    private void registerHotel(){
        int id = Integer.parseInt(id_ent.getText());
        String name = name_ent.getText();
        String location = location_ent.getText();
        String phone = phone_ent.getText();
        String email = email_ent.getText();
        String open = open_ent.getText();
        
        Hotel detailhot = new Hotel(id,name,location,phone,email,open);
        hotelcontroller = new HotelController();
        int insert = hotelcontroller.registerHotel(detailhot);

        if (insert>0){
            JOptionPane.showMessageDialog(null, "SuccessFully inserted");
            name_ent.setText("");
            location_ent.setText("");
            phone_ent.setText("");
            email_ent.setText("");
            open_ent.setText("");
            id_ent.setText("");
                     
        } 
        else
            JOptionPane.showMessageDialog(null, "Failed to insert");        
    }
    public Connection mySqlConn(){
        Connection con=null;
        Statement st;

        try {
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cityguide?characterEncoding=utf8&useSSL=false&autoReconnect=true",
                    username, password);
            if (con != null) {
                System.out.println("Connected to cityguide Database");
            } else {
                System.out.println("Error connecting Database");
            }
            return con;

            // creating statement object
//            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
    boolean flag = false;
    private boolean checkFields(){
     if(id_ent.getText().equals("")||name_ent.getText().equals("")||location_ent.getText().equals("")||phone_ent.getText().equals("")||email_ent.getText().equals("")||open_ent.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Enter full detail");
         flag=true;     
     }
        return flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email_ent = new javax.swing.JTextField();
        open_ent = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Rest = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_ent = new javax.swing.JTextField();
        name_ent = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        location_ent = new javax.swing.JTextField();
        phone_ent = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jTable_Display_Rest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "location", "phone", "email", "opentime"
            }
        ));
        jScrollPane1.setViewportView(jTable_Display_Rest);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel2.setText("Id : ");

        jLabel3.setText("Name : ");

        jLabel4.setText("Location : ");

        jLabel5.setText("Email : ");

        jLabel6.setText("OpenTime : ");

        jLabel7.setText("Phone : ");

        location_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                location_entActionPerformed(evt);
            }
        });

        jLabel8.setText("Hotel Information");

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(open_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(location_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(202, 202, 202))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(location_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(phone_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(open_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(124, Short.MAX_VALUE)
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addGap(18, 18, 18)
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (evt.getSource().equals(add)) {
            if(!checkFields())
            registerHotel();
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(!checkFields()){
            Connection con= mySqlConn();
            PreparedStatement ps=null;
            String query;

            query = "update  sanjin_hotel set rName = ?,rLocation = ?,rPhone = ?,rEmail = ?,opentime=? where rId = ?; ";
            try {
                ps=con.prepareStatement(query);
                ps.setString(1,name_ent.getText());
                ps.setString(2,location_ent.getText());
                ps.setString(3,phone_ent.getText());
                ps.setString(4,email_ent.getText());
                ps.setString(5,open_ent.getText());
                ps.setInt(6,Integer.parseInt(id_ent.getText().toString()));

                int res=ps.executeUpdate();
                if(res>=1)
                JOptionPane.showMessageDialog(null, res+" Record successfully Updated..");
                else
                JOptionPane.showMessageDialog(null, res+" Record Updation Failed...");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        PreparedStatement ps=null;
        Connection con=mySqlConn();
        String qry="delete from sanjin_hotel where rId=? ; ";
        try{

            ps=con.prepareStatement(qry);
            ps.setInt(1,Integer.parseInt(id_ent.getText().toString()));
            int x=ps.executeUpdate();
            if(x>=1)
            JOptionPane.showMessageDialog(null, x+" Record Deleted from Database...");
            
            else
            JOptionPane.showMessageDialog(null, x+" Record Deleted Failed...");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        id_ent.setText("");
        name_ent.setText("");
        location_ent.setText("");
        phone_ent.setText("");
        email_ent.setText("");
        open_ent.setText("");

    }//GEN-LAST:event_clearActionPerformed

    private void location_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_location_entActionPerformed
    }//GEN-LAST:event_location_entActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AdmHotel().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email_ent;
    public javax.swing.JTextField id_ent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Rest;
    private javax.swing.JTextField location_ent;
    public javax.swing.JTextField name_ent;
    private javax.swing.JTextField open_ent;
    private javax.swing.JTextField phone_ent;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
HotelController hotelcontroller;
    public String getname_ent() {
        return name_ent.getText();
    }
    public String getlocation_ent() {
        return location_ent.getText();
    }
    public String getphone_ent() {
        return phone_ent.getText();
    }
    public String getemail_ent() {
        return email_ent.getText();
    }
    public String getopen_ent() {
        return open_ent.getText();
    }
    public int getid_ent() {
        return Integer.parseInt(id_ent.getText().toString());
    }
}
