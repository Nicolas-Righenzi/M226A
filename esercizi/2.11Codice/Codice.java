/**
*Esercizio 2.11
*Programma che cripta una parola 
*
* @author Nicolas Righenzi
* @version 03.02.2025
**/
public class Codice{
	public static void main(String[] args) {
		String a = args[0];
		int lung = a.length();
		String prima = (a.substring(0,1));
		String seconda = (a.substring(2,3));
		String pen = (a.substring(lung-2,lung-1));
		String ultima = (a.substring(lung-1,lung));
		String parfin = prima + seconda + ultima + pen;
		System.out.println(parfin);
	}
}