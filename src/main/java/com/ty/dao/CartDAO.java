package com.ty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.dto.Cart;

public class CartDAO {

	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/jdbcprc";
	String username = "root";
	String password = "root";
	Connection con = null;

	public Cart saveCart(Cart c) {
		String query = "insert into cart values(?,?,?,?,?)";
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, c.getId());
			ps.setString(2, c.getEmail());
			ps.setString(3, c.getPwd());
			ps.setString(4, c.getUsername());
			ps.setString(5, c.getAddress());

			int a = ps.executeUpdate();
			System.out.println("Saved");
			// return c;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return c;
	}

	public Cart updateCart(Cart c) {
		String query = "update cart set username=? where id=?";
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, c.getUsername());
			ps.setInt(2, c.getId());

			int a = ps.executeUpdate();
			System.out.println("Updated");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return c;
	}

	public Cart deleteCart(int id) {
		String query = "delete from cart where id=?";
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, id);

			int a = ps.executeUpdate();
			System.out.println("Deleted");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public Cart getCart(Cart c) {
		String query = "select * from cart where id=?";
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, c.getId());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c.setId(rs.getInt(1));
				c.setEmail(rs.getString(2));
				c.setPwd(rs.getString(3));
				c.setUsername(rs.getString(4));
				c.setAddress(rs.getString(5));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return c;
		}
	}

	public List<Cart> getAllCart() {
		String query = "select * from  product";

		try {
			Class.forName(path);
			con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			List<Cart> l = new ArrayList();
			while (rs.next()) {
				Cart c = new Cart();
				c.setId(rs.getInt(1));
				c.setEmail(rs.getString(2));
				c.setPwd(rs.getString(3));
				c.setUsername(rs.getString(4));
				c.setAddress(rs.getString(5));
				l.add(c);
			}
			return l;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
