package gamerscar.util;

import java.util.ArrayList;

import gamerscar.model.Departamento;
import gamerscar.model.Produto;

public class DadosIniciais {

	public static ArrayList<Departamento> getDados() {
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

		departamentos.add(new Departamento(1, "Acessórios", getAcessorios()));
		departamentos.add(new Departamento(2, "Espaço Gamer", getEspacoGamer()));
		departamentos.add(new Departamento(3, "Xbox", getXbox()));
		departamentos.add(new Departamento(4, "Playstation", getPlaystation()));
		departamentos.add(new Departamento(5, "Nintendo", getNintendo()));
		departamentos.add(new Departamento(6, "Computadores", getComputadores()));

		return departamentos;
	}

	private static ArrayList<Produto> getAcessorios() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto(1, "Mouse Gamer Pro", "HyperX", "Vermelho", 89.99f));
		produtos.add(new Produto(2, "Teclado Mecânico", "Logitech", "RGB", 149.99f));
		produtos.add(new Produto(3, "Headset Surround", "Razer", "Preto/Verde", 129.99f));
		produtos.add(new Produto(4, "Mousepad XL", "SteelSeries", "Preto", 34.99f));
		produtos.add(new Produto(5, "Cadeira Gamer Ergonômica", "DXRacer", "Preto/Azul", 299.99f));
		produtos.add(new Produto(6, "Controle Bluetooth", "8BitDo", "Branco", 49.99f));
		produtos.add(new Produto(7, "Fone de Ouvido Bluetooth", "Sony", "Preto", 89.99f));
		produtos.add(new Produto(8, "Tapete de Mouse RGB", "Corsair", "RGB", 59.99f));
		produtos.add(new Produto(9, "Suporte para Headset", "Cooler Master", "Preto/Vermelho", 19.99f));
		produtos.add(new Produto(10, "Kit Iluminação LED", "NZXT", "RGB", 29.99f));

		return produtos;
	}

	private static ArrayList<Produto> getEspacoGamer() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto(1, "Cadeira Gamer XL", "DXRacer", "Preto/Vermelho", 349.99f));
		produtos.add(new Produto(2, "Mesa Gamer Ajustável", "Arozzi", "Preto", 249.99f));
		produtos.add(new Produto(3, "Estante de Armazenamento", "Atlantic", "Preto", 129.99f));
		produtos.add(new Produto(4, "Tapete de Borracha", "Razer", "Preto", 39.99f));
		produtos.add(new Produto(5, "Luminária de Chão LED", "Philips", "Preto", 79.99f));
		produtos.add(new Produto(6, "Prateleira para Jogos", "Ikea", "Branco", 59.99f));
		produtos.add(new Produto(7, "Mural de Pôster Gamer", "Deco Gamer", "Preto", 29.99f));
		produtos.add(new Produto(8, "Almofada de Pescoço Gamer", "Cushy Life", "Preto/Vermelho", 19.99f));
		produtos.add(new Produto(9, "Cortina Blackout Gamer", "GamersHome", "Preto", 49.99f));
		produtos.add(new Produto(10, "Tapete Gamer Grande", "HyperX", "Preto", 69.99f));

		return produtos;
	}

	private static ArrayList<Produto> getXbox() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto(1, "Console Xbox Series X", "Microsoft", "Preto", 499.99f));
		produtos.add(new Produto(2, "Controle Sem Fio", "Xbox", "Branco", 59.99f));
		produtos.add(new Produto(3, "Jogo Halo Infinite", "343 Industries", "DVD", 59.99f));
		produtos.add(new Produto(4, "Assinatura Xbox Game Pass", "Microsoft", "Digital", 14.99f));
		produtos.add(new Produto(5, "Fone de Ouvido Xbox", "Razer", "Preto/Verde", 79.99f));
		produtos.add(new Produto(6, "Carregador de Controle", "Nyko", "Preto", 19.99f));
		produtos.add(new Produto(7, "Capa Protetora Console", "PDP", "Preto", 24.99f));
		produtos.add(new Produto(8, "Suporte Vertical Xbox", "Elevate", "Preto", 9.99f));
		produtos.add(new Produto(9, "Kit Limpeza Xbox", "Game Clean", "Branco", 14.99f));
		produtos.add(new Produto(10, "Adaptador Wireless", "Xbox", "Preto", 29.99f));

		return produtos;
	}

	private static ArrayList<Produto> getPlaystation() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto(1, "Console PlayStation 5", "Sony", "Branco", 499.99f));
		produtos.add(new Produto(2, "Controle DualSense", "Sony", "Preto", 69.99f));
		produtos.add(new Produto(3, "Jogo The Last of Us Part II", "Naughty Dog", "Blu-ray", 39.99f));
		produtos.add(new Produto(4, "Assinatura PlayStation Plus", "Sony", "Digital", 9.99f));
		produtos.add(new Produto(5, "Headset Sem Fio", "PlayStation", "Preto", 79.99f));
		produtos.add(new Produto(6, "Carregador DualSense", "Nyko", "Preto", 19.99f));
		produtos.add(new Produto(7, "Capa Protetora Console", "PDP", "Preto", 24.99f));
		produtos.add(new Produto(8, "Suporte Vertical PlayStation", "Elevate", "Preto", 9.99f));
		produtos.add(new Produto(9, "Kit Limpeza PlayStation", "Game Clean", "Branco", 14.99f));
		produtos.add(new Produto(10, "Adaptador Wireless", "PlayStation", "Preto", 29.99f));

		return produtos;
	}

	private static ArrayList<Produto> getNintendo() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto(1, "Console Nintendo Switch", "Nintendo", "Azul/Vermelho", 299.99f));
		produtos.add(new Produto(2, "Controle Pro Nintendo Switch", "Nintendo", "Preto", 79.99f));
		produtos.add(new Produto(3, "Jogo Mario Kart 8 Deluxe", "Nintendo", "Cartucho", 49.99f));
		produtos.add(new Produto(4, "Assinatura Nintendo Switch Online", "Nintendo", "Digital", 19.99f));
		produtos.add(new Produto(5, "Case Protetora Console", "HORI", "Preto", 24.99f));
		produtos.add(new Produto(6, "Capa de Silicone Joy-Con", "PDP", "Azul/Vermelho", 14.99f));
		produtos.add(new Produto(7, "Fone de Ouvido Nintendo", "HORI", "Preto", 29.99f));
		produtos.add(new Produto(8, "Suporte de Carregamento", "Nyko", "Preto", 34.99f));
		produtos.add(new Produto(9, "Pelúcia Personagem Nintendo", "Nintendo", "Vários", 9.99f));
		produtos.add(new Produto(10, "Protetor de Tela Nintendo Switch", "HORI", "Transparente", 7.99f));

		return produtos;
	}

	private static ArrayList<Produto> getComputadores() {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		produtos.add(new Produto(1, "PC Gamer High-End", "GamerTech", "Preto/Vermelho", 1999.99f));
		produtos.add(new Produto(2, "Notebook Ultrafino", "UltraBook", "Prata", 899.99f));
		produtos.add(new Produto(3, "Monitor Curvo 4K", "ViewSonic", "Preto", 499.99f));
		produtos.add(new Produto(4, "Teclado Mecânico RGB", "Corsair", "RGB", 129.99f));
		produtos.add(new Produto(5, "Mouse Sem Fio Ergonômico", "Logitech", "Preto", 59.99f));
		produtos.add(new Produto(6, "HD Externo 1TB", "Seagate", "Preto", 59.99f));
		produtos.add(new Produto(7, "Webcam Full HD", "Logitech", "Preto", 79.99f));
		produtos.add(new Produto(8, "Cadeira Ergonômica", "ErgoLife", "Preto", 199.99f));
		produtos.add(new Produto(9, "Roteador Wi-Fi Dual Band", "TP-Link", "Preto", 49.99f));
		produtos.add(new Produto(10, "Mousepad Extra Grande", "SteelSeries", "Preto", 29.99f));

		return produtos;
	}

}
