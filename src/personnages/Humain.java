package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	
	public Humain(String nom, String boisson , int argent) {

		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	protected String parler1(String texte) {
        System.out.println("(" + nom + ") - " + texte); // Affichage du message
		return texte;
    }

	public String direBonjour() {
		return parler1("Bonjour ! Je m’appelle " + nom + "et j’aime boire du " + boisson);
}

	public String boire() {
		return parler1("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
}
	protected String parler(String texte) {
        return "(" + nom + ") - " + texte;
    }

   
    public String acheter(String bien, int prix) {
        if (argent >= prix) {
            argent -= prix;
            return parler1("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix + " sous.");
        } else {
            return parler1("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à " + prix + " sous.");
        }
    }

    private void gagnerArgent(int gain) {
        if (gain > 0) {
            argent += gain;
        }
    }

    private void perdreArgent(int perte) {
        if (perte > 0 && perte <= argent) {
            argent -= perte;
        }
    }

    
}
	
	
	
	
	
	
	
	
	
	
	
	


