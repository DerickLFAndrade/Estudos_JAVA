
public class Obj {
	private String objeto;
	private int numero;
	private double price;

	public Obj(String objeto, int numero, double price) {
		this.objeto = objeto;
		this.numero = numero;
		this.price = price;
	}

	public Obj(String objeto, int numero) {
		this.objeto = objeto;
		this.numero = numero;
	}

	public Obj() {

	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public int getnumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
