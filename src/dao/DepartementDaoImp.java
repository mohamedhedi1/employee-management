package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.SingletonConnection;
import entities.Departement;


public class DepartementDaoImp implements IdepartementDao {

	@Override
	public List<Departement> listdepartement() {
		List<Departement> listdep= new ArrayList<Departement>();
		 Connection conn=SingletonConnection.getConnection();
		 try {
		PreparedStatement ps= conn.prepareStatement("select * from departement");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		Departement dep = new Departement();
		dep.setNumd(rs.getInt("iddepartement"));
		dep.setNomd(rs.getString("nomd"));
		dep.setDirecteurd(rs.getString("directeurd"));
		dep.setTeld(rs.getString("teld"));
		dep.setFaxd(rs.getInt("faxd"));
		dep.setEmaild(rs.getString("emaild"));
		listdep.add(dep);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return listdep;
	}

	@Override
	public boolean AddDepartement(Departement dep) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("INSERT INTO departement(nomd,directeurd,teld,faxd,emaild) values(?,?,?,?,?)");
		ps.setString(1, dep.getNomd());
		ps.setString(2,dep.getDirecteurd());
		ps.setString(3, dep.getTeld());
		ps.setInt(4, dep.getFaxd());
		ps.setString(5, dep.getEmaild());
		
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

	@Override
	public boolean DeleteDepartement(int numd) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("delete from departement where iddepartement=?");
		ps.setInt(1, numd);
		
		
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

	@Override
	public boolean EditDepartement(Departement dep) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("update departement set nomd=? ,directeurd=? ,teld=? ,faxd=? ,emaild=? where iddepartement=? ");
		ps.setString(1, dep.getNomd());
		ps.setString(2,dep.getDirecteurd());
		ps.setString(3, dep.getTeld());
		ps.setInt(4, dep.getFaxd());
		ps.setString(5, dep.getEmaild());
		ps.setInt(6, dep.getNumd());
		
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

}
