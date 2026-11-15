package ejerciciosUnidad4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array100 = new int[10];
		Random rn = new Random();
		
		for (int i = 0; i < array100.length; i++) {
			array100[i] = rn.nextInt(1, 11);
			
		}
		
		for (int i = 0; i < array100.length; i++) {
			System.out.println("Componente: " + i + " - valor: " + array100[i]);
		}
		
		
		System.out.println(Arrays.toString(array100));
		
	}

}
