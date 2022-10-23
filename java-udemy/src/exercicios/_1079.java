package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1079 {

	public static void main(String[] args) {
		/* Concluido sem falha - 16/10/22
		 * Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir.
		Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
		Apresente a m�dia ponderada para cada um destes conjuntos de 3 valores, A peso 2 (A*2), B peso 3 (B*3) e o C peso 5 (C*5).
		M�dia, ent�o a divis�o � pela soma dos pesos, (2+3+5 = 10)

		Entrada
			O arquivo de entrada cont�m um valor inteiro N na primeira linha.
			Cada N linha a seguir cont�m um caso de teste com tr�s valores com uma casa decimal cada valor.

		Sa�da
			Para cada caso de teste, imprima a m�dia ponderada dos 3 valores, conforme exemplo abaixo.*/
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		int entrada =sc.nextInt();

		for (int i = 0; i < entrada; i++) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			
			float media = (a*2 + b*3 + c*5)/10f;
			System.out.printf("%.1f%n", media); //corrigir para 1 ponto flutuante apos a virgula
			
		}
		sc.close();
	}
}
