package At02;

public class main {

	public static void main(String[] args) {
		
		Produto<Integer> produtoInt = new Produto<Integer>();
		Produto<String> produtoStr = new Produto<String>();
		produtoInt.setId(1);
		produtoStr.setId("um");
	}

}
