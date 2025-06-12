package Ordine;

import Kebab.Kebab;
import java.time.LocalDateTime;

/**
 * Rappresenta un ordine effettuato dal cliente, contenente un kebab,
 * la data dell’ordine e un numero identificativo univoco.
 */
public class Ordine {
    private static int contatoreOrdini = 1;

    private int numeroOrdine;
    private Kebab kebab;
    private LocalDateTime data;

    /**
     * Crea un nuovo ordine con un kebab associato.
     * L’ordine riceve un numero progressivo e la data attuale.
     *
     * @param kebab Il kebab ordinato dal cliente.
     */
    public Ordine(Kebab kebab) {
        this.numeroOrdine = contatoreOrdini++;
        this.kebab = kebab;
        this.data = LocalDateTime.now();
    }

    /**
     * Stampa a schermo lo scontrino dell’ordine,
     * con numero, data e dettagli del kebab.
     */
    public void stampaScontrino() {
        System.out.println("Ordine n°" + numeroOrdine);
        System.out.println("Data: " + data);
        System.out.println(kebab);
    }

    /**
     * Restituisce il numero progressivo dell’ordine.
     *
     * @return Il numero dell’ordine.
     */
    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    /**
     * Restituisce il kebab associato a questo ordine.
     *
     * @return Il kebab ordinato.
     */
    public Kebab getKebab() {
        return kebab;
    }
}
