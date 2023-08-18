package gamerscar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import gamerscar.controller.CarrinhoController;
import gamerscar.model.*;
import gamerscar.util.*;

public class Menu {

	private static ArrayList<Departamento> dados = DadosIniciais.getDados();
	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		CarrinhoController controller = new CarrinhoController();

		int opcao, departamento, produto, quantidade, operacao, produtoEditar, formaPagamento;

		while (true) {

			AsciiArt.exibirImagemLogo();
			Menus.mostrarMenuPrincipal();

			opcao = lerInteiro();

			if (opcao == 0) {
				AsciiArt.exibirImagemGameOver();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				AsciiArt.exibirImagemDepartamentos();
				Menus.mostrarMenuDepartamentos(dados);

				departamento = lerInteiro();

				for (Departamento dep : dados) {
					if (dep.getId() == departamento) {

						AsciiArt.exibirImagemProdutos();
						Menus.mostrarListaProdutos(dep.getProdutos());

						produto = lerInteiro();

						for (Produto prod : dep.getProdutos()) {
							if (prod.getId() == produto) {
								System.out.println(
										"Informe a quantidade desejada:                                                  ");
								quantidade = lerInteiro();
								controller.adicionarProdutoCarrinho(prod, quantidade);
							}
						}
					}
				}

				keyPress();
				break;
				
			case 2:
				AsciiArt.exibirImagemCarrinho();
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "********************************************************************************");
				System.out.println("ID    PRODUTO                         VALOR        QUANTIDADE    TOTAL          ");
				controller.listarProdutosCarrinho();
				System.out.println("********************************************************************************");

				if (!controller.verificarCarrinhoVazio()) {

					System.out.println(
							"Escolha uma operação:                                                           ");
					System.out.println(
							"1 - Atualizar quantidade                                                        ");
					System.out.println(
							"2 - Excluir item                                                                ");
					System.out.println(
							"3 - Excluir todos os itens                                                      ");
					System.out.println(
							"4 - Finalizar compra                                                            ");
					System.out
							.println("                                                                                "
									+ Cores.TEXT_RESET);

					operacao = lerInteiro();

					switch (operacao) {
					case 1:
						System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
								+ "Digite o id do produto que deseja atualizar:                                    "
								+ Cores.TEXT_RESET);

						produtoEditar = lerInteiro();
						var item = controller.obterProdutoCarrinho(produtoEditar);

						if (item != null) {
							System.out.println(
									"Informe a quantidade desejada:                                                  ");

							quantidade = lerInteiro();

							item.setQuantidade(quantidade);
							controller.atualizarProdutoCarrinho(item);
						} else {
							System.out.println(
									"                             Produto não encontrado:                            ");
						}

						break;

					case 2:
						System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
								+ "Digite o id do produto que deseja excluir:                                      "
								+ Cores.TEXT_RESET);

						produtoEditar = lerInteiro();

						if (controller.excluirProdutoCarrinho(produtoEditar)) {
							System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
									+ "                         Produto removido com sucesso!                          "
									+ Cores.TEXT_RESET);
						}

						break;

					case 3:
						controller.limparCarrinho();
						System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
								+ "                                Carrinho limpo!                                 "
								+ Cores.TEXT_RESET);

						break;

					case 4:
						AsciiArt.exibirImagemCarrinho();
						System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
								+ "********************************************************************************");
						System.out.println(
								"ID    PRODUTO                         VALOR        QUANTIDADE    TOTAL          ");

						if (!controller.verificarCarrinhoVazio()) {
							controller.listarProdutosCarrinho();
							System.out.println(
									"                                                                                ");
							controller.mostrarTotalCarrinho();
							System.out.println(
									"********************************************************************************");
							System.out.println(
									"Selecionar forma de pagamento:                                                  ");
							System.out.println(
									"1 - Débito                                                                      ");
							System.out.println(
									"2 - Crédito                                                                     ");
							System.out.println(
									"3 - Pix                                                                         ");
							System.out.println(
									"                                                                                "
											+ Cores.TEXT_RESET);

							formaPagamento = lerInteiro();

							switch (formaPagamento) {
							case 1:
								System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
										+ "                  Obrigado por comprar conosco, volte sempre!                   ");

								controller.limparCarrinho();

								AsciiArt.exibirImagemGameOver();
								break;
							case 2:
								System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
										+ "                  Obrigado por comprar conosco, volte sempre!                   ");

								controller.limparCarrinho();

								AsciiArt.exibirImagemGameOver();
								break;
							case 3:
								AsciiArt.exibirQrCode();
								System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
										+ "                  Obrigado por comprar conosco, volte sempre!                   ");

								controller.limparCarrinho();

								AsciiArt.exibirImagemGameOver();
								break;
							}

						} else {
							System.out.println(
									"********************************************************************************");
							System.out.println(
									"                              CARRINHO ESTA VAZIO                               "
											+ Cores.TEXT_RESET);
						}

						break;
					}

				} else {
					System.out
							.println("                              CARRINHO ESTA VAZIO                               "
									+ Cores.TEXT_RESET);
				}

				keyPress();
				break;
			case 3:
				AsciiArt.exibirImagemCarrinho();
				System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
						+ "********************************************************************************");
				System.out.println("ID    PRODUTO                         VALOR        QUANTIDADE    TOTAL          ");

				if (!controller.verificarCarrinhoVazio()) {
					controller.listarProdutosCarrinho();
					System.out.println(
							"                                                                                ");
					controller.mostrarTotalCarrinho();
					System.out.println(
							"********************************************************************************");
					System.out.println(
							"Selecionar forma de pagamento:                                                  ");
					System.out.println(
							"1 - Débito                                                                      ");
					System.out.println(
							"2 - Crédito                                                                     ");
					System.out.println(
							"3 - Pix                                                                         ");
					System.out
							.println("                                                                                "
									+ Cores.TEXT_RESET);

					formaPagamento = lerInteiro();

					switch (formaPagamento) {
					case 1:
						System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
								+ "                  Obrigado por comprar conosco, volte sempre!                   ");

						controller.limparCarrinho();

						AsciiArt.exibirImagemGameOver();

						break;
					case 2:
						System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
								+ "                  Obrigado por comprar conosco, volte sempre!                   ");

						controller.limparCarrinho();

						AsciiArt.exibirImagemGameOver();

						break;
					case 3:
						AsciiArt.exibirQrCode();
						System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
								+ "                  Obrigado por comprar conosco, volte sempre!                   ");

						controller.limparCarrinho();

						AsciiArt.exibirImagemGameOver();

						break;
					}

				} else {
					System.out.println(
							"********************************************************************************");
					System.out
							.println("                              CARRINHO ESTA VAZIO                               "
									+ Cores.TEXT_RESET);
				}

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_BLUE_BOLD + "\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}

	}

	public static int lerInteiro() {
		int numero;
		try {
			numero = leia.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "                               Digite valores inteiros!                         ");
			leia.nextLine();
			numero = 0;
		}

		return numero;
	}

	public static void keyPress() {
		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("                Você pressionou uma tecla diferente de enter!                   ");
		}
	}
}
