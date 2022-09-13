package At01;

public class main {

	public static void main(String[] args) {
		
		GenericClass<String> genericClassStr = new GenericClass<String>("a");
		GenericClass<Integer> genericClassInt = new GenericClass<Integer>(1);
		GenericClass<Pessoa> genericClassPes = new GenericClass<Pessoa>(new Pessoa());
		
		System.out.println(genericClassStr.getValor());
		System.out.println(genericClassInt.getValor());
		System.out.println(genericClassPes.getValor().toString());

	}

}
