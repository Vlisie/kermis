package kermis;
import java.util.Scanner;
import java.util.*;

public class Demo {
	
	
	public static void main(String [] args) {
		Kassa kassa = new Kassa();
		Scanner sc = new Scanner(System.in);
		System.out.println("Voer uw keuze in:");
		System.out.println("1 voor botsauto's, \r\n" + 
				"2 voor spin, \r\n" + 
				"3 voor spiegelpaleis, \r\n" + 
				"4 voor spookhuis, \r\n" + 
				"5 voor hawaii, \r\n" + 
				"6 voor ladderklimmen.\r\n");
		
		int invoer2 = 1;
		do {
			int invoer = sc.nextInt();
			if(invoer>=0 && invoer <=6) {
				new Attractie().draaien((invoer-1));
				System.out.println("Nog een andere attratie? Toets dan 1 voor ja of 0 voor nee.");
				invoer2 = sc.nextInt();
			}
		}while( invoer2 == 1 );
		
		
	}

	/*ArrayList<String> atr= new ArrayList();		
	
		atr.add(new String("Botsauto's"));
		atr.add(1, new String("Spin"));
		atr.add(2, new String("Spiegelpaleis"));
		atr.add(3, new String("Spookhuis"));
		atr.add(4, new String("Hawaii"));
		atr.add(5, new String("Ladderklimmen"));*/
}
class Attractie{
	String naam;
	int prijs;
	int oppervlakte;
	Kassa kassa = new Kassa();
	
	void draaien(int welke){
		//System.out.println("De attractie " + atr.get(welke) + " draait.");
		if(welke == 0) {
			kassa.omzet(250);
			System.out.println("de attractie 'Botsauto' draait");
			}
		if(welke == 1) {
			kassa.omzet(225);
			System.out.println("de attractie 'Spin' draait");
			}
		if(welke == 2) {
			kassa.omzet(275);
			System.out.println("de attractie 'Spiegelpaleis' draait");
			}
		if(welke == 3) {
			kassa.omzet(320);
			System.out.println("de attractie 'Spookhuis' draait");
			}
		if(welke == 4) {
			kassa.omzet(290);
			System.out.println("de attractie 'Hawaii' draait");
			}
		if(welke == 5) {
			kassa.omzet(500);
			System.out.println("de attractie 'Ladderklimmen' draait");
			}
	}
}
class Botsauto extends Attractie{
	String naam = "Botsauto";
	int prijs = 250;
	int oppervlakte = 100;
	int omzet;
					
}
class Spin extends Attractie{
	String naam = "Spin";
	int prijs = 225;
	int oppervlakte = 100;
	int omzet;	
}
class Spiegelpaleis extends Attractie{
	String naam = "Spiegelpaleis";
	int prijs = 275;
	int oppervlakte = 300;
	int omzet;
}
class Spookhuis extends Attractie{
	String naam = "Spookhuis";
	int prijs = 320;
	int oppervlakte = 400;
	int omzet;
}
class Hawaii extends Attractie{
	String naam = "Hawaii";
	int prijs = 290;
	int oppervlakte = 50;
	int omzet;
}
class Ladderklimmen extends Attractie{
	String naam = "Ladderklimmen";
	int prijs = 500;
	int oppervlakte = 200;
	int omzet;
}
class Kassa{
	int omzet;
	void omzet(int plusbedrag) {
		omzet = omzet+plusbedrag;
	}
	void omzetTonen(){
		int omzettonen = omzet/100;
		System.out.println("De omzet in euro's: " + omzettonen);
	}
}