import java.util.Scanner;

public class LE01_Q52_Rev01 {

	public static void main(String[] args) {
		int iP, iJ = 0;
		
		Scanner lerIdade = new Scanner(System.in);
		
		System.out.print("Digite a idade de Pedro: ");
		iP = lerIdade.nextInt();
		
		System.out.print("Digite a idade de Joana: ");
		iJ = lerIdade.nextInt();
		
		if(iP == iJ) {
			System.out.print("Pedro e Joana possuem idades iguais.");
		}else if(iP > iJ) {
			System.out.print("Pedro é mais velho que Joana.");
		}else {
			System.out.print("Joana é mais velha que Pedro.");
		}
	}
}
