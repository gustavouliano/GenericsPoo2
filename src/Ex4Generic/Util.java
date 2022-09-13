package Ex4Generic;

public class Util {

	public static<K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
	public static<T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray) {
			//Se retornar maior que 0, significa que é maior que o elemento comparado.
			if (e.compareTo(elem) > 0) {
				count++;
			}
		}
		return count;
	}
	
}
