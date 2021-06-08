package ExerciciosVetoreseMatrizes;
/*Função: Exercício 4
 * Autora: Talu - Turma 25
 * Data: 07.06.2021
*/
import java.util.Scanner;

public class Exercicio4 {
	
public static void main(String[] args) {
		
		double [][] m1 = new double[2][2];
		double [][] m2 = new double[2][2];
		double [][] mR = new double[2][2];
		int user = 0;
		double constante;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira matriz 2 x 2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m1[l][c] = entrada.nextDouble();
			}
		}
		System.out.println("\nDigite a segunda matriz 2x2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m2[l][c] = entrada.nextDouble();
			}
		}
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("DIGITE 1 para somar as matrizes\nDIGITE 2 para subtrair valores entre a primeira matriz e a segunda"
				+ "\nDIGITE 3 para adicionar uma constante às duas matrizes\nDIGITE 4 para imprimir todas as matrizes");
		user = entrada.nextInt();

		if (user == 1) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m1[l][c] + m2[l][c];
				}
			}
			System.out.println("\nResultado da Matriz somada (m1 + m2): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		}
		else if (user == 2) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m2[l][c] - m1[l][c];
				}
			}
			System.out.println("\nResultado da Matriz subtraída (m2 - m1): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		}
		else if (user == 3) {
			System.out.println("Digite um valor para constante: ");
			constante = entrada.nextDouble();
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m1[l][c] = m1[l][c] + constante;
					m2[l][c] = m2[l][c] + constante;
				}
			}
			System.out.println("\nResultado das Matrizes de adição constante: ");
			System.out.println("M1:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\nM2:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m2[l][c]);
				}
				System.out.println();
			}
		}
		else if (user == 4) {
			System.out.println("M1:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\nM2:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m2[l][c]);
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Opção inválida!");
		}
		entrada.close();
	}
}