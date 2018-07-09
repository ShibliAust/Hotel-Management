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
public class Spa_Update {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/test";
    
    
            public DefaultTableModel getData(){
        
        DefaultTableModel dm = new DefaultTableModel();
        
        dm.addColumn("IdNo");
        dm.addColumn("CustomerName");
        dm.addColumn("Session");
        dm.addColumn("Persons");
        dm.addColumn("Status");
        
        String sql = "SELECT * FROM spa";
        
        try{
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs=s.executeQuery(sql);
            
            while(rs.next()){
                
                String id = rs.getString(1);
                String cus_name = rs.getString(2);
                String session = rs.getString(3);
                String persons = rs.getString(4);
                String status = rs.getString(5);
                
                dm.addRow(new String[]{id,cus_name,session,persons,status});
              
            }
            return dm;
            
        }catch( Exception e ){
            e.printStackTrace();
            
        }
        
        return null;
       
        
    }
            
                public boolean add(String cus_name,String session,String persons, String status){
        
        
       String sql = "INSERT INTO `spa`(`id`, `CustomerName`, `Session`, `Persons`, `Status`) VALUES (NULL,'"+cus_name+"','"+session+"','"+persons+"','"+status+"')";
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
        
        String sql="DELETE FROM spa WHERE id='"+id+"'";
        
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
            
        
            public String check(String tt){
        
        String sql = "SELECT * FROM spa";
        try{
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs=s.executeQuery(sql);
            
            while(rs.next()){
                
                String status = rs.getString(5);
                String status1 = rs.getString(3);
                System.out.println(status);
                System.out.println(status1);
                if( status.equals("vacant" ) && status1.equals(tt) )
                {
              
                    return rs.getString(1);
                }
                
              
            }
           
            
        }catch( Exception e ){
            e.printStackTrace();
            
        }
        
        
        return "-1";
    }
        
            
            
            public boolean update(String id, String cus_name,String session,String persons, String status){
        
        
        //String sql="UPDATE `meetings` SET `First name`='"+fname+"',`Last name`='"+lname+"',`Membership Type`='"+mtype+"',`discount`='"+dis+"',`card`='"+card+"' WHERE `id`='"+id+"'";
        String sql = "UPDATE `spa` SET `CustomerName`='"+cus_name+"',`Session`='"+session+"',`Persons`='"+persons+"',`Status`='"+status+"' WHERE `id` = '"+id+"'";
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
