package aulas;

import java.util.Scanner;

public class EstruturRepetitiva {

	public static void main(String[] args) {
		
		//Usa-se para repetir o comando, quando NÃO SE sabe o intervalo de valores. 
		/*While (condição){
		 * 		Comando 1
		 * 		Comando 2
		 * }
		 */
		Scanner sc= new Scanner(System.in);
		 int x =sc.nextInt();
		 while(x != 5) {
			 System.out.println("x não é 5");
			 x =sc.nextInt();
		 }
		 System.out.println("x = 5");
		
		
		
		//Usa-se para repetir o comando, quando se sabe o intervalo de valores. 
		/* for( INICIO ; CONDIÇÃO ; INCREMENTO){
		 *  comando1
		 *  comando2
		 *  }
		 *  INICIO: EXECUTA SOMENTE A PRIMEIRA VEZ
		 *  CONDIÇÃO: SE A CONDIÇÃO FOR VERDADEIRA OS COMANDOS SE REPETEM, CASO AO CONTRARIO, PULA FORA
		 *  INCREMENTO: TODA VEZ QUE FOR VERDADEIRO, É ADICIONADO ALGUMA FUNÇÃO
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
