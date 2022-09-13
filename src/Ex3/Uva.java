package Ex3;

public class Uva {

	private String cor;
	
	public Uva(String cor) {
		this.setCor(cor);
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Uva [cor=");
		builder.append(cor);
		builder.append("]");
		return builder.toString();
	}
	
}
