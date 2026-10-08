package ejerciciosUnidad2;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Introduzca la altura de la bandera en cm: ");
		double alturaBandera = sc.nextDouble();
		
		System.out.println("Ahora introduzca la anchura: ");
		double anchuraBandera = sc.nextDouble();
		
		String escudoBordado = "";
		double costoEscudoBordado = 0;
		
		double totalBandera = 0;
		
		double gastoEnvio = 3.25;
		
		while (true) {
			System.out.println("¿Quieres escudo bordado? (s/n)");
			escudoBordado = sc.next();
			if (escudoBordado.equalsIgnoreCase("s") || escudoBordado.equalsIgnoreCase("n") ) {
				break;
			}else {
				System.out.println("Tienes que decir s (Si) o n (No)");
			}
		}
		
		double costoBandera =  (alturaBandera * anchuraBandera) * 0.01;
		double banderaCentimetros = alturaBandera * anchuraBandera;
		
		if (escudoBordado.equalsIgnoreCase("s")) {
			costoEscudoBordado = 2.5;
		}else if (escudoBordado.equalsIgnoreCase("n")) {
			costoEscudoBordado = 0;
		}
		
		
		totalBandera = costoBandera + costoEscudoBordado + gastoEnvio;
		
		System.out.println("Gracias aqui tienes el desglose de su compra.");
		System.out.println("Bandera de " + banderaCentimetros + " cm²: " + costoBandera);
		System.out.println("Escudo: " + costoEscudoBordado);
		System.out.println("Gastos envios: " + gastoEnvio);
		System.out.println("Total: " + totalBandera);


		
	}

}
