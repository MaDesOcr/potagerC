package model;

public class Aliment {

	String nom;
	int dureePousse;
	int recoltePousse;
	int momentPousse;

	public Aliment(String nom, int dureePousse, int recoltePousse) {
		super();
		this.nom = nom;
		this.dureePousse = dureePousse;
		this.recoltePousse = recoltePousse;
		this.momentPousse = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDureePousse() {
		return dureePousse;
	}

	public void setDureePousse(int dureePousse) {
		this.dureePousse = dureePousse;
	}

	public int getRecoltePousse() {
		return recoltePousse;
	}

	public void setRecoltePousse(int recoltePousse) {
		this.recoltePousse = recoltePousse;
	}

	public int getMomentPousse() {
		return momentPousse;
	}

	public void setMomentPousse(int momentPousse) {
		this.momentPousse = momentPousse;
	}
	
	
	
	
}
