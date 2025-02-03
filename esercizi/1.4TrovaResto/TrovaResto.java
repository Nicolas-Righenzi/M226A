public class TrovaResto {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int resto = num2%num1;
		System.out.println(resto);
	}
}