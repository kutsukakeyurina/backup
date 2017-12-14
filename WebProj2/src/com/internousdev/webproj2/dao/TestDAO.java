package com.internousdev.webproj2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj2.dto.LoginDTO;
import com.internousdev.webproj2.util.DBConnector;

public class TestDAO {
	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public int insert(String username, String password) {
		int ret = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		if((this.findByUserName(username))==false){

			String sql = "insert into users(user_name,password) values(?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, username);
				ps.setString(2, password);
				int i = ps.executeUpdate();
				if (i > 0) {
					System.out.println(i + "件登録されました");
					ret = i;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("登録されませんでした。");
			return 0;
		}

		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}


	public boolean findByUserName(String username) {
		boolean ret=false;

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select count(*) as c from users where user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
//				LoginDTO dto = new LoginDTO();
				if((rs.getInt("c")) > 0){
					ret=true;
					System.out.println("同一ユーザーあり");
				}else{
					ret=false;
					System.out.println("同一ユーザーなし");
				}
//				dto.setPassword(rs.getString("password"));
//				loginDTOList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public List<LoginDTO> select(String username, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from users where user_name=? and password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				LoginDTO dto = new LoginDTO();
				dto.setUsername(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				loginDTOList.add(dto);
			}
			if (loginDTOList.size() <= 0) {
				LoginDTO dto = new LoginDTO();
				dto.setUsername("該当なし");
				dto.setPassword("該当なし");
				loginDTOList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loginDTOList;
	}
}
