package histoire;

import personnages.Commercant;
//import personnages.Humain;

public class Histoire {
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		System.out.println(prof.direBonjour());
//		System.out.println(prof.acheter("boisson", 12));
//		System.out.println(prof.boire());
//		System.out.println(prof.acheter("jeu", 2));
//		System.out.println(prof.acheter("kimono", 50));

		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

	}
}
