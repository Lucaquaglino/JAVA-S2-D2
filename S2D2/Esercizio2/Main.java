
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		// intero N
		int n = 8;
		// valore booleano per stampare numeri in posizione pari o dispari
		boolean PariDispari = false;

		List<Integer> randomList = listaRandomica(n);
		System.out.println("Lista casuale: " + randomList);

		List<Integer> reversedList = reverseLista(randomList);
		System.out.println("Lista invertita: " + reversedList);

		System.out.print("Valori in posizioni ");
		if (PariDispari)
			System.out.println("pari:");
		else
			System.out.println("dispari:");

		posizioneValori(randomList, PariDispari);
	}

	// Genera una lista ordinata di n interi casuali da 0 a 100
	public static List<Integer> listaRandomica(int n) {
		List<Integer> randomList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(101);
			randomList.add(randomNumber);
		}
		Collections.sort(randomList);
		return randomList;
	}

	// Restituisce una nuova lista composta dagli elementi della lista originale
	// seguiti dagli stessi elementi disposti in ordine inverso
	public static List<Integer> reverseLista(List<Integer> list) {
		List<Integer> reversedList = new ArrayList<>(list);
		Collections.reverse(reversedList);
		list.addAll(reversedList);
		return list;
	}

	// Stampa i valori della lista in posizioni pari se printEven è true, altrimenti
	// stampa i valori in posizioni dispari
	public static void posizioneValori(List<Integer> list, boolean PariDispari) {
		for (int i = 0; i < list.size(); i++) {
			if ((i % 2 == 0 && PariDispari) || (i % 2 != 0 && !PariDispari)) {
				System.out.println(list.get(i));
			}
		}
	}
}
