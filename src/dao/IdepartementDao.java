package dao;

import java.util.List;

import entities.Departement;




public interface IdepartementDao {
	List<Departement> listdepartement();
	public boolean AddDepartement(Departement dep);
	public boolean DeleteDepartement(int numd);
	public boolean EditDepartement(Departement dep);
}
