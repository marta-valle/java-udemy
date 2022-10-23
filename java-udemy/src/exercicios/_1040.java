package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1040 {

	public static void main(String[] args) {
		/* Concluido( tive dificuldade na escolha do tipo de variavel. Usei double, porem a resposta n�o estava t�o precisa)
		 * 
		 * Leia quatro n�meros (N1, N2, N3, N4),
		 * cada um deles com uma casa decimal, correspondente �s quatro notas de um aluno.
		 *  Calcule a m�dia com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta m�dia acompanhada pela mensagem "Media: ".
		 *   Se esta m�dia for maior ou igual a 7.0,
		 *   imprima a mensagem "Aluno aprovado.".
		 *    Se a m�dia calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
		 *    Se a m�dia calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

		No caso do aluno estar em exame, leia um valor correspondente � nota do exame obtida pelo aluno. 
		Imprima ent�o a mensagem "Nota do exame: " acompanhada pela nota digitada.
		Recalcule a m�dia (some a pontua��o do exame com a m�dia anteriormente calculada e divida por 2).
		 e imprima a mensagem "Aluno aprovado." (caso a m�dia final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a m�dia tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado ap�s ter pego exame) apresente na �ltima linha uma mensagem "Media final: " seguido da m�dia final para esse aluno.

		Entrada
			A entrada cont�m quatro n�meros de ponto flutuante correspendentes as notas dos alunos.

		Sa�da
			Todas as respostas devem ser apresentadas com uma casa decimal.
			As mensagens devem ser impressas conforme a descri��o do problema. N�o esque�a de imprimir o enter ap�s o final de cada linha, caso contr�rio obter� "Presentation Error".*/
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float media, mediaf;

        media =(a*2f+ b*3f + c*4f + d*1f )/10f;  // Poderia declarar o m�dia float aqui, como "float media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;"
        System.out.printf("Media: %.1f%n", media);

		if(media >= 7f) {
				System.out.println("Aluno aprovado." );
		}
		else if( media <= 4.9 ) {
			System.out.println("Aluno reprovado.");
		}
		else if( media >= 5f && media <= 6.9 ) {
			System.out.println("Aluno em exame.");
						
			float nota = sc.nextFloat();
			
			mediaf = ( nota + media)/2f;
			System.out.printf("Nota do exame: %.1f%n", nota);
			
			if(mediaf >= 5f) {
					System.out.println("Aluno aprovado.");
				}
				else {
					System.out.println("Aluno reprovado.");
				}
			System.out.printf("Media final: %.1f%n", mediaf);
		}	
	  sc.close();	
	}
}
