public class Pitagora {
	public static void main(String[] args) {
		double cat1 = Integer.parseInt(args[0]);
		double cat2 = Integer.parseInt(args[1]);
		double pitagora = Math.sqrt(cat1*cat1 + cat2*cat2);
		System.out.println(pitagora);
	}
}