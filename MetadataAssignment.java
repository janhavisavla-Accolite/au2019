package com.accolite.au.java;

import java.sql.*;  
public class MetadataAssignment{  
public static void main(String args[]){  
try{  

Class.forName("com.mysql.jdbc.Driver");  
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookdatabase?useSSL=false", "root", "root");  
DatabaseMetaData dbmd=con.getMetaData();  
  
System.out.println("Driver Name: "+dbmd.getDriverName());  
System.out.println("Driver Version: "+dbmd.getDriverVersion());  
System.out.println("UserName: "+dbmd.getUserName());  
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion()); 

String table[]={"TABLE"};  
ResultSet rs=dbmd.getTables(null,null,null,table);  
  
while(rs.next()){  
System.out.println(rs.getString(1));  
}  

Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?useSSL=false", "root", "root");  
DatabaseMetaData dbmd2=con2.getMetaData();  
  
System.out.println("Driver Name: "+dbmd2.getDriverName());  
System.out.println("Driver Version: "+dbmd2.getDriverVersion());  
System.out.println("UserName: "+dbmd2.getUserName());  
System.out.println("Database Product Name: "+dbmd2.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd2.getDatabaseProductVersion()); 

ResultSet rs2=dbmd2.getTables(null,null,null,table);  
  
while(rs2.next()){  
System.out.println(rs2.getString(1));  
}  
  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  