package fr.mds.tp11.utils;

import fr.mds.tp11.*;
import java.util.Arrays;

public class Conjugateur {
	
	public final static String[] PRONOMS = {"Je" , "Tu", "Il", "Nous", "Vous", "Elles"};
	public final static String[] TERMINAISONS = {"e" , "es", "e", "ons", "ez", "ent"};
	
	public final static String baseVerbale() {
		for (int i = 0; i < listeVerbe.size(); i++) {
			baseVerbale.add(listeVerbe.get(i).substring(0, listeVerbe.get(i).length() - 2));
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < baseVerbale.size(); i++) {
			System.out.println("Conjugaison du verbe " + listeVerbe.get(i) + " :");
			System.out.println("Je " + baseVerbale.get(i) + "e");
			System.out.println("Tu " + baseVerbale.get(i) + "es");
			System.out.println("il " + baseVerbale.get(i) + "e");
			System.out.println("Nous " + baseVerbale.get(i) + "ons");
			System.out.println("Vous " + baseVerbale.get(i) + "ez");
			System.out.println("Elles " + baseVerbale.get(i) + "ent");
			System.out.println("");
		}
	}

	@Override
	public String toString() {
		return "Je " + Arrays.toString(baseVerbale);
	}

}
