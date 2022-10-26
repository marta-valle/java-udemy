package exercicios;

import java.util.Scanner;

public class _1173 {

	public static void main(String[] args) {
		/* Exercicio de Vetor : Concluido: 26/10/2022 02:42:55
		 * Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10].
		 * Em cada posição subsequente, coloque o dobro do valor da posição anterior.
		 *   Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. 
		 *   Mostre o vetor em seguida.

		Entrada
			A entrada contém um valor inteiro (V<=50).
		
		Saída
			Para cada posição do vetor, escreva "N[i] = X",
			onde i é a posição do vetor e X é o valor armazenado na posição i. 
			O primeiro número do vetor N (N[0]) irá receber o valor de V.
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
