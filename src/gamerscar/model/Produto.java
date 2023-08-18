package gamerscar.model;

import java.text.NumberFormat;

//Class abstração de algo do mundo real
public class Produto {

	// Atributos/Propriedades -> Caracteristicas do produto
	private int id;
	private String nome;
	private String marca;
	private String cor;
	private float valor;

	// Construtor por que carrega o mesmo nome da minha classe
	// Construtor primeiro metodo chamado na classe
	public Produto(int id, String nome, String marca, String cor, float valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.valor = valor;
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Metodos expecificos
	public void exibirProduto() {
		System.out.println(formatarId() + formatarNome() + formatarMarca() + formatarCor() + formatarValor());
	}

	private String formatarId() {
		String idZeroEsquerda = String.format("%02d", id);
		return String.format("%-6s", idZeroEsquerda);
	}

	private String formatarNome() {
		String novoNome = nome;

		if (nome.length() > 24) {
			novoNome = nome.substring(0, 21) + "...";
		}

		return String.format("%-28s", novoNome);
	}

	private String formatarMarca() {

		String novaMarca = marca;

		if (marca.length() > 13) {
			novaMarca = marca.substring(0, 10) + "...";
		}

		return String.format("%-17s", novaMarca);
	}

	private String formatarCor() {
		return String.format("%-18s", cor);
	}

	public String formatarValor() {
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		moeda.setMinimumFractionDigits(2);
		String formatoMoeda = moeda.format(valor);

		return String.format("%-11s", formatoMoeda);
	}
}
