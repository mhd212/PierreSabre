package personnages;

public class Commercant extends Humain {
    
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);  
    }

    public void seFaireExtorquer() {
        argent = 0;
        parler("J’ai tout perdu! Le monde est trop injuste...");    }
    
    public void recevoir(int montant) {
        argent += montant; 
        parler(montant + " sous ! Je te remercie généreux donateur!"); 
    }
}

