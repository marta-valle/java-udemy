package exercicios;
import java.util.Locale;
import java.util.Scanner;
public class _1006 {

	public static void main(String[] args) {
		
		/*Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno.
		 * A seguir, calcule a m�dia do aluno, sabendo que a nota:
		 *  A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
		 *  Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.
		Entrada
		O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).

		Sa�da
		Imprima a mensagem "MEDIA" e a m�dia do aluno
 		com 1 d�gito ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade.
  		Assim como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
		*/
		
		//altera��o da branch secund�ria
		//altera��o na branch principal
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media , soma, a1, b1 , c1;
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		a1 = a * 2;
		b1 = b * 3;
		c1 = c * 5;
				
		soma = a1 + b1 + c1;
		media = soma/10.0;
		
		System.out.printf("MEDIA = %.1f%n" , media);

		sc.close();
	}

}
