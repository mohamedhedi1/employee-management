package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.SingletonConnection;
import entities.Avance;



public class AvanceDaoImp {
	public boolean AddAvance(Avance av)
	{
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("INSERT INTO avance(mois,montant,nume,acceptationa) values(?,?,?,?)");
		
		ps.setString(1, av.getMois());
		ps.setFloat(2,av.getMontant());
		ps.setString(3, av.getNume());
		ps.setInt(4, av.getAcceptationa());

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
	
	public List<Avance> ListAvanceByAcceptation(int acc) {
		List<Avance> listemploye= new ArrayList<Avance>();
		 Connection conn=SingletonConnection.getConnection();
		 try {
		PreparedStatement ps= conn.prepareStatement("select mois, montant, nume, acceptationa from avance where acceptationa=?");
		ps.setInt(1, acc);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		Avance con=new Avance();
		con.setMois(rs.getString("mois"));
		con.setMontant(rs.getFloat("montant"));
		con.setNume(rs.getString("nume"));
		con.setAcceptationa(rs.getInt("acceptationa"));
		
		listemploye.add(con);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return listemploye;
	}
	
	public boolean EditAvance(Avance con,int acc) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("update avance set acceptationa=? where numa=? ");
		
		ps.setInt(1, acc);
		ps.setInt(2,con.getNuma() );
		
		
		
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
	
	
	public List<Avance> ListAvanceByAcceptationEmp(int acc,String nom) {
		List<Avance> listemploye= new ArrayList<Avance>();
		 Connection conn=SingletonConnection.getConnection();
		 try {
		PreparedStatement ps= conn.prepareStatement("select mois, montant, nume, acceptationa from avance where acceptationa=? and nume=?");
		ps.setInt(1, acc);
		ps.setString(2, nom);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		Avance con=new Avance();
		con.setMois(rs.getString("mois"));
		con.setMontant(rs.getFloat("montant"));
		con.setNume(rs.getString("nume"));
		con.setAcceptationa(rs.getInt("acceptationa"));
		
		listemploye.add(con);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return listemploye;
	}
	
	
}
