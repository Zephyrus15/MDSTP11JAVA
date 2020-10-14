package fr.mds.tp11;
import java.util.ArrayList;
import java.util.Scanner;

import fr.mds.tp11.utils.*;

public class Launcher {
	public static void main(String[] args) {
		ArrayList<String> listeVerbe = new ArrayList<String>();
		ArrayList<String> baseVerbale = new ArrayList<String>();

	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Veuillez saisir un verbe du premier groupe : ");	
	    
	    String nouveauVerbe = sc.nextLine();
	    
		listeVerbe.add(nouveauVerbe);
		for (int i = 0; i < listeVerbe.size(); i++) {
			baseVerbale.add(listeVerbe.get(i).substring(0, listeVerbe.get(i).length() - 2));
		}
		
		for (int i = 0; i < listeVerbe.size(); i++) {
			System.out.println(baseVerbale.get(i));
		}
		
	}
	
	
}
