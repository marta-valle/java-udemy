package aulas;

import java.util.Scanner;

public class Unidade6_Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  Aula 57 / 58
		*   Vetores Ou Arranjo OU Array são coleções de Dados ; 
		*   Caracteristicas:
		*   Possuem tamanhos Fixos - Seu tamanho é definido no ato da criação;
		*   Indexadas - Seus elementos são acessados por endereço
		*   Unidimencional - Uma dimensão
		*   Homogênea - Seu tipo é declarado no ato de criação, sem alteração
		* 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.printf("O seu vetor terá quantas posições?" );
		int x =sc.nextInt(); // 
		int[]A = new int[x]; // a primeira posição será 0 ; O x está sendo usado para determinar o tamanho do vetor;
		
		for (int i = 0; i < x; i++) {
			
			System.out.printf("Digite um numero para a posição %d", i );
			int n =sc.nextInt(); 
			A[i] = n; // i é a posição do vetor, veja que começa com 0, pois todo vetor começa a contagem por 0. Se colocarmos i =1, a primeira posição do vetor será de valor 0;
			// n será o valor da posição i
			
		}
		for (int i = 0; i < x; i++) {
			// o eclipse "armazena" o valor os vetores e suas posições, para exibir, basta por pra ler o vetor. 
			System.out.printf("Posição %d valor: %d%n", i , A[i] );
			
		}
			
		sc.close();
	}

}

/* 
 * Todo ARRAY deve ser 
 * DECLARADO: int[]A; TIPO [] NOME ;
 * INSTANCIADO:  new int[x];  NEW TIPO[TAMANHO];
 * ACESSO (INPUT): A[i] = n;  NOME [POSIÇÃO] = VALOR A SER INSERIDO;
 * 
 * 
 * EXERCICIOS URI 1172ok -1173 -1174 - 1175 e	1179
 * */
