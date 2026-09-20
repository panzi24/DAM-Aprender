package ejercicios;

public class Ejercicio5 {
	public static void main(String[] args) {
		
	
		String[][] diccionario = {
				{"Cat", "Gato"},
				{"Dog", "Perro"},
				{"Heir", "Pelo"},
				{"Car", "Coche"},
				{"Key", "Llave"},
				{"Door", "Puerta"},
				{"Computer", "Ordenador"},
				{"Code", "Codigo"},
				{"Window", "Ventana"},
				{"Name", "Nombre"}
		};
		
		
		String linea = ("-".repeat(45));
		
		System.out.printf("%-20s %20s%n" , "Ingles", "Español");
		System.out.println(linea);
		
		for (int i = 0; i < diccionario.length; i++) {
			System.out.printf("%-20s %20s%n" , diccionario[i][0], diccionario[i][1]);
		}
		
	}


}
