package gamerscar.model;

import java.util.ArrayList;

public class Departamento {

	// Atributos/Propriedades -> Caracteristicas do Departamento
	private int id;
	private String nome;
	private ArrayList<Produto> produtos;

	public Departamento(int id, String nome, ArrayList<Produto> produtos) {
		super();
		this.id = id;
		this.nome = nome;
		this.produtos = produtos;
	}

	// Getters e Setters
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

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	// Metodos especficos
	public void exibirDepartamento() {
		System.out.println(formatarId() + " - " + formatarNome());
	}
	
	private String formatarId() {
		return String.format("%31s", id);
	}
	
	private String formatarNome() {
		return String.format("%-46s", nome);
	}
}
