/**
*Esercizio 2.7
*Programma simula il lancio di un Dado
*
* @author Nicolas Righenzi
* @version 03.02.2025
**/
import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random rnd = new Random();
        int face = rnd.nextInt(1,7);  //min incluso e max escluso [1,7[
        System.out.println(face);
    }
}
