package model;

public class Poireau extends Legume{

	
	
	public Poireau(String nom, int dureePousse, int recoltePousse) {
		super(nom, recoltePousse, recoltePousse);
		
	}
	
	@Override
	public String toString() {
		return "Poireau [dureePousse=" + dureePousse + ", recoltePousse=" + recoltePousse + ", nom=" + nom + "]";
	}
	
	
	
}
