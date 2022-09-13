package Ex4Generic;

public class main {

	public static void main(String[] args) {
		
//		Pair<Integer, String> p1 = new Pair<>(1, "apple");
//		Pair<Integer, String> p2 = new Pair<>(1, "apple");
		
//		boolean same = Util.<Integer, String>compare(p1, p2);
//		boolean same = Util.compare(p1, p2); // Por inferência
//		System.out.println(same);

		Integer[] meuArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer valor = 3;
		int cont = Util.<Integer>countGreaterThan(meuArray, valor);
		System.out.println(cont);
	}

}
