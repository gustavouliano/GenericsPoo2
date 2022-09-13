package Ex1;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Banana> list = new ArrayList<Banana>();
		Banana b = new Banana("Branca", "Brasil");
		list.add(b);
		Banana b1 = list.get(0);
		System.out.println(b1.toString());
		
//		List list = new ArrayList();
//		Banana b = new Banana("Branca", "Brasil");
//		list.add(b);
//		Banana b1 = (Banana)list.get(0);
//		System.out.println(b1.toString());

	}

}
