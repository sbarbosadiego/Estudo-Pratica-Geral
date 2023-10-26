package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.consultaGeral();
		
		for(Produto produto: produtos) {
			System.out.println(produto.getNome());
		}
		
		double precoTotal = produtos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t+p)
				.doubleValue();
		
		System.out.println(String.format("Valor Total: %.2f", precoTotal));
		
		dao.fechar();
		
	}

}
