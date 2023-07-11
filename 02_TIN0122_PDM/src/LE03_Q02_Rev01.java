/*
 * Fórmula para calcular área de tríangulo A = b * h
 */
import java.util.Scanner;
public class LE03_Q02_Rev01 {
	public static void main(String[] args) {
		float areaT1 = 0;
		float areaT2 = 0;
		System.out.print("\n     DADOS DO 1º RETÂNGULO     \n");
		areaT1 = calculaArea();
		System.out.print("\n     DADOS DO 2º RETÂNGULO     \n");
		areaT2 = calculaArea();
		if(areaT1 > areaT2) {
			System.out.printf("\n 1º Trângulo é maior com: %.2f", areaT1);
		}else {
			System.out.printf("\n 2º Trângulo é maior com: %.2f", areaT1);
		}
	}
	public static float calculaArea() {
		float baseT = 0;
		float alturaT = 0;
		Scanner lerValor = new Scanner(System.in);
		System.out.print("     Base: ");
		baseT = lerValor.nextFloat(); 
		System.out.print("     Altura: ");
		alturaT = lerValor.nextFloat();
		return baseT * alturaT;
	}
}