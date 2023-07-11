import java.util.Scanner;

public class LE01_Q44_Rev01 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num = lerNum.nextInt();
		
		if((num % 2)== 0) {
			System.out.print("O número: "+num+" é par");
		}else {
			System.out.print("O número: "+num+" é impar");
		}

	}

}
