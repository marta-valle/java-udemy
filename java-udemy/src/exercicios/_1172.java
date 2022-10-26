package exercicios;

import java.util.Scanner;

public class _1172 {

	public static void main(String[] args) {
		/*	vetor: Concluído 25/10
		 * 
		 * Faça um programa que leia um vetor X[10]. 
		 * Substitua a seguir, todos os valores nulos e negativos do vetor X por 1.
		 * Em seguida mostre o vetor X.

		Entrada
			A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

			Saída
				Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

		 */
		Scanner sc = new Scanner(System.in);
		int[]x =new int[10];
		
		for (int i = 0; i < 10; i++) {
			int valor = sc.nextInt();
				if( valor > 0 ) {
					x[i]= valor;
				}
				else {
					valor = 1;
					x[i]= valor;
				}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("X[%d] = %d%n", i , x[i] );
		}
		sc.close();
	}
}
