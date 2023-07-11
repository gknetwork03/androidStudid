import java.util.Scanner;
public class LE02_Q22_Rev02 {
	public static void main(String[] args) {
		int cont;
		float num;
		float acumulador = 0;
		float media;
		float numLido;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.print("Informe o No.: ");
		num = lerNum.nextInt();
				
		for(cont = 1; cont <= num;cont++) {
			System.out.print(cont+"o. Número: ");
			numLido = lerNum.nextFloat();
			acumulador = acumulador + numLido;
		}
		media = acumulador / num;
		System.out.printf("Media: %.2f", media);
	}
}
