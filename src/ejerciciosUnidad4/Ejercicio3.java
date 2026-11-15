package ejerciciosUnidad4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String TextoDni = "03196080";
		
		int numeroDni = Integer.parseInt(TextoDni);
		
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
               	};
		int resto = numeroDni % 23;
		
		char letra = letras[resto];
		
		System.out.println("Tu DNI completo es: " + TextoDni + letra);
		
		
	}

}
