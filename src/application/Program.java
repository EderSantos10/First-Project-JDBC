package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DB.getConnection();
			
			ps = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "id = ?");
			
			ps.setInt(1, 5);
					
			
			int rowsAffect = ps.executeUpdate();
			
			System.out.println("Done!  Rows affected: " + rowsAffect);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
		
	}
}
