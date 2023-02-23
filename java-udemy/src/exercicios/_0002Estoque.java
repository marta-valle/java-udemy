package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _0002Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Crie um sistema para cadastro de mercadoria");
		System.out.println("Informe os dados do produto:");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Valor:");
		double valor =  sc.nextDouble();
		System.out.println("Quantidade em estoque:");
		int qnt = sc.nextInt();
		
		double total = (double) valor*qnt;
		
		System.out.println("Apresente os valores Inseridos informando também o somatório do valor dos produtos.");
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", nome , valor , qnt , total);
		System.out.println("Permita a inclusão de novos itens");
		System.out.println("Entre com o numero de produtos a serem adicionados ao estoque");
		
		int qnt1 = sc.nextInt();
		qnt = qnt + qnt1;
		
		total = (double)valor*qnt;
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", nome , valor , qnt , total);
		
		System.out.println("Permita a exclusão de novos itens");
		System.out.println("Entre com o numero de produtos a serem Retirados do estoque");
		
		qnt1 = sc.nextInt();
		qnt= qnt - qnt1;
		total = (double) qnt * valor;
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", nome , valor , qnt , total);
		System.out.println("Refaça o exercicio, melhorando o estoque em _0002EstoqueClass");
		
		sc.close();

	}

}
