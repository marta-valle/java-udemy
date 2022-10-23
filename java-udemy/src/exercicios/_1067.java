package exercicios;

import java.util.Scanner;

public class _1067 {

	public static void main(String[] args) {
		/* CORRETO
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 * 
		 * Entrada O arquivo de entrada contém 1 valor inteiro qualquer.
		 * 
		 * Saída Imprima todos os valores ímpares de 1 até X, inclusive X, se for o
		 * caso.
		 */

		Scanner sc = new Scanner(System.in);
		int impar = sc.nextInt();
		
		if (impar >= 1 && impar <= 1000) {
			for (int x = 1; x <= impar; x = x + 2) {
				System.out.println(x);
				
			}

		}
		sc.close();
	};
}
