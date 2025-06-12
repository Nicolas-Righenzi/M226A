import Kebab.Kebab;
import MenuItem.MenuItem;
import Ordine.Ordine;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Thread;

/**
 * Classe principale del programma "Arbil Kebab".
 * Permette all'utente di ordinare un kebab completo, personalizzato,
 * vedere il menu oppure uscire dal programma.
 */
public class Main {

    /**
     * Metodo principale che avvia l'applicazione.
     * Mostra un menu interattivo, riceve l'input dell'utente e gestisce l’ordine.
     *
     * @param args Argomenti da riga di comando (non utilizzati).
     * @throws InterruptedException Se il thread viene interrotto durante i ritardi.
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean sessione = true;

        System.out.println();
        System.out.println("Benvenuto da Arbil Kebab!");
        Thread.sleep(2000);

        while (sessione) {
            System.out.println();
            System.out.println("+--------------------------+");
            System.out.println("| Cosa vuole fare?         |");
            System.out.println("| 1. Kebab completo         |");
            System.out.println("| 2. Kebab personalizzato   |");
            System.out.println("| 3. Mostra il menu         |");
            System.out.println("| 4. Esci                   |");
            System.out.println("+--------------------------+");
            System.out.println();
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            Kebab kebab = new Kebab();
            ArrayList<MenuItem> menuBase = creaMenuBase();

            if (scelta == 1) {
                for (MenuItem item : menuBase) {
                    kebab.aggiungiIngrediente(item);
                }
                Ordine ordine = new Ordine(kebab);
                ordine.stampaScontrino();
                sessione = false;
            } else if (scelta == 2) {
                for (MenuItem item : menuBase) {
                    if (chiediSiNo(scanner, "Vuoi aggiungere " + item.getNome() + "?" + " (" + item.getPrezzo() + " CHF)")) {
                        kebab.aggiungiIngrediente(item);
                    }
                }
                Ordine ordine = new Ordine(kebab);
                ordine.stampaScontrino();
                sessione = false;
            } else if (scelta == 3) {
                System.out.println();
                System.out.println("Ecco il nostro menu: ");
                for (MenuItem item : menuBase) {
                    System.out.println(item.getNome() + " (" + item.getPrezzo() + " CHF)");
                    Thread.sleep(500);
                }
                String skip = "";
                while (!skip.equals("q")) {
                    System.out.println();
                    System.out.println("\nPremi 'q' per tornare al menu principale");
                    skip = scanner.nextLine();
                    System.out.println();
                }

                System.out.print("Torno al menu");
                Thread.sleep(750);
                System.out.print(".");
                Thread.sleep(750);
                System.out.print(".");
                Thread.sleep(750);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println();
            } else if (scelta == 4) {
                sessione = false;
            } else {
                System.out.println("Scelta non valida");
                System.out.println("Inserisci un valore valido.");
                System.out.println();
                Thread.sleep(1500);
            }
        }

        scanner.close();

        System.out.println();
        System.out.println("\n\nArrivederci, è stato un piacere.");
    }

    /**
     * Crea il menu base con tutti gli ingredienti disponibili.
     * Questo menu viene usato sia per il kebab completo che per quello personalizzato.
     *
     * @return Una lista di ingredienti (MenuItem) con nome e prezzo.
     */
    private static ArrayList<MenuItem> creaMenuBase() {
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Carne di agnello", 4.5));
        menu.add(new MenuItem("Carne di pollo", 3.00));
        menu.add(new MenuItem("Insalata fresca", 0.50));
        menu.add(new MenuItem("Pomodori", 0.50));
        menu.add(new MenuItem("Cipolla", 0.30));
        menu.add(new MenuItem("Verza rosa", 0.30));
        menu.add(new MenuItem("Verza bianca", 0.30));
        menu.add(new MenuItem("Carote", 0.30));
        menu.add(new MenuItem("Patatine", 0.30));
        menu.add(new MenuItem("Salsa bianca", 0.40));
        menu.add(new MenuItem("Salsa piccante", 0.40));
        menu.add(new MenuItem("Salsa samurai", 0.40));
        return menu;
    }

    /**
     * Chiede all’utente una domanda a cui rispondere “si” o “no”.
     * Se la risposta non è valida, ripete la domanda.
     *
     * @param scanner Oggetto Scanner per leggere l’input da tastiera.
     * @param domanda Testo della domanda da visualizzare.
     * @return true se l’utente risponde “si”, false se risponde “no”.
     * @throws InterruptedException Se il thread viene interrotto durante l’attesa.
     */
    private static boolean chiediSiNo(Scanner scanner, String domanda) throws InterruptedException {
        String risposta;
        do {
            Thread.sleep(1000);
            System.out.print(domanda + " (si/no): ");
            risposta = scanner.nextLine().trim().toLowerCase();
        } while (!risposta.equals("si") && !risposta.equals("no"));
        return risposta.equals("si");
    }
}
