package ejerciciosUnidad3;

import java.awt.Frame;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroSecreto = 0;
		int numeroIgual = 0;
		int contadorIteraciones = 0;
		
		
		//parte estadistica
		//sumo iteraciones cuando acaba
		int contadorPromedio = 0;
		//Contador repeticion
		int contadorRepeticion = 0;
		int finrRepeticion = 10;

		double mediaRepeticiones = 0;
		
		int rangoFin = 1001;
		Random rn = new Random();
		long tiempoInicio = System.currentTimeMillis();
		long tiempoFin = 0;
		long tiempoTotal = 0;
				
		
		
		while(contadorRepeticion < finrRepeticion) {
			contadorRepeticion++;
			numeroSecreto = rn.nextInt(rangoFin);
			
			System.out.println("Numero secreto: " + numeroSecreto);
			
			
			while(numeroSecreto != numeroIgual) {
				
				numeroIgual = rn.nextInt(rangoFin);
				contadorIteraciones++;
				System.out.println("Calculando numero: " + numeroIgual);
				
				
				
			}
			
			
			
			System.out.println("Numero de iteracciones: " + contadorIteraciones);
			contadorPromedio += contadorIteraciones;
			System.out.println("Repeticion: " + contadorRepeticion);
			System.out.println("-".repeat(40));
			
			
			
		}
		
		
		tiempoFin = System.currentTimeMillis();
		tiempoTotal = tiempoFin - tiempoInicio;
		
		mediaRepeticiones = contadorPromedio / (double)contadorRepeticion;
		System.out.println("Promedio de iteracion: " + mediaRepeticiones);
		
		System.out.println("-".repeat(40));
		
		System.out.println("Tiempo total: " + tiempoTotal + " ms");
		
		System.out.println("Fin programa");

	}

}
