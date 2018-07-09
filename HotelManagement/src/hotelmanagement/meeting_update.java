/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import static hotelmanagement.TOUR_UPDATE.CONN_STRING;
import static hotelmanagement.TOUR_UPDATE.PASSWORD;
import static hotelmanagement.TOUR_UPDATE.USERNAME;
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
public class meeting_update {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/test";
    
        
    public DefaultTableModel getData(String a ){
        
        DefaultTableModel dm = new DefaultTableModel();
        
        dm.addColumn("IdNo");
        dm.addColumn("CustomerName");
        dm.addColumn("Start Time");
        dm.addColumn("End Time");
        dm.addColumn("Place");
        dm.addColumn("Status");
        
        String sql = "SELECT * FROM meetings";
        
        try{
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs=s.executeQuery(sql);
            
            
            while(rs.next()){
              
                
                String id = rs.getString(1);
                String cus_name = rs.getString(2);
                String start = rs.getString(3);
                String end = rs.getString(4);
                String place = rs.getString(5);
                String status = rs.getString(6);
                if( a.equals("check") ){
                if( status.equals("vacant") ){
                    
                
                    dm.addRow(new String[]{id,cus_name,start,end,place,status});
                
                }
                }
                else 
                {
                    dm.addRow(new String[]{id,cus_name,start,end,place,status});
                }
              
            }
            return dm;
            
        }catch( Exception e ){
            e.printStackTrace();
            
        }
        
        return null;
       
        
    }
    
    
    
        public boolean add(String id, String cus_name,String start,String end, String place, String status){
        
        
       String sql = "INSERT INTO `meetings`(`id`, `CustomerName`, `ST`, `ET`, `Place`, `Status`) VALUES (NULL,'"+cus_name+"','"+start+"','"+end+"','"+place+"','"+status+"')";
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
        
        String sql="DELETE FROM meetings WHERE id='"+id+"'";
        
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
    
        
        
        public boolean update(String id, String cus_name,String start,String end, String place, String status){
        
        
        //String sql="UPDATE `meetings` SET `First name`='"+fname+"',`Last name`='"+lname+"',`Membership Type`='"+mtype+"',`discount`='"+dis+"',`card`='"+card+"' WHERE `id`='"+id+"'";
        String sql = "UPDATE `meetings` SET `CustomerName`='"+cus_name+"',`ST`='"+start+"',`ET`='"+end+"',`Place`='"+place+"',`Status`='"+status+"' WHERE `id` = '"+id+"'";
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
