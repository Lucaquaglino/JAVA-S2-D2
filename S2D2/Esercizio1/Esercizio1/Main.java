package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Inserisci il numero di elementi da inserire: ");
		int n = input.nextInt();

		Set<String> parole = new HashSet<>();
		Set<String> paroleDuplicate = new HashSet<>();
		Set<String> paroleDistinte = new HashSet<>();

		System.out.println("Inserisci le parole:");

		for (int i = 0; i < n; i++) {
			String parola = input.next();

			if (!parole.add(parola)) {
				paroleDuplicate.add(parola);
			}
			paroleDistinte.add(parola);
		}

		// STAMPA ELENCO PAROLE DUPLICATE
		System.out.println("Parole duplicate:");
		for (String parola : paroleDuplicate) {
			System.out.println(parola);
		}

		// STAMPA NUMERO PAROLE DISTINTE
		int numeroParoleDistinte = paroleDistinte.size();
		System.out.println("Numero di parole distinte: " + numeroParoleDistinte);

		// STAMPA ELENCO PAROLE DISTINTE
		System.out.println("Elenco delle parole distinte:");
		for (String parola : paroleDistinte) {
			System.out.println(parola);
		}

		input.close();
	}
}
