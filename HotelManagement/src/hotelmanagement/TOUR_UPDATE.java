/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import static hotelmanagement.sign_in.CONN_STRING;
import static hotelmanagement.sign_in.PASSWORD;
import static hotelmanagement.sign_in.USERNAME;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author swapnil
 */
public class TOUR_UPDATE {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/test";
    
    public DefaultTableModel getData(){
        
        DefaultTableModel dm = new DefaultTableModel();
        
        dm.addColumn("IdNo");
        dm.addColumn("CustomerName");
        dm.addColumn("StartDate");
        dm.addColumn("Package");
        
        String sql = "SELECT * FROM tourdetails";
        
        try{
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs=s.executeQuery(sql);
            
            while(rs.next()){
                
                String id = rs.getString(1);
                String cus_name = rs.getString(2);
                String start_date = rs.getString(3);
                String pack = rs.getString(4);
                
                dm.addRow(new String[]{id,cus_name,start_date,pack});
              
            }
            return dm;
            
        }catch( Exception e ){
            e.printStackTrace();
            
        }
        
        return null;
       
        
    }
    
    
    public boolean add(String cus_name,String start_date,String pack){
        
        
       String sql = "INSERT INTO `tourdetails`(`id`, `CustomerName`, `StartDate`, `Package`) VALUES (NULL,'"+cus_name+"','"+start_date+"','"+pack+"')";
        try{
            System.out.println( "hfh");
            
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            s.execute(sql);
            
            return true;
            
        }catch(Exception e ){
            
            e.printStackTrace();
        }
        
        return false;
        
    }
    
    
    
    public boolean delete(String id){
        
        String sql="DELETE FROM tourdetails WHERE id='"+id+"'";
        
        try{
            
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs=s.executeQuery(sql);
            
            return true;
            
        }catch(Exception e ){
            
            e.printStackTrace();
        }
               
        return false;
    }
    
    
    
    
    
    
}
