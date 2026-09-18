package poo;

public class CocheDeportivo extends Coche {
	public CocheDeportivo(String marcaInicial) {
		super(marcaInicial);
	}
	
	@Override
	public void acelerar() {
		velocidad = velocidad + 20;
	}
	
	
	public void turbo() {
		acelerar();
		acelerar();
		acelerar();
	}
	
}
