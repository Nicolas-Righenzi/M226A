package Kebab;

import MenuItem.MenuItem;
import java.util.ArrayList;

/**
 * Rappresenta un kebab composto da uno o più ingredienti.
 * Ogni ingrediente è un oggetto di tipo {@link MenuItem}.
 */
public class Kebab {
    private ArrayList<MenuItem> ingredienti;

    /**
     * Costruttore che inizializza un nuovo kebab vuoto,
     * pronto per essere riempito con ingredienti.
     */
    public Kebab() {
        this.ingredienti = new ArrayList<>();
    }

    /**
     * Aggiunge un ingrediente al kebab, se non è già presente.
     *
     * @param item L'ingrediente da aggiungere.
     */
    public void aggiungiIngrediente(MenuItem item) {
        if (!ingredienti.contains(item)) {
            ingredienti.add(item);
        }
    }

    /**
     * Calcola il prezzo totale del kebab sommando i prezzi
     * di tutti gli ingredienti aggiunti.
     *
     * @return Il prezzo totale del kebab.
     */
    public double calcolaPrezzoTotale() {
        double totale = 0;
        for (MenuItem item : ingredienti) {
            totale += item.getPrezzo();
        }
        return totale;
    }

    /**
     * Restituisce la lista degli ingredienti attualmente presenti nel kebab.
     *
     * @return Una lista di ingredienti.
     */
    public ArrayList<MenuItem> getIngredienti() {
        return ingredienti;
    }

    /**
     * Restituisce una rappresentazione testuale del kebab,
     * elencando tutti gli ingredienti e il prezzo totale.
     *
     * @return Stringa descrittiva del kebab.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Kebab con:\n");
        for (MenuItem item : ingredienti) {
            sb.append("- ").append(item).append("\n");
        }
        sb.append("Totale: €").append(calcolaPrezzoTotale());
        return sb.toString();
    }
}
