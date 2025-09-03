package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.PliDtls;


public class PliDAO {
	
	private Connection conn;

	public PliDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addPli(String name, String course, String status)
	{
		boolean f = false;
		try {
			
			String sql = "INSERT INTO pli(name,course,status) VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, course);
			ps.setString(3, status);
			
			int i = ps.executeUpdate();
			if(i == 1) return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	
	public List<PliDtls> getPli()
	{
		List<PliDtls> list = new ArrayList<PliDtls>();
		PliDtls  t = null;
		
		try {
			
			String sql = "SELECT * FROM pli";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				t = new PliDtls();
				t.setId(rs.getInt(1));
				t.setFname(rs.getString(2));
				t.setCourse(rs.getString(3));
				t.setStatus(rs.getString(4));
				list.add(t);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return list;
	}
	
	public boolean updatePli()
	{
		boolean b = false;
		
		
		return b;
	}
	
	public PliDtls getPliById(int id)
	{
		PliDtls t = null;
		try {
			
			String sql = "SELECT * FROM pli WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				t = new PliDtls();
				t.setId(rs.getInt(1));
				t.setFname(rs.getString(2));
				t.setCourse(rs.getString(3));
				t.setStatus(rs.getString(4));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return t;
	}
	
	public boolean updatePli(PliDtls t)
	{
		
		boolean b = false;
		
		try {
			
			String sql  = "UPDATE pli SET name = ?, course = ? , status = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getFname());
			ps.setString(2, t.getCourse());
			ps.setString(3, t.getStatus());
			ps.setInt(4, t.getId());
			
			
			int i = ps.executeUpdate();
			
			if(i == 1)
			{
				return true;
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return b;
	}
	
	public boolean deletePli(PliDtls t)
	{
		
		boolean b = false;
		
		try {
			
			String sql  = "DELETE FROM pli WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getId());
			
			
			int i = ps.executeUpdate();
			
			if(i == 1)
			{
				return true;
			}
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return b;
	}
	

}
