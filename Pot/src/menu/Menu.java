package menu;

import utilitaire.Utilitaires;

public class Menu {

	public static void menuPrincipal() {

		System.out.println("Bonjour");
		boolean appliOn = true;
		do {
			System.out.println("Choix :");
			System.out.println("1 Create");
			System.out.println("2 Read");
			System.out.println("3 Harvest");
			System.out.println("4 Delete");
			System.out.println("5 Exit");

			int i = Utilitaires.readInt();
			
			switch (i) {
			case 1:
				//System.out.println("Creation. 1 Pdt, 2 Carotte, 3 Poireau, 4 Pomme");
				//int j = Utilitaires.readInt();
				
				
				break;
			case 2:
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				appliOn = false;
				break;
			default:
				;
			}
		}
		while(appliOn);
	}
}
