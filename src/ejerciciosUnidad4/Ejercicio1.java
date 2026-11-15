package ejerciciosUnidad4;

import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array100 = new int[100];
		
		for (int i = 0; i < array100.length; i++) {
			array100[i] = i + 1;
			
		}
		
		for (int i = 0; i < array100.length; i++) {
			System.out.println("Componente: " + i + " - valor: " + array100[i]);
		}
		
		
		
		
	}

}
