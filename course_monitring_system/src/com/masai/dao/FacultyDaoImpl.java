package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.util.DBUtil;

public class FacultyDaoImpl implements FacultyDao {

	@Override
	public String updatePassword(String username) {
		
	        String msg = "password Updatetion failed...";

	        try (Connection con = DBUtil.provideConeection()) {
	            PreparedStatement ps = con.prepareStatement("update faculty set password=? where username=?");

//	            ps.setString(1, password);
	            ps.setString(2, username);

	            ps.executeUpdate();
	            msg = "Password Updated successful...";

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return msg;
	    }

}
