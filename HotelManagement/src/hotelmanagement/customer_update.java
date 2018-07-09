/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import static hotelmanagement.Dining_Update.CONN_STRING;
import static hotelmanagement.Dining_Update.PASSWORD;
import static hotelmanagement.Dining_Update.USERNAME;
import static hotelmanagement.TOUR_UPDATE.CONN_STRING;
import static hotelmanagement.TOUR_UPDATE.PASSWORD;
import static hotelmanagement.TOUR_UPDATE.USERNAME;
import static hotelmanagement.employee_update.CONN_STRING;
import static hotelmanagement.employee_update.PASSWORD;
import static hotelmanagement.employee_update.USERNAME;
import static hotelmanagement.meeting_update.CONN_STRING;
import static hotelmanagement.meeting_update.PASSWORD;
import static hotelmanagement.meeting_update.USERNAME;
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
public class customer_update {
        public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/test";
    
    
                public DefaultTableModel getData(){
        
        DefaultTableModel dm = new DefaultTableModel();
        
        
        dm.addColumn("Name");
        dm.addColumn("ID");
        dm.addColumn("Password");
        dm.addColumn("MObile NO");
        
        
        
        String sql = "SELECT * FROM customer";
        
        try{
           
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs=s.executeQuery(sql);
            
            
            while(rs.next()){
                
                String id = rs.getString(1);
                String fn = rs.getString(2);
                String mbl = rs.getString(9);
                String pass = rs.getString(10);
                
                
                
                dm.addRow(new String[]{id,fn,mbl,pass});
           
              
            }
            return dm;
            
        }catch( Exception e ){
            System.out.println("problemmm");
            e.printStackTrace();
            
        }
        
        return null;
       
        
    }
                
                    
            public boolean add(String FN, String LN,String agg,String coun,String town,String add,String nid, String mbl, String pass){
        
        
       String sql = "INSERT INTO `customer`(`ID`, `FirstName`, `LastName`, `Age`, `Country`, `Town`, `Address`, `NIDNO`, `MblNO`, `Password`) VALUES (NULL,'"+FN+"','"+LN+"','"+agg+"','"+coun+"','"+town+"','"+add+"','"+nid+"','"+mbl+"','"+pass+"')";
        try{
            System.out.println( "hfh");
            
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            s.execute(sql);
            System.out.println( "hfjfh");
            
            return true;
            
        }catch(Exception e ){
            
            e.printStackTrace();
        }
        
        return false;
        
    }
            
            
                
                    public boolean delete(String id){
        
        String sql="DELETE FROM `customer` WHERE Id='"+id+"'";
        
        try{
            
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            s.execute(sql);
            
            return true;
            
        }catch(Exception e ){
            
            e.printStackTrace();
        }
               
        return false;
    }
                    
public boolean update(String id, String fn,String mbl, String pass){
        
        
        //String sql="UPDATE `meetings` SET `First name`='"+fname+"',`Last name`='"+lname+"',`Membership Type`='"+mtype+"',`discount`='"+dis+"',`card`='"+card+"' WHERE `id`='"+id+"'";
        String sql = "UPDATE `customer` SET `FirstName`='"+fn+"',`MblNO`='"+mbl+"',`Password`='"+pass+"' WHERE `Id` = '"+id+"'";
        try{
            
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            s.execute(sql);
            System.out.println("done");
            
            
            
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
        
    }
    
}
