package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connexion.SingletonConnection;
import entities.Administrateur;
import entities.Employe;

public class AdminDaoImp implements IadminDao {

	@Override
	public boolean login(Administrateur ad) {
		boolean f=false;
		Connection conn=SingletonConnection.getConnection();
		try {
				String query="select idadministrateur,nomad,prenomad,emailad,motpassead from administrateur where emailad=? and motpassead=?";
				PreparedStatement ps= conn.prepareStatement(query);
				ps.setString(1,ad.getEmailad());
				ps.setString(2, ad.getMotpassead());
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				
					f=true;
				
		}
				catch(Exception e) {
					e.printStackTrace();		
					}
		
		return f;
	}

	@Override
	public Administrateur profile(Administrateur ad) {
		Administrateur user = new Administrateur();
		Connection conn=SingletonConnection.getConnection();
		try {
				String query="select idadministrateur,nomad,prenomad,emailad,motpassead from administrateur where emailad=?";
				
				PreparedStatement ps= conn.prepareStatement(query);
				ps.setString(1, ad.getEmailad());
				
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
				
					user.setIdadministrateur(rs.getInt("idadministrateur"));
					user.setNomad(rs.getString("nomad"));
					user.setPrenomad(rs.getString("prenomad"));
					user.setEmailad(rs.getString("emailad"));
					user.setMotpassead(rs.getString("motpassead"));
					
					
					
					
					
					
				}
				
		}
				catch(Exception e) {
					e.printStackTrace();		
					}
		return user;
	}
	}
	


