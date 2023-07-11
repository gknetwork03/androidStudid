import java.util.Scanner;
public class LE03_Q04_Rev01 {
	public static void main(String[] args) {
		int num01 = 0;
		int num02 = 0;
		Scanner lerNum = new Scanner(System.in);
		System.out.print("Informe o 1o. número: ");
		num01 = lerNum.nextInt();
		System.out.print("Informe o 2o. número: ");
		num02 = lerNum.nextInt();
		calcularSoma(num01, num02);
		calcularDobro(num01, num02);
	}
	public static int calcularSoma(int num01, int num02) {
		int soma = 0;
		soma = num01 + num02;
		return soma;
	}
	public static int calcularDobro(int num01, int num02) {
		int dobro = 0;
		dobro = (num01 * 2) + (num02 * 2);
		return dobro;
	}
}
