/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Acer PC
 */
public class HotelManagement {
    public static int total_cost = 0;
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/test";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected");
        }catch (SQLException e ){
            System.err.println(e);
        }
       
        // TODO code application logic here
        new CoverPage().setVisible(true);
        
    }
   
    
}
