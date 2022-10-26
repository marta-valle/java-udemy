package exercicios;

import java.util.Scanner;

public class _1172 {

	public static void main(String[] args) {
		/*	vetor: Conclu�do 25/10
		 * 
		 * Fa�a um programa que leia um vetor X[10]. 
		 * Substitua a seguir, todos os valores nulos e negativos do vetor X por 1.
		 * Em seguida mostre o vetor X.

		Entrada
			A entrada cont�m 10 valores inteiros, podendo ser positivos ou negativos.

			Sa�da
				Para cada posi��o do vetor, escreva "X[i] = x", onde i � a posi��o do vetor e x � o valor armazenado naquela posi��o.

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
