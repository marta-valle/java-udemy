package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _0002EstoqueClass {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados do produto:");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("Valor:");
		double valor = sc.nextDouble();
		System.out.println("Quantidade em estoque:");
		int quantidade = sc.nextInt();

		double total = (double) valor * quantidade;

		System.out.println("Apresente os valores Inseridos informando também o somatório do valor dos produtos.");
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", nome, valor, quantidade, total);
		
		System.out.println("Se deseja inserir itens ao estoque?");
		System.out.println("Digite: I ; Se deseja Incluir");
		System.out.println("Digite: E ; Se deseja Excluir");
		System.out.println("Digite: qualquer outra opção se desejar sair");
		char resp = sc.next().charAt(0);
		
		while (resp == 'I' || resp == 'E')
			if (resp == 'I') {

				System.out.println("Entre com o numero de produtos a serem adicionados ao estoque");

				int quantidade1 = sc.nextInt();
				quantidade = quantidade + quantidade1;

				total = (double) valor * quantidade;

				System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", nome, valor, quantidade,
						total);
				System.out.println("Se deseja inserir itens ao estoque?");
				System.out.println("Digite: I ; Se deseja Incluir");
				System.out.println("Digite: E ; Se deseja Excluir");
				System.out.println("Digite: qualquer outra opção se desejar sair");
				resp = sc.next().charAt(0);
				
			} else if (resp == 'E') {
				System.out.println("Entre com o numero de produtos a serem Retirados do estoque");
				int quantidade1 = sc.nextInt();
				quantidade1 = sc.nextInt();
				quantidade = quantidade - quantidade1;
				total = (double) quantidade * valor;

				System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", nome, valor, quantidade,
						total);
				System.out.println("Se deseja inserir itens ao estoque?");
				System.out.println("Digite: I ; Se deseja Incluir");
				System.out.println("Digite: E ; Se deseja Excluir");
				System.out.println("Digite: qualquer outra opção se desejar sair");
				resp = sc.next().charAt(0);
			}

		sc.close();

	}

}
