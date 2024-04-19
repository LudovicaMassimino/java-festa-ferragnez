package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] invitati = {"Dua Lipa" , "Paris Hilton" , "Manuel Agnelli" , "J-Ax" , "Francesco Totti" , "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
	
	
		System.out.print("Inserisci il tuo nome e cognome: ");
		String utente = input.nextLine();
		boolean presente = false;
		
		for (String invitato : invitati) {
		
			if (invitato.compareTo(utente) == 0) {
				presente = true;
				break;
			} 
		}
	
		if(presente) {
			System.out.println("Benvenuto alla festa!");
		}else {
			System.out.println("Non sei tra gli invitati.");
		}
	
	input.close();
	
	}
}
