package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.SingletonConnection;
import entities.Employe;



public class EmployeDaoImp implements IemployeDao {

	@Override
	public boolean login(Employe emp) {
		boolean f=false;
		Connection conn=SingletonConnection.getConnection();
		try {
				String query="select nume,nome,prenome,sexe,cine,adre,age,dated,datef,salaire,nomb,iban,numd,positione,email,motpasse,status,tele from employe where email=? and motpasse=?";
				PreparedStatement ps= conn.prepareStatement(query);
				ps.setString(1,emp.getEmail());
				ps.setString(2, emp.getMotpasse());
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				
					f=true;
				
		}
				catch(Exception e) {
					e.printStackTrace();		
					}
		
		return f;
	}
	
	public Employe profile(Employe emp)
	{
		Employe user = new Employe();
		Connection conn=SingletonConnection.getConnection();
		try {
				String query="select nume,nome,prenome,sexe,cine,adre,age,dated,datef,salaire,nomb,iban,numd,positione,email,motpasse,status,tele from employe where email=?";
				
				PreparedStatement ps= conn.prepareStatement(query);
				ps.setString(1, emp.getEmail());
				
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
				
					//user.setImage(rs.getBinaryStream("image"));
					
					user.setNume((rs.getInt("nume")));
					user.setNome(rs.getString("nome"));
					user.setPrenome(rs.getString("prenome"));
					user.setSexe(rs.getString("sexe"));
					user.setCine(rs.getString("cine"));
					user.setAdre(rs.getString("adre"));
					user.setAge(rs.getInt("age"));
					user.setDated(rs.getString("dated"));
					user.setDatef(rs.getString("datef"));
					user.setSalaire(rs.getFloat("salaire"));
					user.setNomb(rs.getString("nomb"));
					user.setIban(rs.getString("iban"));
					user.setNumd(rs.getInt("numd"));
					user.setPositione(rs.getString("positione"));
					user.setEmail(rs.getString("email"));
					user.setMotpasse(rs.getString("motpasse"));
					user.setStatus(rs.getString("status"));
					user.setTele(rs.getString("tele"));
					
					
					
					
				}
				
		}
				catch(Exception e) {
					e.printStackTrace();		
					}
		return user;
	}

	@Override
	public List<Employe> ListEmploye() {
		List<Employe> listemploye= new ArrayList<Employe>();
		 Connection conn=SingletonConnection.getConnection();
		 try {
		PreparedStatement ps= conn.prepareStatement("select nume,nome,prenome,sexe,cine,adre,age,dated,datef,salaire,nomb,iban,numd,positione,email,motpasse,status,tele from employe");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		Employe user = new Employe();
		user.setNume((rs.getInt("nume")));
		user.setNome(rs.getString("nome"));
		user.setPrenome(rs.getString("prenome"));
		user.setSexe(rs.getString("sexe"));
		user.setCine(rs.getString("cine"));
		user.setAdre(rs.getString("adre"));
		user.setAge(rs.getInt("age"));
		user.setDated(rs.getString("dated"));
		user.setDatef(rs.getString("datef"));
		user.setSalaire(rs.getFloat("salaire"));
		user.setNomb(rs.getString("nomb"));
		user.setIban(rs.getString("iban"));
		user.setNumd(rs.getInt("numd"));
		user.setPositione(rs.getString("positione"));
		user.setEmail(rs.getString("email"));
		user.setMotpasse(rs.getString("motpasse"));
		user.setStatus(rs.getString("status"));
		user.setTele(rs.getString("tele"));
		
		listemploye.add(user);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return listemploye;
	}

	@Override
	public boolean AddEmploye(Employe emp) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("INSERT INTO employe(nome,prenome,sexe,cine,adre,age,dated,datef,salaire,nomb,iban,numd,positione,email,motpasse,status,tele) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,emp.getNome());
		ps.setString(2, emp.getPrenome());
		ps.setString(3, emp.getSexe());
		ps.setString(4, emp.getCine());
		ps.setString(5, emp.getAdre());
		ps.setInt(6, emp.getAge());
		ps.setString(7,emp.getDated() );
		ps.setString(8,emp.getDatef() );
		ps.setFloat(9, emp.getSalaire());
		ps.setString(10,emp.getNomb());
		ps.setString(11, emp.getIban());
		ps.setInt(12, emp.getNumd());
		ps.setString(13, emp.getPositione());
		ps.setString(14, emp.getEmail());
		ps.setString(15,emp.getMotpasse() );
		ps.setString(16, emp.getStatus());
		ps.setString(17, emp.getTele());
		
		
	
		
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
	public boolean EditEmploye(Employe emp) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("update employe set nome=?,prenome=?,sexe=?,cine=?,adre=?,age=?,dated=?,datef=?,salaire=?,nomb=?,iban=?,numd=?,positione=?,email=?,motpasse=?,status=?,tele=? where nume=? ");
		ps.setString(1,emp.getNome());
		ps.setString(2, emp.getPrenome());
		ps.setString(3, emp.getSexe());
		ps.setString(4, emp.getCine());
		ps.setString(5, emp.getAdre());
		ps.setInt(6, emp.getAge());
		ps.setString(7,emp.getDated() );
		ps.setString(8,emp.getDatef() );
		ps.setFloat(9, emp.getSalaire());
		ps.setString(10,emp.getNomb());
		ps.setString(11, emp.getIban());
		ps.setInt(12, emp.getNumd());
		ps.setString(13, emp.getPositione());
		ps.setString(14, emp.getEmail());
		ps.setString(15,emp.getMotpasse() );
		ps.setString(16, emp.getStatus());
		ps.setString(17, emp.getTele());
		
		ps.setInt(18,emp.getNume());
		
		
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
	public boolean DeleteEmploye(int nume) {
		Connection conn=SingletonConnection.getConnection();
		boolean f=false;
		 try {
		PreparedStatement ps= conn.prepareStatement("delete from employe where nume=?");
		ps.setInt(1, nume);
		
		
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
