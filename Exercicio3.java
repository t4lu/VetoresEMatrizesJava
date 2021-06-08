package ExerciciosVetoreseMatrizes;
/*Função: Exercício 3
 * Autora: Talu - Turma 25
 * Data: 07.06.2021
*/
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double [] [] matriz = new double [3] [3];
		int maior=0;

		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++)
			{
				System.out.println("Insira valores para uma matriz 3x3: ");
				matriz[l][c]=entrada.nextDouble();
				if(matriz [l][c] >10){
					maior++;
				}
			}
	}
		System.out.println("Sua matriz possui " +maior +" valor(es) maior(es) que 10.");
		entrada.close();
	}
}