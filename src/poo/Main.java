package poo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche = new Coche("Toyota");
		
		
		System.out.println("Coche 1");
		System.out.println("Marca: " + miCoche.getMarca());
		System.out.println("Velocidad inicial: " + miCoche.getVelocidad());
		
		miCoche.acelerar();
		miCoche.acelerar();
		
		System.out.println("Velocidad despues de acelerar dos veces: "+ miCoche.getVelocidad());
		
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Coche 2");
		
		Coche miCoche2 = new Coche("Citroen");
		
		System.out.println("Marca: " + miCoche2.getMarca());
		System.out.println("Velocidad Inicial: " + miCoche2.getVelocidad());
		
		miCoche2.acelerar();
		miCoche2.acelerar();
		miCoche2.acelerar();
		miCoche2.acelerar();
		miCoche2.acelerar();
		
		System.out.println("Despues de acelerar varias veces tenemos: " + miCoche2.getVelocidad() + "KM/h");
		
		miCoche2.frenar();
		miCoche2.frenar();
		miCoche2.frenar();
		miCoche2.frenar();
		miCoche2.frenar();
		miCoche2.frenar();
		miCoche2.frenar();
		miCoche2.frenar();
		
		System.out.println("Despues de frenar varias veces tenemos: " + miCoche2.getVelocidad() + "KM/h");
		
		System.out.println("---------------------------------------------------------------");
		CocheDeportivo miDeportivo = new CocheDeportivo("Ferrari");
		miDeportivo.acelerar();
		miDeportivo.turbo();
		
		
		System.out.println("Velocidad del deportivo: " + miDeportivo.getVelocidad()  + " y la  marca es: " + miDeportivo.getMarca());
		
		
		
		
		
		
	}

}


