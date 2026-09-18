package poo;

public class Coche {
    // Atributos
    private String marca;
    protected int velocidad;

    // Constructor
    public Coche(String marcaInicial) {
        marca = marcaInicial;
        velocidad = 0;
    }

    // Métodos
    public void acelerar() {
        velocidad = velocidad + 10;
    }
    
    public void frenar() {
    	
    	if (velocidad >= 10) { 
    		velocidad = velocidad - 10;
    	}else {
    		velocidad = 0;
		}
    	
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }
}