package exercicios;
import java.util.Scanner;

public class _1115 {
	public static void main(String[] args) {
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
		 *  Para cada ponto escrever o quadrante a que ele pertence. 
		 *  O algoritmo ser� encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem alguma).

			Entrada
			A entrada cont�m v�rios casos de teste. Cada caso de teste cont�m 2 valores inteiros.

			Sa�da
			Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.*/

		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		/*aten��o ao && e |*/
		while(x!=0 && y!=0 ) {
			if(x > 0 && y >0 ) {
				System.out.println("primeiro");
			}
			else if(x < 0 && y >0){
				System.out.println("segundo");
			}
			else if(x < 0 && y <0){
				System.out.println("terceiro");
			}
			else{
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}
}
