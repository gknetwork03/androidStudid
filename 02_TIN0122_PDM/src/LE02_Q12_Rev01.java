import java.util.Scanner;
public class LE02_Q12_Rev01 {

	public static void main(String[] args) {
		int cont = 1;
		float nota = 0;
		float somaNota = 0;
		float maiorNota = 0;
		float menorNota = 10;
		float media = 0;
		
		Scanner lerNota = new Scanner(System.in);
		
		while(cont <= 4) {
			System.out.print(cont+"a. Nota: ");
			nota = lerNota.nextFloat();
			
			somaNota = somaNota + nota;
			
			if(maiorNota < nota) {
				maiorNota = nota;
			}
			
			if(menorNota > nota){
				menorNota = nota;
			}
			cont++;
		}
		
		media = somaNota / cont;
		
		System.out.println("\n     Soma das Notas: " + somaNota);
		System.out.println("     Média das Notas: " + media);
		System.out.println("     Maior Nota: " + maiorNota);
		System.out.println("     Menor Nota: " + menorNota);

	}

}
