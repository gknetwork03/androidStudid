import java.util.Scanner;

public class LE01_Q61_Rev01 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		num = lerNum.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("um");
			break;
		case 2:
			System.out.print("dois");
			break;
		case 3:
			System.out.print("três");
			break;	
		default:
			System.out.print("fora da faixa");
		}
		

	}

}
