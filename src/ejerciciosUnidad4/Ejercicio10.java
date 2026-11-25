package ejerciciosUnidad4;


public class Ejercicio10 {

	public static void main(String[] args) {

		String alfabeto = "abcdefghijklmnopqrstuwxyz";

		// PARTE 1: Array de Strings de 10 posiciones que sume 130
		String[] pass1 = new String[10];
		boolean encontrado = false;

		while (!encontrado) {
			int suma = 0;
			for (int i = 0; i < 10; i++) {
				int posAleatoria = (int) (Math.random() * alfabeto.length());
				pass1[i] = String.valueOf(alfabeto.charAt(posAleatoria));
				suma += posAleatoria + 1; 
			}
			if (suma == 130) {
				encontrado = true;
			}
		}

		System.out.print("Parte 1 (suma 130): ");
		imprimir(pass1);

		// PARTE 2: Exactamente 2 'c' y 2 'z' (y suma 130)
		String[] pass2 = new String[10];
		encontrado = false;

		while (!encontrado) {
			int suma = 0;
			int ces = 0;
			int zetas = 0;

			for (int i = 0; i < 10; i++) {
				int posAleatoria = (int) (Math.random() * alfabeto.length());
				pass2[i] = String.valueOf(alfabeto.charAt(posAleatoria));
				suma += posAleatoria + 1;

				if (pass2[i].equals("c")) ces++;
				if (pass2[i].equals("z")) zetas++;
			}

			if (suma == 130 && ces == 2 && zetas == 2) {
				encontrado = true;
			}
		}

		System.out.print("Parte 2 (2 'c' y 2 'z'): ");
		imprimir(pass2);

		// PARTE 3: Debe haber un "ui" junto en algún lugar
		String[] pass3 = new String[10];
		encontrado = false;

		while (!encontrado) {
			int suma = 0;
			int ces = 0;
			int zetas = 0;

			for (int i = 0; i < 10; i++) {
				int posAleatoria = (int) (Math.random() * alfabeto.length());
				pass3[i] = String.valueOf(alfabeto.charAt(posAleatoria));
				suma += posAleatoria + 1;

				if (pass3[i].equals("c")) ces++;
				if (pass3[i].equals("z")) zetas++;
			}

			// Comprobamos si hay una "u" seguida de una "i"
			boolean tieneUI = false;
			for (int i = 0; i < 9; i++) {
				if (pass3[i].equals("u") && pass3[i + 1].equals("i")) {
					tieneUI = true;
				}
			}

			if (suma == 130 && ces == 2 && zetas == 2 && tieneUI) {
				encontrado = true;
			}
		}

		System.out.print("Parte 3 (con 'ui'): ");
		imprimir(pass3);

		// PARTE 4
		// Colocamos las piezas fijas ('c', 'c', 'z', 'z', "ui") y ajustamos el resto
		String[] pass4 = new String[10];
		encontrado = false;

		while (!encontrado) {
			// Vaciamos el array en cada intento
			for (int i = 0; i < 10; i++) pass4[i] = "";

			// 1. Colocamos "ui" en una posición aleatoria
			int posU = (int) (Math.random() * 9);
			pass4[posU] = "u";
			pass4[posU + 1] = "i";

			// 2. Colocamos dos 'c' y dos 'z' en huecos libres
			String[] obligatorias = {"c", "c", "z", "z"};
			for (int k = 0; k < obligatorias.length; k++) {
				int hueco = (int) (Math.random() * 10);
				while (!pass4[hueco].equals("")) {
					hueco = (int) (Math.random() * 10);
				}
				pass4[hueco] = obligatorias[k];
			}

			// 3. Rellenamos los 4 huecos que quedan con letras aleatorias (sin 'c' ni 'z')
			for (int i = 0; i < 10; i++) {
				if (pass4[i].equals("")) {
					int pos = (int) (Math.random() * alfabeto.length());
					String letra = String.valueOf(alfabeto.charAt(pos));
					while (letra.equals("c") || letra.equals("z")) {
						pos = (int) (Math.random() * alfabeto.length());
						letra = String.valueOf(alfabeto.charAt(pos));
					}
					pass4[i] = letra;
				}
			}

			// 4. Comprobamos todas las reglas juntas
			if (esValida(pass4, alfabeto)) {
				encontrado = true;
			}
		}

		System.out.print("Parte 4 (completa): ");
		imprimir(pass4);
		System.out.println("-".repeat(50));


		// PARTE 5: Validador de contraseñas
	
		String[] ejemplos = { String.join("", pass4), "abcdefghij" };

		for (int e = 0; e < ejemplos.length; e++) {
			String[] arrayPrueba = ejemplos[e].split("");
			if (esValida(arrayPrueba, alfabeto)) {
				System.out.println(ejemplos[e] + " -> CORRECTO");
			} else {
				System.out.println(ejemplos[e] + " -> INCORRECTO");
			}
		}
	}

	// Método para validar si cumple TODAS las restricciones (Parte 4 y 5)
	public static boolean esValida(String[] pass, String alfabeto) {
		if (pass.length != 10) return false;

		int ces = 0;
		int zetas = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
		boolean tieneUI = false;

		for (int i = 0; i < 10; i++) {
			int valor = alfabeto.indexOf(pass[i]) + 1;
			if (valor == 0) return false; // Letra no permitida

			if (pass[i].equals("c")) ces++;
			if (pass[i].equals("z")) zetas++;

			if (i % 2 == 0) {
				sumaPares += valor;
			} else {
				sumaImpares += valor;
			}

			if (i < 9 && pass[i].equals("u") && pass[i + 1].equals("i")) {
				tieneUI = true;
			}
		}

		return ces == 2 && zetas == 2 && tieneUI && sumaPares == 60 && sumaImpares == 70;
	}

	// Método auxiliar para mostrar el array por pantalla
	public static void imprimir(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
