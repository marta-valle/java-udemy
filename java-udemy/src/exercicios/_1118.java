package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _1118 {

	public static void main(String[] args) {
		/* 13/10/2022 completo
		 * Escreva um programa para ler as notas da primeira e a segunda avalia��o de um aluno.
		 *  Calcule e imprima a m�dia semestral. O programa s� dever� aceitar notas v�lidas
		 *  (uma nota v�lida deve pertencer ao intervalo [0,10]). 
		 *  Cada nota deve ser validada separadamente.

			No final deve ser impressa a mensagem �novo calculo (1-sim 2-nao)�,
			 solicitando ao usu�rio que informe um c�digo (1 ou 2) indicando se ele deseja ou n�o executar o algoritmo novamente, (aceitar apenas os c�digo 1 ou 2). Se for informado o c�digo 1 deve ser repetida a execu��o de todo o programa para permitir um novo c�lculo, caso contr�rio o programa deve ser encerrado.

		Entrada
			O arquivo de entrada cont�m v�rios valores reais, positivos ou negativos.
			Quando forem lidas duas notas v�lidas, deve ser lido um valor inteiro X .
			O programa deve parar quando o valor lido para este X for igual a 2.

		Sa�da
			Se uma nota inv�lida for lida, deve ser impressa a mensagem �nota invalida�.
			Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem �media = � seguido do valor do c�lculo.

			Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada padr�o para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

			A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int resp;
        double media;

        do {
            double nota1 = sc.nextDouble();
            /* se colocar If, e digitar 2 x errado, o segundo numero � aceito, por isso precisa ser repeti��o*/
            while (nota1 < 0.0 || nota1 > 10.0) {
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }

            double nota2 = sc.nextDouble();

            while (nota2 < 0 || nota2 > 10.0) {
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }

            media = (nota1 + nota2) / 2;

            System.out.printf("media = %.2f%n", media);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                resp = sc.nextInt();
            } while (resp != 1 && resp != 2);

        } while (resp == 1);

        sc.close();
    }
}
