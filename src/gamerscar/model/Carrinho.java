package gamerscar.model;

import java.text.NumberFormat;

public class Carrinho {

	private int id;
	private String nome;
	private int quantidade;
	private float valor;

	public Carrinho(int id, String nome, int quantidade, float valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	// Metodos expecificos
	public void exibirCarrinho() {
		System.out.println(formatarId() + formatarNome() + formatarValor(formatarMoeda(valor)) + formatarQuantidade()
				+ formatarTotal(formatarMoeda(obterTotal())));

	}

	public float obterTotal() {
		return valor * quantidade;
	}

	private String formatarMoeda(float valorMoeda) {
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		moeda.setMinimumFractionDigits(2);
		String formatoMoeda = moeda.format(valorMoeda);

		return formatoMoeda;
	}

	private String formatarId() {
		String idZeroEsquerda = String.format("%02d", id);
		return String.format("%-6s", idZeroEsquerda);
	}

	private String formatarNome() {
		String novoNome = nome;

		if (nome.length() > 28) {
			novoNome = nome.substring(0, 25) + "...";
		}

		return String.format("%-32s", novoNome);
	}

	private String formatarValor(String preco) {
		return String.format("%-13s", preco);
	}

	private String formatarQuantidade() {
		String quantidadeZeroEsquerda = String.format("%02d", quantidade);
		return String.format("%-14s", quantidadeZeroEsquerda);
	}

	private String formatarTotal(String total) {
		return String.format("%-15s", total);
	}

}
