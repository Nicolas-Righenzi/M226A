/**
*Esercizio 2.10
*Programma che elava alla secondo un numero 
*
* @author Nicolas Righenzi
* @version 03.02.2025
**/
public class Potenza{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		num = num * num;
		System.out.println(num);
	}
}