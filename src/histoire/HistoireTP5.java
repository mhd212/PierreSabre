package histoire;

import personnages.Humain;

public class HistoireTP5 {

	public static void main(String[] args) {
		Humain marco = new Humain("Marco", "thé", 20);
        Humain roro = new Humain("Roro", "shochu", 30);
        Humain yaku = new Humain("Yaku Le Noir", "whisky", 40);

        marco.faireConnaissanceAvec(roro);
        marco.faireConnaissanceAvec(yaku);

        marco.listerConnaissance();
        roro.listerConnaissance();
        yaku.listerConnaissance();
    }
}
	

