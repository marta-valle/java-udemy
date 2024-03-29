package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1117 {

	public static void main(String[] args) {
		/*Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno. 
		 * Calcule e imprima a m�dia semestral.
		 * Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]).
		 *  Cada nota deve ser validada separadamente.

		Entrada
			A entrada cont�m v�rios valores reais, positivos ou negativos. 
			O programa deve ser encerrado quando forem lidas duas notas v�lidas.

		Sa�da
			Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
			Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do c�lculo. 
			O valor deve ser apresentado com duas casas ap�s o ponto decimal.*/
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner (System.in);
		double nota_1 = sc.nextDouble();
		
		while(nota_1 < 0.0 || nota_1 > 10.0) {
			System.out.println ("nota invalida");
			nota_1 = sc.nextDouble();
		}
		
		double nota_2 = sc.nextDouble();
		
		while (nota_2 < 0.0 || nota_2 > 10.0) {
			System.out.println ("nota invalida");
			nota_2 = sc.nextDouble();
		}
		double media;
		media = (nota_1 + nota_2)/2;
		System.out.printf("media = %.2f%n", media);
		
		sc.close();
	}

}
