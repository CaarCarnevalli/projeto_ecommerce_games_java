package gamerscar.repository;

import gamerscar.model.*;

public interface CarrinhoRepository {

	public void adicionarProdutoCarrinho(Produto produto, int quantidade);

	public void listarProdutosCarrinho();
	
	public Carrinho obterProdutoCarrinho(int id);

	public void atualizarProdutoCarrinho(Carrinho item);

	public boolean excluirProdutoCarrinho(int id);
	
	public void limparCarrinho();
  
	public boolean verificarCarrinhoVazio();
	
	public void mostrarTotalCarrinho();
	
}
 
