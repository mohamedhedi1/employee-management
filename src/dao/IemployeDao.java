package dao;

import java.util.List;

import entities.Employe;


public interface IemployeDao {
public boolean login(Employe emp);
public List<Employe> ListEmploye();
public boolean AddEmploye(Employe emp);
public boolean EditEmploye(Employe emp);
public boolean DeleteEmploye(int nume);
}
