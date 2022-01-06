package com.revature.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.revature.util.ConnectionUtil;

public class MakeDatabaseCalls {
	
	private static Logger logger = Logger.getLogger(MakeDatabaseCalls.class);
	
	public static void makeTable(String string) {

		Connection conn = ConnectionUtil.getConnection();

	}

	public static int insert(String string) {

		try {

			Connection conn = ConnectionUtil.getConnection();

			String sql = "CREATE TABLE (? varchar)";

			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, string);
			
			stmt.execute();
			
			
		} catch (SQLException e) {
			logger.error("Unable to make table - SQL exception found");
			e.printStackTrace();
		}

		return -1;
	}

}
