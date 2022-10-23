package exercicios;

import java.util.Scanner;

public class _1172 {

	public static void main(String[] args) {
		/*	Concluido 	
		 * Escreva um programa que leia um valor inteiro N. 
		 * 		Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

				Entrada
				O arquivo de entrada contém um número inteiro positivo N.

				Saída
				Imprima a saída conforme o exemplo fornecido.

		 		*/
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cont = 1;
		
		for (int i = 1; i <= num; i++) {

			System.out.printf(" %d ", cont );
			cont++;
			System.out.printf(" %d ", cont );
			cont++;
			System.out.printf(" %d PUM%n", cont );
			cont= cont+2;
		}
		sc.close();
	}
}
