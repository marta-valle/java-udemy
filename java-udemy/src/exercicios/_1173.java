package exercicios;

import java.util.Scanner;

public class _1173 {

	public static void main(String[] args) {
		/* Exercicio de Vetor : Concluido: 26/10/2022 02:42:55
		 * Leia um valor e fa�a um programa que coloque o valor lido na primeira posi��o de um vetor N[10].
		 * Em cada posi��o subsequente, coloque o dobro do valor da posi��o anterior.
		 *   Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. 
		 *   Mostre o vetor em seguida.

		Entrada
			A entrada cont�m um valor inteiro (V<=50).
		
		Sa�da
			Para cada posi��o do vetor, escreva "N[i] = X",
			onde i � a posi��o do vetor e X � o valor armazenado na posi��o i. 
			O primeiro n�mero do vetor N (N[0]) ir� receber o valor de V.
		*/
		Scanner sc = new Scanner(System.in);
		int[]A = new int[10];
		int valor = sc.nextInt();
		while(valor>50) {
			valor = sc.nextInt();
		}	
		
		for (int i = 0; i < 10; i++) {
			A[i] = valor;
			valor= valor*2;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("N[%d] = %d%n", i , A[i] );
		}
		sc.close();
	}
}
