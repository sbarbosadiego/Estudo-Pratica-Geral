package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Caneta Preta", 1.99);
		
		DAO<Produto> dao = new DAO<>(Produto.class); 
		dao.conectar().cadastrar(produto).desconectar().fechar();
		
		

	}

}
