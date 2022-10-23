package exercicios;

import java.util.Scanner;

public class _1078 {

	public static void main(String[] args) {
		/* CONCLUIDO
		 * Leia 1 valor inteiro N ( < 1000).2 < N A seguir, mostre a tabuada de N:      
		1 x N = N      2 x N = 2N        ...       10 x N = 10N

				Entrada
				A entrada contém um valor inteiro N (2 < N < 1000).

				Saída
				Imprima a tabuada de N, conforme o exemplo fornecido.*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int resultado = 0;
		
		if(n>2 && n<1000) {
			
		for (int i = 1; i <= 10; i++) {
			resultado = n * i;
			System.out.printf("%d x %d = %d%n",i, n , resultado);
		}		
		}
		sc.close();

	}

}
