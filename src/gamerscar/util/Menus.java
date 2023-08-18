package gamerscar.util;

import java.util.ArrayList;

import gamerscar.model.Departamento;
import gamerscar.model.Produto;

public class Menus {
	public static void mostrarMenuPrincipal() {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
				+ "                                                                                ");
		System.out.println("********************************************************************************");
		System.out.println("                               1 - Departamentos                                ");
		System.out.println("                               2 - Carrinho                                     ");
		System.out.println("                               3 - Finalizar                                    ");
		System.out.println("                               0 - Sair                                         ");
		System.out.println("********************************************************************************");
		System.out.println("Informe o numero do menu desejado:                                              ");
		System.out.println(
				"                                                                                " + Cores.TEXT_RESET);
	}

	public static void mostrarMenuDepartamentos(ArrayList<Departamento> departamentos) {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
				+ "                                                                                ");
		System.out.println("********************************************************************************");

		for (Departamento departamento : departamentos) {
			departamento.exibirDepartamento();
		}

		System.out.println("********************************************************************************");
		System.out.println("Informe o numero do departamento desejado:                                      ");
		System.out.println(
				"                                                                                " + Cores.TEXT_RESET);
	}

	public static void mostrarListaProdutos(ArrayList<Produto> produtos) {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
				+ "                                                                                ");
		System.out.println("********************************************************************************");

		for (Produto produto : produtos) {
			produto.exibirProduto();
		}

		System.out.println("********************************************************************************");
		System.out.println("Informe o numero do produto desejado para adicionar ao carrinho:                ");
		System.out.println(
				"                                                                                " + Cores.TEXT_RESET);
	}
	
	
}
