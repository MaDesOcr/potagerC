package utilitaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import model.Aliment;

public class Utilitaires {
	
	public static int readInt() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		try{
			i = sc.nextInt();
		}
		catch(Exception e) {	
		}
		return i;
	}	
	
	public static void printHashMap(HashMap<Aliment, Integer> gardeManger) {
		for (Entry<Aliment, Integer> aliment : gardeManger.entrySet()) {
			System.out.println(aliment.getKey().getNom() + " quatité : " + aliment.getValue());
		}
	}

	public static void printArrayList(ArrayList<Aliment> potager) {
		for (Aliment aliment : potager) {
			System.out.println(aliment.toString());
		}
	}
	
	
	
	
	
	
	
}
