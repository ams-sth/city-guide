package database;

import java.sql.*;

public class DbConnection {

    public Connection con;
    Statement st;
    ResultSet rows;
    int val;

    public DbConnection() {
        // register the driver class
        try {
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cityguide?characterEncoding=utf8&useSSL=false&autoReconnect=true",username,password);
                    // "jdbc:mysql://localhost:3306/bhatbhateniDB", username, password);

            if (con != null) {
                System.out.println("Connected to cityguide Database");
            } else {
                System.out.println("Error connecting Database");
            }
            // creating statement object
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // method to insert data using prepared statement
    public int manipulate(PreparedStatement st) {
        try {
            val = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return val;
    }

    // Used for insert, update, delete
    public int manipulate(String query) {
        try {
            val = st.executeUpdate(query);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return val;
    }

    // Used for select
    public ResultSet retrieve(String query) {
        try {
            rows = st.executeQuery(query);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }

    public static void main(String[] args) {
        new DbConnection();
    }
}
