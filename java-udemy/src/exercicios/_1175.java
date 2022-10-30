package exercicios;

import java.util.Scanner;

public class _1175 {

	public static void main(String[] args) {
		/*  EXERCICIO DE VETOR: 29/10/2022 Concluído
		 * Faça um programa que leia um vetor N[20].
		 *  Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º.
		 *   Mostre o vetor modificado.
				
				Entrada
				A entrada contém 20 valores inteiros, positivos ou negativos.
				
				Saída
				Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		int []A = new int[20];
		int []N = new int[20];
		
		for (int i=0, j = 20; i < 20; i++, j--) {
			int y = sc.nextInt();
			A[i]= y;
			N[j-1]= y;	
			}
		for (int j = 0; j < N.length; j++) {
			System.out.printf("N[%d] = %d%n", j , N[j]);
		}
		sc.close();
	}
}



















