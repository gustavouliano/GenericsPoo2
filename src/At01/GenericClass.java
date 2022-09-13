package At01;

public class GenericClass<T> {
	private T valor;
	
	public GenericClass(T valor) {
		this.setValor(valor);
	}
	
	public T getValor() {
		return this.valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
}
