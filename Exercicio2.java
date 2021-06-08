package ExerciciosVetoreseMatrizes;
/*Função: Exercício 2
 * Autora: Talu - Turma 25
 * Data: 07.06.2021
*/
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[6];
		int soma=0, qntimpar=0;
		
		for(int i=0; i<=5; i++) {
			System.out.printf("Insira um valor: ");
			vetor[i] = entrada.nextInt();
			
			if(vetor[i]%2==0){
				soma+=vetor[i];
			}else{qntimpar++;}}
		
			System.out.printf("\nNúmeros Pares: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2==0)
				{System.out.printf(" %d ", vetor[i]);}}
			
			System.out.printf("\nNúmeros Ímpares: ");
			
			for(int i=0; i<=5; i++) {
				if(vetor[i]%2!=0)
				{System.out.printf(" %d ", vetor[i]);}}
			
			System.out.printf("\nO total dos números pares é: %d", soma);
			System.out.printf("\nVocê digitou " + qntimpar + " números ímpares");
			
			entrada.close();
	}
}