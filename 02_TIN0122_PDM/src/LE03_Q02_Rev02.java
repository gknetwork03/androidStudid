/*
 * Fórmula para calcular área de tríangulo A = b * h
 */
import java.util.Scanner;

public class LE03_Q02_Rev02 {
    
    public static void main(String[] args) {
        float baseT1 = 0;
        float alturaT1 = 0;
        float baseT2 = 0;
        float alturaT2 = 0;
	float areaT1 = 0;
	float areaT2 = 0;
		
	Scanner lerValor = new Scanner(System.in);
		
	System.out.print("\n     DADOS DO 1º RETÂNGULO     \n");
	System.out.print("     Base: ");
	baseT1 = lerValor.nextFloat(); 
	System.out.print("     Altura: ");
	alturaT1 = lerValor.nextFloat();
		
	System.out.print("\n     DADOS DO 2º RETÂNGULO     \n");
	System.out.print("     Base: ");
	baseT2 = lerValor.nextFloat(); 
	System.out.print("     Altura: ");
	alturaT2 = lerValor.nextFloat();
		
	areaT1 = baseT1 * alturaT1;
	areaT2 = baseT2 * alturaT2;
		
	if(areaT1 > areaT2) {
            System.out.printf("\n 1º Trângulo é maior com: %.2f", areaT1);
        }else {
            System.out.printf("\n 2º Trângulo é maior com: %.2f", areaT1);
	}

    }

}