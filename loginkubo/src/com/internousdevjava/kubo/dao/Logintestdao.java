package com.internousdevjava.kubo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevjava.kubo.util.DBConnector;
import com.mysql.jdbc.Connection;

public class Logintestdao {

	private boolean rel;

	private Connection con;

	private String sql;

	private PreparedStatement ps;

	private ResultSet rs;

	public boolean select(String id, String password) {

		rel = false;

		try {
			con = (Connection) DBConnector.getConnection();

			sql = "SELECT * FROM loginTest WHERE";

			sql += " id = ? AND password = ? ";

			ps = con.prepareStatement(sql);

			ps.setString(1, id);

			ps.setString(2, password);

			rs = ps.executeQuery();

			if (rs.next()) {

				rel = true;
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return rel;
	}
}
