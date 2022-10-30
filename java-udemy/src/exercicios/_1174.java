package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1174 {

	public static void main(String[] args) {
		/*   EXERCICIO DE VETOR: 29/10/2022 INICIO 18:15           CONCLUIDO 29/10/2022 18:36
			Faça um programa que leia um vetor A[100].
			 No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
			
			Entrada
			A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
			
			Saída
			Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x",
			onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.

		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float[]A = new float[100];
		
		for (int i = 0; i < 100; i++) {
			float n = sc.nextFloat();		
			if(n <=10) {
				A[i]=n;
				System.out.printf("A[%d] = %.1f%n", i , n);
			}
			else {
				A[i]=n;
			}
		}
		sc.close();		
	}

}
