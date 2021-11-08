package model;

public class Pdt extends Legume{
	
	public Pdt(String nom, int dureePousse, int recoltePousse) {
		super(nom, recoltePousse, recoltePousse);
		
	}
	
	@Override
	public String toString() {
		return "Pdt [dureePousse=" + dureePousse + ", recoltePousse=" + recoltePousse + ", nom=" + nom + "]";
	}
	
}
