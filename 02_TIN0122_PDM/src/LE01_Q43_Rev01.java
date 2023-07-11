import java.util.Scanner;

public class LE01_Q43_Rev01 {

	public static void main(String[] args) {
		int qAlunos = 0;
		int qAlunas = 0;
		
		Scanner lerQuant = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de Alunos: ");
		qAlunos = lerQuant.nextInt();
		
		System.out.print("Digite a quantidade de Alunas: ");
		qAlunas = lerQuant.nextInt();
		
		if(qAlunos == qAlunas) {
			System.out.print("Há a mesma quantidade de Alunos e Alunas.");
		}else if(qAlunos > qAlunas) {
			System.out.print("Há mais Alunos que Alunas.");
		}else {
			System.out.print("\n Há mais alunas do que alunos. O total de alunos é: " + (qAlunas + qAlunos));
		}
	}
}