/**
*Esercizio 2.14
*Programma che calcola la nota finale del modulo 
*
* @author Nicolas Righenzi
* @version 03.02.2025
**/
public class NotaModulo{
	public static void main(String[] args) {
		double nota1 = Double.parseDouble(args[0]);
		double nota2 = Double.parseDouble(args[1]);
		double nota3 = Double.parseDouble(args[2]);
		double nota4 = Double.parseDouble(args[3]);
		double notafin = (nota1 * 0.10 + nota2 * 0.3 + nota3 * 0.3 + nota4 * 0.3);
		System.out.println(notafin);
	}
}