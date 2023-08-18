package gamerscar.controller;

import java.text.NumberFormat;
import java.util.ArrayList;

import gamerscar.model.Carrinho;
import gamerscar.model.Produto;
import gamerscar.repository.CarrinhoRepository;

public class CarrinhoController implements CarrinhoRepository {
	ArrayList<Carrinho> itensCarrinho = new ArrayList<Carrinho>();

	@Override
	public void adicionarProdutoCarrinho(Produto produto, int quantidade) {

		int id = 0;

		for (Carrinho item : itensCarrinho) {
			id = item.getId();
		}

		itensCarrinho.add(new Carrinho(id + 1, produto.getNome(), quantidade, produto.getValor()));
	}

	@Override
	public void listarProdutosCarrinho() {
		for (var item : itensCarrinho) {
			item.exibirCarrinho();
		}
	}

	@Override
	public Carrinho obterProdutoCarrinho(int id) {
		for (var item : itensCarrinho) {
			if (item.getId() == id) {
				return item;
			}
		}

		return null;
	}

	@Override
	public void atualizarProdutoCarrinho(Carrinho item) {
		var itemAntigo = obterProdutoCarrinho(item.getId());

		if (itemAntigo != null) {
			itensCarrinho.set(itensCarrinho.indexOf(itemAntigo), item);
		}
	}

	@Override
	public boolean excluirProdutoCarrinho(int id) {
		var item = obterProdutoCarrinho(id);

		if (item != null) {
			return itensCarrinho.remove(item);
		}

		return false;
	}

	@Override
	public boolean verificarCarrinhoVazio() {
		return itensCarrinho.isEmpty();
	}

	@Override
	public void mostrarTotalCarrinho() {
		double valorTotalCompra = 0;

		for (Carrinho item : itensCarrinho) {
			valorTotalCompra += item.obterTotal();
		}

		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		moeda.setMinimumFractionDigits(2);
		String formatoMoeda = moeda.format(valorTotalCompra);

		System.out.println("TOTAL                                                            "
				+ String.format("%-15s", formatoMoeda));
	}

	@Override
	public void limparCarrinho() {
		itensCarrinho.clear();
	}

}
