import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RubricaTelefonica {

	private Map<String, String> contatti = new HashMap<>();

	public static void main(String[] args) {
		RubricaTelefonica rubrica = new RubricaTelefonica();

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println(" Seleziona un' opzione");
			System.out.println("----------------");
			System.out.println(" 1. Inserisci il contatto");
			System.out.println("----------------");
			System.out.println(" 2. cancella il contatto");
			System.out.println("----------------");
			System.out.println(" 3. ricerca per numero telefonico");
			System.out.println("----------------");
			System.out.println(" 4. ricerca persona");
			System.out.println("----------------");
			System.out.println("5. stampa rubrica");
			System.out.println("----------------");
			System.out.println("6. chiudi");
			System.out.println("----------------");

			int opzioneScelta = input.nextInt();
			input.nextLine();
			switch (opzioneScelta) {
			case 1:
				System.out.println(" inserisci il nome :");
				String nome = input.nextLine();
				System.out.println("inserisci il numero telefonico:");
				String numero = input.nextLine();
				rubrica.inserisciContatto(nome, numero);
				System.out.println("contatto aggiunto!");
				System.out.println("----------------");
				break;

			case 2:
				System.out.println("inserisci il nome del contatto da eliminare:");
				String contattoDaEliminare = input.nextLine();
				rubrica.cancellaContatto(contattoDaEliminare);
				System.out.println("contatto eliminato");
				System.out.println("----------------");
				break;
			case 3:
				System.out.println("inserisci il numero di telefono del contatto da trovare:");
				String telefonoContatto = input.nextLine();
				String nomeContattoTrovato = rubrica.ricercaPersonaPerTelefono(telefonoContatto);
				if (telefonoContatto != null) {
					System.out.println("contatto :" + nomeContattoTrovato);
					System.out.println("----------------");
				} else {
					System.out.println("contatto non trovato!");
					System.out.println("----------------");
				}
				break;
			case 4:
				System.out.println("inserisci il nome del contatto per avere il suo numero:");
				String nomeContatto = input.nextLine();
				String numeroTelefonoTrovato = rubrica.ricercaTelefonoPersona(nomeContatto);
				if (nomeContatto != null) {
					System.out.println("numero contatto : " + numeroTelefonoTrovato);
					System.out.println("----------------");
				} else {
					System.out.println("numero contatto non trovato!");
					System.out.println("----------------");
				}
				break;
			case 5:
				System.out.println("rubrica contatti:");
				rubrica.stampaContatti();
				System.out.println("----------------");
				break;
			case 6:

				break;

			default:
				System.out.println("opzione invalida.");
				break;

			}
//			input.close();
		}

	}

// METODO PER INSERIRE IL CONTATTO NUOVO
	public void inserisciContatto(String nome, String telefono) {
		contatti.put(nome, telefono);
	}

	// METODO PER CANCELLARE UN CONTATTO
	public void cancellaContatto(String nome) {
		contatti.remove(nome);
	}

//METODO PER CERCARE UNA PERSONA TRAMITE IL NUMERO TELEFONINO
	public String ricercaPersonaPerTelefono(String telefono) {
		for (Map.Entry<String, String> x : contatti.entrySet()) {
			if (x.getValue().equals(telefono)) {
				return x.getKey();
			}
		}
		return null;
	}

// METODO PER CERCARE IL TELEFONO DI UN CONTATTO
	public String ricercaTelefonoPersona(String nome) {

		return contatti.get(nome);
	}

//METODO PER STAMPARE I CONTATTI
	public void stampaContatti() {

		for (Map.Entry<String, String> x : contatti.entrySet()) {
			System.out.println("nome contatto:" + x.getKey() + ", numero telefonico:" + x.getValue());
		}
	}

}
