package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	enum DiaSemana {Lunes, Martes, Miercoles, Jueves, Viernes ,Sabado, Domingo}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		
		DiaSemana dia = DiaSemana.Martes;
		
		
				
		 
		
		switch (dia) {
			case Lunes:
				System.out.println("Odio los lunes");
				break;
			case Martes:
				System.out.println("Los Martes paso de la fase de negación a la fase de aceptación.");
				break;
			case Miercoles:
				System.out.println("Cuando es Miercoles pienso que ya vamos por la mitad de la semana.");
				break;
			case Jueves:
				System.out.println("El previo del Viernes, el Jueves, es mi día favorito de la semana.");
				break;
			case Viernes:
				System.out.println("El Viernes suelo quedar con mis amigos para cenar.");
				break;
			case Sabado:
				System.out.println("Los Sabados me levanto tarde y siempre desayuno tortitas.");
				break;
			case Domingo:
				System.out.println("Me deprimen los Domingos porque pienso que mañana es Lunes.");
				break;
			default:
				System.out.println("No se que dia es ese");
			
		}
		
		
	}

}
