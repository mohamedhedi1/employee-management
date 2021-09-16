package entities;

public class Departement {
private int numd;
private String nomd;
private String directeurd;
private String teld;
private int faxd;
private String emaild;
@Override
public String toString() {
	return "Departement [nomd=" + nomd + ", directeurd=" + directeurd + ", teld=" + teld + ", faxd=" + faxd
			+ ", emaild=" + emaild + "]";
}
public String getNomd() {
	return nomd;
}
public void setNomd(String nomd) {
	this.nomd = nomd;
}
public String getDirecteurd() {
	return directeurd;
}
public void setDirecteurd(String directeurd) {
	this.directeurd = directeurd;
}
public String getTeld() {
	return teld;
}
public void setTeld(String teld) {
	this.teld = teld;
}
public int getFaxd() {
	return faxd;
}
public void setFaxd(int faxd) {
	this.faxd = faxd;
}
public String getEmaild() {
	return emaild;
}
public void setEmaild(String emaild) {
	this.emaild = emaild;
}

public int getNumd() {
	return numd;
}
public void setNumd(int numd) {
	this.numd = numd;
}
public Departement(String nomd, String directeurd, String teld, int faxd, String emaild) {
	super();
	this.nomd = nomd;
	this.directeurd = directeurd;
	this.teld = teld;
	this.faxd = faxd;
	this.emaild = emaild;
}
public Departement(int numd, String nomd, String directeurd, String teld, int faxd, String emaild) {
	super();
	this.numd = numd;
	this.nomd = nomd;
	this.directeurd = directeurd;
	this.teld = teld;
	this.faxd = faxd;
	this.emaild = emaild;
}
public Departement() {
	super();
}

}
