package main;

import java.util.ArrayList;
import java.util.HashMap;

import menu.Menu;
import model.Aliment;

public class Potager {

	HashMap<Aliment, Integer> gardeManger = new HashMap<Aliment, Integer>();
	
	ArrayList<Aliment> potager = new ArrayList<Aliment>();

	public void cestparti() {
		
		Menu.menuPrincipal();
	}

}
