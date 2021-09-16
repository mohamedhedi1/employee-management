package entities;

public class Administrateur {
private int idadministrateur;
private String nomad;
private String prenomad;
private String emailad;
private String motpassead;
public int getIdadministrateur() {
	return idadministrateur;
}
public void setIdadministrateur(int idadministrateur) {
	this.idadministrateur = idadministrateur;
}
public String getNomad() {
	return nomad;
}
public void setNomad(String nomad) {
	this.nomad = nomad;
}
public String getPrenomad() {
	return prenomad;
}
public void setPrenomad(String prenomad) {
	this.prenomad = prenomad;
}
public String getEmailad() {
	return emailad;
}
public void setEmailad(String emailad) {
	this.emailad = emailad;
}
public String getMotpassead() {
	return motpassead;
}
public void setMotpassead(String motpassead) {
	this.motpassead = motpassead;
}
public Administrateur(int idadministrateur, String nomad, String prenomad, String emailad, String motpassead) {
	super();
	this.idadministrateur = idadministrateur;
	this.nomad = nomad;
	this.prenomad = prenomad;
	this.emailad = emailad;
	this.motpassead = motpassead;
}
public Administrateur() {
	super();
}
@Override
public String toString() {
	return "Administrateur [idadministrateur=" + idadministrateur + ", nomad=" + nomad + ", prenomad=" + prenomad
			+ ", emailad=" + emailad + ", motpassead=" + motpassead + "]";
}

}
