package kermis;
import java.util.Scanner;
import java.util.*;

public class Demo {
	
	
	public static void main(String [] args) {
		Kassa kassa = new Kassa();
		Scanner sc = new Scanner(System.in);
		int invoer2 = 1;
		char invoer1;
		int invoer4;
	do {
		System.out.println("Voer uw keuze in:");
		System.out.println("1 voor botsauto's, \r\n" + 
				"2 voor spin, \r\n" + 
				"3 voor spiegelpaleis, \r\n" + 
				"4 voor spookhuis, \r\n" + 
				"5 voor hawaii, \r\n" + 
				"6 voor ladderklimmen.\r\n");
		do {
			System.out.println("Voer uw keuze in:");
			int invoer = sc.nextInt();
			if(invoer>=0 && invoer <=6) {
				Attractie attractie = new Attractie();
				attractie.draaien((invoer-1));
				kassa.verkochteKaartjes++;
			
				System.out.println("Nog een andere attratie? Toets dan 1 voor ja. Wilt u de omzet of kaartverkoop inzien druk dan 0.");
				invoer2 = sc.nextInt();
			}
		}while( invoer2 == 1 );
		
		int invoer3;
		do {
		System.out.println("Toets o voor omzet of k voor kaartenverkoop.");
		invoer1 = sc.next().charAt(0);
		Attractie attractie = new Attractie();
		if( invoer1 == 111) {
			System.out.println(attractie.omzet);
		}
		if(invoer1 == 107) {
			kassa.verkochtekaartjesTonen();
		}
		System.out.println("Nog meer informatie bekijken? Druk 1 om de omzet of kaartverkoop te bekijken of 0 om te verlaten.");
		invoer3 = sc.nextInt();
		}while(invoer3 == 1);
		System.out.println("Wilt u toch nog een attractie laten draaien? Toets dan 1. Toets 0 om te verlaten.");
		
		invoer4=sc.nextInt();
	}while(invoer4 == 1);
	System.out.println();
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
	int omzet;
	int omzettoon;
	Kassa kassa = new Kassa();	
	int draaien(int welke){
		//System.out.println("De attractie " + atr.get(welke) + " draait.");
		if(welke == 0) {
			Botsauto botsauto = new Botsauto();
			System.out.println("de attractie 'Botsauto' draait");
			omzettoon= omzet+250;
			botsauto.omzet();
			botsauto.verkochteKaartjes++;
			return omzettoon;
			}
		if(welke == 1) {
			Spin spin = new Spin();
			kassa.omzet(225);
			spin.omzet();
			spin.verkochteKaartjes++;
			System.out.println("de attractie 'Spin' draait");
			}
		if(welke == 2) {
			Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
			this.kassa.omzet(275);
			spiegelpaleis.omzet();
			spiegelpaleis.verkochteKaartjes++;
			System.out.println("de attractie 'Spiegelpaleis' draait");
			}
		if(welke == 3) {
			Spookhuis spookhuis = new Spookhuis();
			kassa.omzet(320);
			spookhuis.omzet();
			spookhuis.verkochteKaartjes++;
			System.out.println("de attractie 'Spookhuis' draait");
			}
		if(welke == 4) {
			Hawaii hawaii = new Hawaii();
			kassa.omzet(290);
			hawaii.omzet();
			hawaii.verkochteKaartjes++;
			System.out.println("de attractie 'Hawaii' draait");
			}
		if(welke == 5) {
			Ladderklimmen ladderklimmen = new Ladderklimmen();
			kassa.omzet(500);
			ladderklimmen.omzet();
			ladderklimmen.verkochteKaartjes++;
			System.out.println("de attractie 'Ladderklimmen' draait");
			}
		return omzettoon;
		
	}
}
class Botsauto extends Attractie{
	String naam = "Botsauto";
	int prijs = 250;
	int oppervlakte = 100;
	int omzet;
	int verkochteKaartjes;
	int omzet() {
		this.omzet = omzet + 250;
		return omzet;
	}
					
}
class Spin extends Attractie{
	String naam = "Spin";
	int prijs = 225;
	int oppervlakte = 100;
	int omzet;
	int verkochteKaartjes;
	int omzet() {
		omzet = omzet + 225;
		return omzet;
	}
}
class Spiegelpaleis extends Attractie{
	String naam = "Spiegelpaleis";
	int prijs = 275;
	int oppervlakte = 300;
	int omzet;
	int verkochteKaartjes;
	int omzet() {
		omzet = omzet + 275;
		return omzet;
	}
}
class Spookhuis extends Attractie{
	String naam = "Spookhuis";
	int prijs = 320;
	int oppervlakte = 400;
	int omzet;
	int verkochteKaartjes;
	int omzet() {
		omzet = omzet + 320;
		return omzet;
	}
}
class Hawaii extends Attractie{
	String naam = "Hawaii";
	int prijs = 290;
	int oppervlakte = 50;
	int omzet;
	int verkochteKaartjes;
	int omzet() {
		omzet = omzet + 290;
		return omzet;
	}
}
class Ladderklimmen extends Attractie{
	String naam = "Ladderklimmen";
	int prijs = 500;
	int oppervlakte = 200;
	int omzet;
	int verkochteKaartjes;
	int omzet() {
		omzet = omzet + 500;
		return omzet;
	}
}
class Kassa{
	public int omzet = 0;
	//int omzettonen;
	int verkochteKaartjes;
	int omzet(int plusbedrag) {
		this.omzet = omzet+plusbedrag;
		return omzet;
	}
	void omzetTonen(){
		//omzettonen = this.omzet/100;
		System.out.println("De omzet in centen: " + omzet);
	}
	void verkochtekaartjesTonen() {
		System.out.println("Er zijn " + verkochteKaartjes + " kaartjes verkocht.");
	}
}