package entities;



public class Employe {
private int nume;
private String nome;
private String prenome;
private String sexe;
private String cine;
private String  adre;
private int age;
private String dated;
private String datef;
private float salaire;
private String nomb;
private String iban;
private int numd;
private String positione;
private String email;
private String motpasse;
private String status;
private String tele;
public int getNume() {
	return nume;
}
public void setNume(int nume) {
	this.nume = nume;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPrenome() {
	return prenome;
}
public void setPrenome(String prenome) {
	this.prenome = prenome;
}
public String getCine() {
	return cine;
}
public void setCine(String cine) {
	this.cine = cine;
}
public String getAdre() {
	return adre;
}
public void setAdre(String adre) {
	this.adre = adre;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDated() {
	return dated;
}
public void setDated(String dated) {
	this.dated = dated;
}
public String getDatef() {
	return datef;
}
public void setDatef(String datef) {
	this.datef = datef;
}
public float getSalaire() {
	return salaire;
}
public void setSalaire(float salaire) {
	this.salaire = salaire;
}
public String getNomb() {
	return nomb;
}
public void setNomb(String nomb) {
	this.nomb = nomb;
}
public String getIban() {
	return iban;
}
public void setIban(String iban) {
	this.iban = iban;
}
public int getNumd() {
	return numd;
}
public void setNumd(int numd) {
	this.numd = numd;
}
public String getPositione() {
	return positione;
}
public void setPositione(String positione) {
	this.positione = positione;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getTele() {
	return tele;
}
public void setTele(String tele) {
	this.tele = tele;
}

public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}

public String getMotpasse() {
	return motpasse;
}
public void setMotpasse(String motpasse) {
	this.motpasse = motpasse;
}
public Employe() {
	super();
}
@Override
public String toString() {
	return "Employe [nume=" + nume + ", nome=" + nome + ", prenome=" + prenome + ", sexe=" + sexe + ", cine=" + cine
			+ ", adre=" + adre + ", age=" + age + ", dated=" + dated + ", datef=" + datef + ", salaire=" + salaire
			+ ", nomb=" + nomb + ", iban=" + iban + ", numd=" + numd + ", positione=" + positione + ", email=" + email
			+ ", motpasse=" + motpasse + ", status=" + status + ", tele=" + tele + "]";
}


}
