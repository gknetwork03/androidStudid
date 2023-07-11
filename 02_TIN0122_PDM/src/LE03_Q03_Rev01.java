import java.util.Scanner;
public class LE03_Q03_Rev01 {
	public static void main(String[] args) {
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		Scanner lerNota = new Scanner(System.in);
		System.out.print("1a. Nota: ");
		nota1 = lerNota.nextFloat();
		System.out.print("2a. Nota: ");
		nota2 = lerNota.nextFloat();
		System.out.print("3a. Nota: ");
		nota3 = lerNota.nextFloat();
		calcularMedia(nota1, nota2, nota3);
	}
	public static void calcularMedia(float nota1, float nota2, float nota3) {
		float media = 0;
		media = ((nota1 + ((nota2)*2) + ((nota3)*2))/3);
		System.out.printf("\n Média: %.2f", media);
	}
}
