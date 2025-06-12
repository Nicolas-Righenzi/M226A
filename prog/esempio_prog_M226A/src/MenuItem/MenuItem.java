package MenuItem;

/**
 * Rappresenta un elemento del menu, come un ingrediente o una salsa,
 * con un nome e un prezzo associato.
 */
public class MenuItem {
    private String nome;
    private double prezzo;

    /**
     * Crea un nuovo oggetto MenuItem con nome e prezzo specificati.
     *
     * @param nome   Il nome dell'elemento.
     * @param prezzo Il prezzo dell'elemento.
     */
    public MenuItem(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    /**
     * Restituisce il nome dell'elemento del menu.
     *
     * @return Il nome dell'ingrediente o voce di menu.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce il prezzo dell'elemento del menu.
     *
     * @return Il prezzo in CHF o euro, a seconda del contesto.
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * Restituisce una rappresentazione testuale dell'elemento, utile per stampe.
     *
     * @return Una stringa nel formato "Nome - €Prezzo".
     */
    @Override
    public String toString() {
        return nome + " - €" + prezzo;
    }

    /**
     * Due elementi di menu sono considerati uguali se hanno lo stesso nome,
     * ignorando le maiuscole/minuscole.
     *
     * @param o L'oggetto da confrontare.
     * @return true se i nomi sono uguali, false altrimenti.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem item = (MenuItem) o;
        return nome.equalsIgnoreCase(item.nome);
    }

    /**
     * Restituisce il codice hash basato sul nome in minuscolo,
     * coerente con l'implementazione di equals.
     *
     * @return Il codice hash dell'elemento.
     */
    @Override
    public int hashCode() {
        return nome.toLowerCase().hashCode();
    }
}
