import java.util.Scanner;
public class LE03_Q01_Rev01 {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
				
		Scanner lerNum = new Scanner(System.in);
		
		LE03_Q01_Rev01 obj = new LE03_Q01_Rev01();
		
		System.out.print("1º. Numero: ");
		n1 = lerNum.nextInt();
		
		System.out.print("2º. Numero: ");
		n2 = lerNum.nextInt();
		
		System.out.println(obj.numeroMaior(n1, n2));
		
	}
	
	int maior;
	
	public int numeroMaior(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("\n    1º Número é maior com: " + num1);
		}else {
			System.out.println("\n    2º Número é maior com: " + num2);
		}
		return maior;
	}

}
