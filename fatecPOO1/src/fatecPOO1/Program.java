package fatecPOO1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author evandro
 *
 *         Tarefa 1 - Implementação orientada a objetos para produtor rural
 * 
 *         Implemente um código orientado a objetos para permitir que um
 *         produtor rural, que participa de diferentes feiras em sua cidade,
 *         possa saber quanto ele tem de estoque de cada produto que vende
 *         (laranja, limão, maçã etc.) quanto cada lote de produto vence e
 *         quanto ele ganhou em cada uma das feiras nas quais participou.
 */

public class Program {

	public static void main(String[] args) {

		List<Feira> listaFeiras = new ArrayList<Feira>();

		boolean flag = true;

		do {

			System.out.println();
			telaAbertura();

			switch (escolhaOpcao()) {
			case 1:
				listaFeiras.addAll(adicionarFeira());
				break;
			case 2:
				listarFeiras(listaFeiras);
				break;
			case 3:
				procurarFeiras(listaFeiras);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
			}
		} while (flag);
		System.out.println("Obrigado! Volte sempre");
	}

	public static void telaAbertura() {

		System.out.println("-------------------------------");
		System.out.println("------- Lista de Feiras -------");
		System.out.println("-------------------------------");
		System.out.println();
	}

	public static int escolhaOpcao() {
		Scanner sc = new Scanner(System.in);

		System.out.println("[ 1 ] Adicionar feira");
		System.out.println("[ 2 ] Listar Feira");
		System.out.println("[ 3 ] Procurar feira");
		System.out.println("[ 4 ] Sair");
		System.out.printf("Escolha uma opção: ");

		int escolha = sc.nextInt();

		return escolha;
	}

	public static List<Feira> adicionarFeira() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Feira> listaFeiras = new ArrayList<>();
		Feira feira = new Feira();

		System.out.print("Digite o nome da feira: ");
		String nomeFeira = sc.nextLine();
		feira.setNome(nomeFeira);

		System.out.print("Quantos produtos? ");
		int n = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {
			System.out.println();
			System.out.printf("Produto #%d%n", i);
			sc.nextLine();

			System.out.print("Nome: ");
			String nomeProd = sc.nextLine();

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			System.out.print("Validade: ");
			int validade = sc.nextInt();

			System.out.print("Valor: ");
			Double valor = sc.nextDouble();

			feira.getProdutos().add(new Produto(nomeProd, quantidade, validade, valor));

		}

		listaFeiras.add(feira);

		return listaFeiras;
	}

	public static void listarFeiras(List<Feira> listaFeiras) {

		System.out.println();
		for (Feira listar : listaFeiras) {
			System.out.printf(listar.getNome() + " ,tot vendas: R$");
			listar.exibirTotalVendas();
		}
	}

	public static void procurarFeiras(List<Feira> listaFeiras) {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.printf("Digite o nome da feira: ");
		String procurar = sc.nextLine();

		for (Feira listar : listaFeiras) {
			if (procurar.equals(listar.getNome())) {
				System.out.print(listar);
				System.out.printf("Total de vendas R$");
				listar.exibirTotalVendas();
			}
			else
				System.out.println("Feira nao encontrada!");

		}
	}
}
