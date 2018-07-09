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
public class employee_update {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/test";
    
    
            public DefaultTableModel getData(String a){
        
        DefaultTableModel dm = new DefaultTableModel();
        
        dm.addColumn("ID");
        dm.addColumn("First Name");
        dm.addColumn("Last Name");
        dm.addColumn("Employee Type");
        dm.addColumn("Address");
        dm.addColumn("Phone");
        dm.addColumn("Salary");
        dm.addColumn("Status");
        
        
        String sql = "SELECT * FROM employee_list";
        
        try{
           
            Connection con= (Connection) DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            
            Statement s =(Statement) con.prepareStatement(sql);
            
            ResultSet rs=s.executeQuery(sql);
            
            
            while(rs.next()){
                
                String id = rs.getString(1);
                String fn = rs.getString(2);
                String ln = rs.getString(3);
                String et = rs.getString(4);
                String ad = rs.getString(5);
                String pn = rs.getString(6);
                String sal = rs.getString(7);
                String st = rs.getString(8);
                
                if( !a.equals("n"))
                {
                    if( a.equals(id)){
               
                        dm.addRow(new String[]{id,fn,ln,et,ad,pn,sal,st});
                    }
                
                }
                
                else 
                {
                    dm.addRow(new String[]{id,fn,ln,et,ad,pn,sal,st});
                }
           
              
            }
            return dm;
            
        }catch( Exception e ){
            System.out.println("problemmm");
            e.printStackTrace();
            
        }
        
        return null;
       
        
    }
    
    
            public boolean add(String FN, String LN, String ET, String AD, String phone, String salary, String status){
        
        
       String sql = "INSERT INTO `employee_list`(`WorkId`, `FirstName`, `LastName`, `EmployeeType`, `Address`, `Phone`, `Salary`, `Status`) VALUES (NULL,'"+FN+"','"+LN+"','"+ET+"','"+AD+"','"+phone+"','"+salary+"','"+status+"')";
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
        
        String sql="DELETE FROM `employee_list` WHERE WorkId='"+id+"'";
        
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
    
       public boolean update(String id, String fn,String ln,String et, String ad, String phn, String sal, String stat){
        
        
        //String sql="UPDATE `meetings` SET `First name`='"+fname+"',`Last name`='"+lname+"',`Membership Type`='"+mtype+"',`discount`='"+dis+"',`card`='"+card+"' WHERE `id`='"+id+"'";
        String sql = "UPDATE `employee_list` SET `FirstName`='"+fn+"',`LastName`='"+ln+"',`EmployeeType`='"+et+"',`Address`='"+ad+"',`Phone`='"+phn+"',`Salary`='"+sal+"',`Status`='"+stat+"' WHERE `WorkId` = '"+id+"'";
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
       
       public boolean update(String id){
                   String sql = "UPDATE `employee_list` SET `Status`='"+"ON DUTY"+"' WHERE `WorkId` = '"+id+"'";

           
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
       public boolean cout(String id){
                   String sql = "UPDATE `employee_list` SET `Status`='"+"OFF DUTY"+"' WHERE `WorkId` = '"+id+"'";

           
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
