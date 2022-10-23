package exercicios;

import java.util.Scanner;

public class _1080 {

	public static void main(String[] args) {
		/*	
		 * Concluido
		 * Leia 100 valores inteiros.
		 *  Apresente ent�o o maior valor lido e a posi��o dentre os 100 valores lidos.
			Entrada
				O arquivo de entrada cont�m 100 n�meros inteiros, positivos e distintos.

			Sa�da
				Apresente o maior valor lido e a posi��o de entrada, conforme exemplo abaixo.*/
		Scanner sc = new Scanner(System.in);

		int posicao = 0;
		int max = 0;
		
		for (int i = 0; i < 100; i++) {
			int num = sc.nextInt();

			if(num > max) {
				max = num;
				posicao = i+1;
		};
		}
		System.out.println( max );
		System.out.println( posicao );
		sc.close();
	}
}

