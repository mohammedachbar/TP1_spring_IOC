package com.formation.spring.utils;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class ConexionBD {
	public java.sql.Connection con;
	
	public void connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_Spring_Biblio","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void disconnect() {
        if (con != null) {
            try {
                con.close();
                con = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	 
	public ResultSet select(String req) {
		PreparedStatement stmt = null;
		ResultSet result=null ;
		try {
			stmt = (PreparedStatement) con.prepareStatement(req);
			result = stmt.executeQuery();
		} 
		catch (SQLException ex) {
	    }

		return result;	
		
		
		}

		
	
	
}
