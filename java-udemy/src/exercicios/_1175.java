package exercicios;

import java.util.Scanner;

public class _1175 {

	public static void main(String[] args) {
		/*  EXERCICIO DE VETOR: 29/10/2022 Conclu�do
		 * Fa�a um programa que leia um vetor N[20].
		 *  Troque a seguir, o primeiro elemento com o �ltimo, o segundo elemento com o pen�ltimo, etc., at� trocar o 10� com o 11�.
		 *   Mostre o vetor modificado.
				
				Entrada
				A entrada cont�m 20 valores inteiros, positivos ou negativos.
				
				Sa�da
				Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do vetor e Y � o valor armazenado naquela posi��o.
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



















