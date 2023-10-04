package application;

import java.util.Scanner;
import entidades.produto;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		produto produto1 = new produto();
		System.out.println("Digite o nome do produto:");
		produto1.nome = sc.nextLine();
		System.out.println("Digite o preço do produto");
		produto1.preco = sc.nextDouble();
		System.out.println("Digite a quantidade em estoque:");
		produto1.quantidade = sc.nextInt();
		System.out.printf("%s -- R$%.2f -- %d --> Total em estoque: R$%.2f\n", produto1.nome, produto1.preco,
				produto1.quantidade, produto1.valorTotalNoEstoque());
		System.out.println("Digite a quantidade de produtos que deseja adcionar no estoque:");
		produto1.addProduto(sc.nextInt());
		System.out.printf("%s -- R$%.2f -- %d --> Total em estoque: R$%.2f\n", produto1.nome, produto1.preco,
				produto1.quantidade, produto1.valorTotalNoEstoque());
		System.out.println("Digite a quantidade de produtos que deseja remover no estoque:");
		produto1.removeProduto(sc.nextInt());
		System.out.printf("%s -- R$%.2f -- %d --> Total em estoque: R$%.2f\n", produto1.nome, produto1.preco,
				produto1.quantidade, produto1.valorTotalNoEstoque());

		sc.close();
	}
}
