package gamerscar.util;

public class AsciiArt {
	public static void exibirImagemLogo() {
		System.out.println(        
				Cores.TEXT_BLACK + Cores.ANSI_BLACK_BACKGROUND + "                                                                                ");
		System.out.println(Cores.TEXT_YELLOW + "                           ▄████▄              " + Cores.TEXT_RED + " ▒▒▒▒▒                           ");
		System.out.println(Cores.TEXT_YELLOW + "                          ███▄█▀               " + Cores.TEXT_RED + "▒ ▄▒ ▄▒                          ");
		System.out.println(Cores.TEXT_YELLOW + "                          ████    GAMERS CAR   " + Cores.TEXT_RED + "▒▒▒▒▒▒▒                          ");
		System.out.println(Cores.TEXT_YELLOW + "                          █████▄               " + Cores.TEXT_RED + "▒▒▒▒▒▒▒                          ");
		System.out.println(Cores.TEXT_YELLOW + "                           ▀████▀              " + Cores.TEXT_RED + "▒ ▒ ▒ ▒                          "
				+ Cores.TEXT_RESET);
	}

	public static void exibirImagemGameOver() {
		System.out.println(
				Cores.TEXT_BLACK + Cores.ANSI_BLACK_BACKGROUND + "                                                                                ");
		System.out.println(Cores.TEXT_YELLOW + "                           ▄████▄              " + Cores.TEXT_BLUE + " ▒▒▒▒▒                           ");
		System.out.println(Cores.TEXT_YELLOW + "                          ███▄█▀               " + Cores.TEXT_BLUE + "▒ ▄▒ ▄▒                          ");
		System.out.println(Cores.TEXT_YELLOW + "                          ████    GAME OVER    " + Cores.TEXT_BLUE + "▒▒▒▒▒▒▒                          ");
		System.out.println(Cores.TEXT_YELLOW + "                          █████▄               " + Cores.TEXT_BLUE + "▒▒▒▒▒▒▒                          ");
		System.out.println(Cores.TEXT_YELLOW + "                           ▀████▀              " + Cores.TEXT_BLUE + "▒ ▒ ▒ ▒                          ");
		System.out.println("                                                                                " + Cores.TEXT_RESET);
	}

	public static void exibirImagemDepartamentos() {
		System.out.println(
				Cores.TEXT_BLACK + Cores.ANSI_BLACK_BACKGROUND + "                                                                                ");
		System.out.println(Cores.TEXT_YELLOW + "                           ─▄▀▀  DEPARTAMENTOS  ▀▀▄                             ");
		System.out.println(Cores.TEXT_YELLOW + "                           █░░░░█░░░░░░░░░░░▄▄░██░░█                            ");
		System.out.println(Cores.TEXT_YELLOW + "                           █░░▀▀█▀▀░▄▀░▄▀░░░▀▀░▄▄░░█                            ");
		System.out.println(Cores.TEXT_YELLOW + "                           █░░░░▀░░░▄▄▄▄▄▄▄ ██░▀▀░░█                            ");
		System.out.println(Cores.TEXT_YELLOW + "                           ─▀▄▄▄▄▄▄▄▀─────▀▄▄▄▄▄▄▄▀                             "+ Cores.TEXT_RESET);
	}
	
	public static void exibirImagemProdutos() {
		System.out.println(
				Cores.TEXT_BLACK + Cores.ANSI_BLACK_BACKGROUND + "                                                                                ");
		System.out.println(Cores.TEXT_YELLOW + "                           ─▄▀▀    PRODUTOS     ▀▀▄                             ");
		System.out.println(Cores.TEXT_YELLOW + "                           █░░░░█░░░░░░░░░░░▄▄░██░░█                            ");
		System.out.println(Cores.TEXT_YELLOW + "                           █░░▀▀█▀▀░▄▀░▄▀░░░▀▀░▄▄░░█                            ");
		System.out.println(Cores.TEXT_YELLOW + "                           █░░░░▀░░░▄▄▄▄▄▄▄ ██░▀▀░░█                            ");
		System.out.println(Cores.TEXT_YELLOW + "                           ─▀▄▄▄▄▄▄▄▀─────▀▄▄▄▄▄▄▄▀                             "+ Cores.TEXT_RESET);
	}

	public static void exibirImagemCarrinho() {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
				+ "                                                                                ");
		System.out.println(Cores.TEXT_YELLOW + "                                                    ██████                      ");
		System.out.println(Cores.TEXT_YELLOW + "                                                    ██                          ");
		System.out.println(Cores.TEXT_YELLOW + "                          ████████████████████████████                          ");
		System.out.println(Cores.TEXT_YELLOW + "                          ████                      ██                          ");
		System.out.println(Cores.TEXT_YELLOW + "                            ██                      ██                          ");
		System.out.println(Cores.TEXT_YELLOW + "                            ██       CARRINHO       ██                          ");
		System.out.println(Cores.TEXT_YELLOW + "                            ██                                                  ");
		System.out.println(Cores.TEXT_YELLOW + "                            ██                    ██                            ");
		System.out.println(Cores.TEXT_YELLOW + "                              ██████████████████████                            ");
		System.out.println(Cores.TEXT_YELLOW + "                                                  ██                            ");
		System.out.println(Cores.TEXT_YELLOW + "                              ██████████████████████                            ");
		System.out.println(Cores.TEXT_YELLOW + "                               ██  ██       ██  ██                              ");
		System.out.println(Cores.TEXT_YELLOW + "                               ██████       ██████                              ");
		System.out.println("                                                                                " + Cores.TEXT_RESET);
	}
	
	public static void exibirQrCode() {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
				+ "                                                                                ");
		System.out.println("         █████████████    ██       ██  ██   ▐█████  ████ ▐█████████████         ");
        System.out.println("         ██         ██  ████ ▐███████  ████ ▐███▌ ██     ▐█▌         ██         ");
        System.out.println("         ██  █████▌ ██  ▄▄██▀██▌ ╟█  ████  ▀▌ ▐█▌  ▄▀▀   ▐█▌ ╟█████  ██         ");
        System.out.println("         ██  █████▌ ██  ▀▀▀▀▄▄▀▌▄╨▀  ▀▀▀▀   ╓▄██▄▄▀▀  ▄▄ ▐█▌ ╟█████  ██         ");
        System.out.println("         ██  ▀▀▀▀▀  ██  ▄▄  █▌  ▀╔▄▄▄▄▄▄▄▄▄ ▐█▌▀▀▀▄▄  ██ ▐█▌  ▀▀▀▀▀  ██         ");
        System.out.println("         █████████████  ██  █▌ ▐█▌ ██  ██ ▐█▌ ▐█  ██  ██ ▐█████████████         ");
        System.out.println("                               ▐█▌     ██  ███████  ██                          ");
        System.out.println("         █████████▌ ▐████████▌ ▐█    ███████▌   ████    ██ ▐█▌ ██  ██           ");
        System.out.println("         ▄▄▀▀▀▀▀▌▄▄▄▄▄  ▄▄██  ▄▄▄▄▄████▀▀▄▄   ▐█▀▀██▀▀██  ▀██▄▄██▀▀▄▄           ");
        System.out.println("         ▀▀▄▄▄▄  ▀██▀▀▄▄████▄▄█▌▀▀▀██▀▀▄▄██▄▄▄███▄██  ▀▀  ▄▌▀▀▀▀▀▄▄██▄▄         ");
        System.out.println("         ▄███▀     ▀██▀▀████▀▐█▌ ╔█████████▀▀▀██▀▀██  █████▌     ████▀          ");
        System.out.println("         ██    █▌         ████ ▐█▌   ████     ▐███  ████ ▐█▌   ████             ");
        System.out.println("         ██  █████▌ ██  ████     ╟███    ██       ██    █▌   ╟███  ██           ");
        System.out.println("          ▄    ▄▐▀██▄▄  ▀▀▄▄▄  ▐█▌    ▄██▀▀▀▀▀▀▀██  ▀▀    ▀▌▄   ▄█▀██▀▀         ");
        System.out.println("         ▀▀▄▄  ██▄ ▀▀▀  ▄▄▀▀█▌ └▀  ▄▄██▀▀   ╓▄  ██▄▄  ▄▄▄▄▄▄█▄▄▀▀▄▄▀▀           ");
        System.out.println("         ▄▄██▄▄███▌ ╔▄▄▄▀▀▄▄▀▀▄▄▄  ▀▀██  ▄▄ ▐█▌  ▀██  ████▀▀████▄▀▀  ▄▄         ");
        System.out.println("                ▐███▌   ███████▌       █████████    ██   ▐█▌         ██         ");
        System.out.println("         ██    █▌   ████  █████▌     ████     ▐█████    █████▌     ██           ");
        System.out.println("         ██████ ▐███  ██  ██   ▐███▄   ██   ▐█████    █████▌     ██  ██         ");
        System.out.println("         ██  ▀▀▄   ▄█▀▄▄▄▄▀▀▄   ▄███▀▀▀▄▄▀▀▄▐█▌▄  ▀▀▄▄▀▀▀▀▄  ╚▀▄▄  ████         ");
        System.out.println("         ██    ██▄██▄▄██▀▀▄▄█▌ ▐█▀▀▄▄▄▄██  ▀▀▀▀▀╔▄▄▄▀▀▄▄▄▄██▄▄▄██  ▀▀▀▀         ");
        System.out.println("         ▀▀    ▀▀▀▀▀▀▀▀▀█▄███▌  ▀   ▀▀▀██   ▐▄  ██▀▀█▄██▀▀▀▀▀██▀▀█▄             ");
        System.out.println("         █████████████  █████████▌     ████   ▐█▌ ██████  █▌ ╟█    ██           ");
        System.out.println("         ██         ██    █████▌   ██████   ▐███▌     ██     ╟███    ██         ");
        System.out.println("         ██  █████▌ ██  ██  ███▌     ███████▌   ██▄   ███████████▄   █▀         ");
        System.out.println("         ██  █████▌ ██  ██     └▀██████▀▀▄▄▀▀  ▄▀▀▀▀▄▄████▀▌▄▄▄▀▀▀▀▀▀           ");
        System.out.println("         ██  ▀▀▀▀▀  ██  ██     ╒▄██▀▀▀▀▄▄▀▀▄▄▄██▌   ██▀▀▀▀ ▐████▄▄▄▄▄▄▄         ");
        System.out.println("         █████████████  ████   ▐█▌ █████████▌ ▐█▌ ████    █▌   ██▀ ██           ");
        System.out.println("                                                                                " + Cores.TEXT_RESET);
	}
	
	
}
