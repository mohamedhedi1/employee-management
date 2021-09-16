package dao;

import entities.Administrateur;

public interface IadminDao {
public boolean login(Administrateur ad);
public Administrateur profile(Administrateur ad);
}
