package aulas;

import java.util.Scanner;

public class Unidade6_Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  Aula 57 / 58
		*   Vetores Ou Arranjo OU Array s�o cole��es de Dados ; 
		*   Caracteristicas:
		*   Possuem tamanhos Fixos - Seu tamanho � definido no ato da cria��o;
		*   Indexadas - Seus elementos s�o acessados por endere�o
		*   Unidimencional - Uma dimens�o
		*   Homog�nea - Seu tipo � declarado no ato de cria��o, sem altera��o
		* 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.printf("O seu vetor ter� quantas posi��es?" );
		int x =sc.nextInt(); // 
		int[]A = new int[x]; // a primeira posi��o ser� 0 ; O x est� sendo usado para determinar o tamanho do vetor;
		
		for (int i = 0; i < x; i++) {
			
			System.out.printf("Digite um numero para a posi��o %d", i );
			int n =sc.nextInt(); 
			A[i] = n; // i � a posi��o do vetor, veja que come�a com 0, pois todo vetor come�a a contagem por 0. Se colocarmos i =1, a primeira posi��o do vetor ser� de valor 0;
			// n ser� o valor da posi��o i
			
		}
		for (int i = 0; i < x; i++) {
			// o eclipse "armazena" o valor os vetores e suas posi��es, para exibir, basta por pra ler o vetor. 
			System.out.printf("Posi��o %d valor: %d%n", i , A[i] );
			
		}
			
		sc.close();
	}

}

/* 
 * Todo ARRAY deve ser 
 * DECLARADO: int[]A; TIPO [] NOME ;
 * INSTANCIADO:  new int[x];  NEW TIPO[TAMANHO];
 * ACESSO (INPUT): A[i] = n;  NOME [POSI��O] = VALOR A SER INSERIDO;
 * 
 * 
 * EXERCICIOS URI 1172ok -1173 -1174 - 1175 e	1179
 * */
