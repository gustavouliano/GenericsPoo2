package At04;

import java.util.List;

public class main {

	public static void main(String[] args) {
		
		ClassePrincipal<Integer> principal = new ClassePrincipal<Integer>();
		Conteudo<Integer> c1 = new Conteudo<Integer>("Chave1", 5);
		Conteudo<Integer> c2 = new Conteudo<Integer>("Chave1", 10);
//		Conteudo<String> c3 = new Conteudo<String>("Chave2", "cinquentão");
		Conteudo<Integer> c4 = new Conteudo<Integer>("Chave2", 50);
		
		System.out.println(principal.add(c1));
		System.out.println(principal.add(c2));
		System.out.println(principal.add(c4));
//		System.out.println(principal.add(c3));
		
		List<Conteudo<Integer>> list = principal.getLista();
		for (Conteudo<Integer> conteudo : list) {
			System.out.println(conteudo.toString());
		}
		
	}

}
