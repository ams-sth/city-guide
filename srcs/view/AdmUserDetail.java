
package view;
import view.*;
import database.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.CustomerController;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.Customer;
import model.Hotel;
import view.AdminDashboard;

public class AdmUserDetail extends javax.swing.JFrame {

    public AdmUserDetail() {
        initComponents();
        show_user();
        setResizable(false);
        setTitle("User Detail");
    }
    public ArrayList<Customer> resList(){
         ArrayList<Customer> resList = new ArrayList<>();
         try {
//            
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cityguide";
//            // create the connection object
            
            Connection con = DriverManager.getConnection(url,username,password);
            
            String query1 = "SELECT * FROM customer";
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Customer customer;
            while(rs.next()){
                customer = new Customer(rs.getInt("custID"),rs.getString("FirstName"),rs.getString("LastName"),rs.getString("Gender").charAt(0),rs.getString("PhoneNo"),rs.getString("Address"),rs.getString("Username"),rs.getString("Email"),rs.getString("Password"),rs.getString("DOB"));
                resList.add(customer);
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
         return resList;
    }
    public void show_user(){
        ArrayList<Customer> list = resList();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Rest.getModel();
        Object[] row = new Object[10];
        for(int i =0; i<list.size();i++){
            row[0] = list.get(i).getCustId();
            row[1] = list.get(i).getFirstName();
            row[2] = list.get(i).getLastName();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getPhoneNo();
            row[5] = list.get(i).getAddress();
            row[6] = list.get(i).getUsername();
            row[7] = list.get(i).getEmail();
            row[8] = list.get(i).getPassword();
            row[9] = list.get(i).getDob();
   

            model.addRow(row);
        }
    }
    private void registerCustomer(){
        int id = Integer.parseInt(id_ent.getText());
        String fname = fname_ent.getText();
        String lname = fname_ent.getText();
        char gender;
        if(male.isSelected())
            gender = 'm';
        else if(female.isSelected())
            gender = 'f';
        else 
            gender ='o';
        String phone = phone_ent.getText();
        String address = address_ent.getText();
        String username = username_ent.getText();
        String email = email_ent.getText();

        String password = password_ent.getText();
        String dob = dob_ent.getText();
       
        
        
         Customer customer = new Customer(id,fname,lname,gender,phone,address,username,email,password,dob);
         customerController = new CustomerController();
         
            int insert = customerController.registerCustomer(customer);

            if (insert>0)
                JOptionPane.showMessageDialog(null, "SuccessFully register");
            else
                JOptionPane.showMessageDialog(null, "Failed to register");
                
            
                     
        
    }
    boolean flag = false;
    private boolean checkFields(){
        
        if(fname_ent.getText().equals("")){
            JOptionPane.showMessageDialog(null,"First Name is empty");
            fname_ent.requestFocus();
            flag = true;
        }else if(lname_ent.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Last Name is empty");
            lname_ent.requestFocus();
            flag = true;
        }
        else if(phone_ent.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Phone Number is empty");
            phone_ent.requestFocus();
            flag = true;}
        
        else if(address_ent.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Address is empty");
            address_ent.requestFocus();
            flag = true;}
        return flag;
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Rest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id_ent = new javax.swing.JTextField();
        fname_ent = new javax.swing.JTextField();
        lname_ent = new javax.swing.JTextField();
        phone_ent = new javax.swing.JTextField();
        address_ent = new javax.swing.JTextField();
        username_ent = new javax.swing.JTextField();
        email_ent = new javax.swing.JTextField();
        password_ent = new javax.swing.JTextField();
        dob_ent = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_Display_Rest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "FirstName", "LastName", "Gender", "Phone", "Address", "Username", "Email", "Password", "DOB"
            }
        ));
        jScrollPane1.setViewportView(jTable_Display_Rest);

        jLabel1.setText("Id : ");

        jLabel2.setText("FirstName : ");

        jLabel3.setText("LastName : ");

        jLabel4.setText("Gender : ");

        jLabel5.setText("PhoneNo : ");

        jLabel6.setText("Address : ");

        jLabel7.setText("UserName :");

        jLabel8.setText("Email : ");

        jLabel9.setText("Password :");

        jLabel10.setText("DOB :");

        id_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_entActionPerformed(evt);
            }
        });

        password_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_entActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        buttonGroup1.add(others);
        others.setText("Others");

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

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(others)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(299, 299, 299))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_ent, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(fname_ent)
                            .addComponent(lname_ent)
                            .addComponent(phone_ent)
                            .addComponent(address_ent)
                            .addComponent(username_ent)
                            .addComponent(email_ent)
                            .addComponent(password_ent)
                            .addComponent(dob_ent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(id_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(fname_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lname_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(male)
                            .addComponent(female)
                            .addComponent(others))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(phone_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(address_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(username_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addGap(18, 18, 18)
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(clear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(email_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refresh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(password_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dob_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_entActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_entActionPerformed

    private void password_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_entActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_entActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if (evt.getSource().equals(add)) {
            if(!checkFields())
            registerCustomer();
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(!checkFields()){
            Connection con= mySqlConn();
            PreparedStatement ps=null;
            String query;

            query = "update  customer set FirstName = ?,LastName = ?,PhoneNo=?,Address=?,UserName=?,Email=?,Password=?,DOB=? where custID = ?; ";
            try {
                ps=con.prepareStatement(query);
                ps.setString(1,fname_ent.getText());
                ps.setString(2,lname_ent.getText());
                ps.setString(3,phone_ent.getText());
                ps.setString(4,address_ent.getText());
                ps.setString(5,username_ent.getText());
                ps.setString(6,email_ent.getText());
                ps.setString(7,password_ent.getText());
                ps.setString(8,dob_ent.getText());
                
                ps.setInt(9,Integer.parseInt(id_ent.getText().toString()));

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
        // TODO add your handling code here:
        PreparedStatement ps=null;
        Connection con=mySqlConn();
        String qry="delete from customer where custID=? ; ";
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

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        id_ent.setText("");
        fname_ent.setText("");
        lname_ent.setText("");
        phone_ent.setText("");
        email_ent.setText("");
        address_ent.setText("");
        password_ent.setText("");
        dob_ent.setText("");
        username_ent.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        new AdmUserDetail().setVisible(true);
        dispose();
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new AdminDashboard().setVisible(true);
                dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmUserDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address_ent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dob_ent;
    private javax.swing.JTextField email_ent;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname_ent;
    private javax.swing.JTextField id_ent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Rest;
    private javax.swing.JTextField lname_ent;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextField password_ent;
    private javax.swing.JTextField phone_ent;
    private javax.swing.JButton refresh;
    private javax.swing.JButton update;
    private javax.swing.JTextField username_ent;
    // End of variables declaration//GEN-END:variables
CustomerController customerController;
}
