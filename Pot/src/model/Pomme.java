package model;

public class Pomme extends Fruit{
			
	public Pomme(String nom, int dureePousse, int recoltePousse) {
		super(nom, recoltePousse, recoltePousse);
		
	}
	
	@Override
	public String toString() {
		return "Pomme [dureePousse=" + dureePousse + ", recoltePousse=" + recoltePousse + ", nom=" + nom + "]";
	}
	
}
