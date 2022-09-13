package At04;

import java.util.ArrayList;
import java.util.List;

public class ClassePrincipal<T> {
	
	private List<Conteudo<T>> lista = new ArrayList<Conteudo<T>>();

	public List<Conteudo<T>> getLista() {
		return lista;
	}

	public void setLista(List<Conteudo<T>> lista) {
		this.lista = lista;
	}
	
	public boolean add(Conteudo<T> newConteudo) {
		for (Conteudo<T> conteudo : this.lista) {
			if (conteudo.getChave() == newConteudo.getChave()) {
				return false;
			}
		}
		this.lista.add(newConteudo);
		return true;
	}
	

}
