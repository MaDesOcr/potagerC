package model;

public class Carotte extends Legume{

	
	public Carotte(String nom, int dureePousse, int recoltePousse) {
		super(nom, recoltePousse, recoltePousse);
		
	}
	
	@Override
	public String toString() {
		return "Carotte [dureePousse=" + dureePousse + ", recoltePousse=" + recoltePousse + ", nom=" + nom + "]";
	}
	
	
}
