package aulas;

import java.util.Scanner;

public class EstruturRepetitiva {

	public static void main(String[] args) {
		
		//Usa-se para repetir o comando, quando N�O SE sabe o intervalo de valores. 
		/*While (condi��o){
		 * 		Comando 1
		 * 		Comando 2
		 * }
		 */
		Scanner sc= new Scanner(System.in);
		 int x =sc.nextInt();
		 while(x != 5) {
			 System.out.println("x n�o � 5");
			 x =sc.nextInt();
		 }
		 System.out.println("x = 5");
		
		
		
		//Usa-se para repetir o comando, quando se sabe o intervalo de valores. 
		/* for( INICIO ; CONDI��O ; INCREMENTO){
		 *  comando1
		 *  comando2
		 *  }
		 *  INICIO: EXECUTA SOMENTE A PRIMEIRA VEZ
		 *  CONDI��O: SE A CONDI��O FOR VERDADEIRA OS COMANDOS SE REPETEM, CASO AO CONTRARIO, PULA FORA
		 *  INCREMENTO: TODA VEZ QUE FOR VERDADEIRO, � ADICIONADO ALGUMA FUN��O
		 */
		
		
		 int n =sc.nextInt();
		 int soma =0;
		 for(int i=0 ; i<n ; i ++){
			 int m = sc.nextInt();
			 soma = soma + m;
		 }
		System.out.println(soma);
		
		sc.close();		
	}

}
