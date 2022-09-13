package At03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<ProdutoX> lista = new ArrayList<ProdutoX>();

	public List<ProdutoX> getLista() {
		return lista;
	}

	public void setLista(List<ProdutoX> lista) {
		this.lista = lista;
	}
	
	public void addLista(ProdutoX produto) {
		this.lista.add(produto);
	}
	
	public String showLista() {
		String text = "";
		for(ProdutoX produto : this.lista) {
			text += produto.toString() + "\n";
		}
		return text;
	}
	
}
