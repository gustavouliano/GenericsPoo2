package At03;

public class main {

	public static void main(String[] args) {
		ProdutoX p1 = new ProdutoX("Produto 1", 30);
		ProdutoX p2 = new ProdutoX("Produto 2", 50);
		ProdutoX p3 = new ProdutoX("Produto 3", 90);

		Pedido pedido = new Pedido();
		pedido.addLista(p1);
		pedido.addLista(p2);
		pedido.addLista(p3);
		System.out.println(pedido.showLista());
		
	}

}
