package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.SingletonConnection;
import entities.Conge;


public class CongeDaoImp {
	public boolean AddConge(Conge con)
	{
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("INSERT INTO conge(datedc,datefc,typec,acceptationc,nume) values(?,?,?,?,?)");
		
		ps.setString(1,con.getDatedc());
		ps.setString(2,con.getDatefc());
		ps.setString(3,con.getTypec());
		ps.setInt(4,con.getAcceptationc());
		ps.setString(5,con.getNume());
	
	
		
		int i=ps.executeUpdate();
		if(i==1)
		{
			f=true;
		}
		ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return f;
	}
	
	
	
	public List<Conge> ListCongeByAcceptation(int acc) {
		List<Conge> listemploye= new ArrayList<Conge>();
		 Connection conn=SingletonConnection.getConnection();
		 try {
		PreparedStatement ps= conn.prepareStatement("select numc,datedc,datefc,typec,acceptationc,nume from conge where acceptationc=?");
		ps.setInt(1, acc);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		Conge con=new Conge();
		con.setNumc(rs.getInt("numc"));
		con.setDatedc(rs.getString("datedc"));
		con.setDatefc(rs.getString("datefc"));
		con.setTypec(rs.getString("typec"));
		con.setAcceptationc(rs.getInt("acceptationc"));
		con.setNume(rs.getString("nume"));
		
		listemploye.add(con);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return listemploye;
	}
	
	public boolean EditConge(Conge con,int acc) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("update conge set acceptation=? where numc=? ");
		
		ps.setInt(1, acc);
		ps.setInt(2,con.getNumc() );
		
		
		
		int i=ps.executeUpdate();
		if(i==1)
		{
			f=true;
		}
		ps.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return f;
	}
	public List<Conge> ListCongeByAcceptationEmp(String nom,int acc) {
		List<Conge> listemploye= new ArrayList<Conge>();
		 Connection conn=SingletonConnection.getConnection();
		 try {
		PreparedStatement ps= conn.prepareStatement("select numc,datedc,datefc,typec,acceptationc,nume from conge where acceptationc=? and nume=?");
		ps.setInt(1, acc);
		ps.setString(2, nom);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		Conge con=new Conge();
		con.setNumc(rs.getInt("numc"));
		con.setDatedc(rs.getString("datedc"));
		con.setDatefc(rs.getString("datefc"));
		con.setTypec(rs.getString("typec"));
		con.setAcceptationc(rs.getInt("acceptationc"));
		con.setNume(rs.getString("nume"));
		
		listemploye.add(con);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return listemploye;
	}
	
	
	
	

}
