package ejerciciosUnidad4;

public class Ejercicio9 {

	public static void main(String[] args) {

		
		//Parte 1
		int[] pass1 = new int [10];
		boolean encontrado = false;

		while (!encontrado) {
			// Genero 4 números aleatorios y el quinto es lo que falta para 20
			for (int i = 0; i < 4; i++) {
				pass1[i] = (int) (Math.random() * 10);
			}
			int suma = 0;
			for (int i = 0; i < 4; i++) {
				suma = suma + pass1[i];
			}
			pass1[4] = 20 - suma;

			// Lo mismo para los 5 últimos, pero hasta 35
			for (int i = 5; i < 9; i++) {
				pass1[i] = (int) (Math.random() * 10);
			}
			suma = 0;
			for (int i = 5; i < 9; i++) {
				suma = suma + pass1[i];
			}
			pass1[9] = 35 - suma;

			// El número calculado debe seguir siendo un dígito (0..9)
			if (pass1[4] >= 0 && pass1[4] <= 9 && pass1[9] >= 0 && pass1[9] <= 9) {
				encontrado = true;
			}
		}

		System.out.print("Parte 1 (base): ");
		for (int i = 0; i < 10; i++) {
			System.out.print(pass1[i]);
		}
		System.out.println();
		System.out.println("-".repeat(50));

		//parte 2
		int[] pass2 = new int[10];
		encontrado = false;

		while (!encontrado) {
			for (int i = 0; i < 4; i++) {
				pass2[i] = (int) (Math.random() * 10);
			}
			int suma = 0;
			for (int i = 0; i < 4; i++) {
				suma = suma + pass2[i];
			}
			pass2[4] = 20 - suma;

			for (int i = 5; i < 9; i++) {
				pass2[i] = (int) (Math.random() * 10);
			}
			suma = 0;
			for (int i = 5; i < 9; i++) {
				suma = suma + pass2[i];
			}
			pass2[9] = 35 - suma;

			if (pass2[4] >= 0 && pass2[4] <= 9 && pass2[9] >= 0 && pass2[9] <= 9) {
				int doses = 0;
				for (int i = 0; i < 5; i++) {
					if (pass2[i] == 2) {
						doses++;
					}
				}
				int nueves = 0;
				for (int i = 5; i < 10; i++) {
					if (pass2[i] == 9) {
						nueves++;
					}
				}
				if (doses >= 2 && nueves >= 2) {
					encontrado = true;
				}
			}
		}

		System.out.print("Parte 2: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(pass2[i]);
		}
		System.out.println();
		System.out.println("-".repeat(50));

		
		int[] pass3 = new int[10];
		encontrado = false;

		while (!encontrado) {
			for (int i = 0; i < 4; i++) {
				pass3[i] = (int) (Math.random() * 10);
			}
			int suma = 0;
			for (int i = 0; i < 4; i++) {
				suma = suma + pass3[i];
			}
			pass3[4] = 20 - suma;

			for (int i = 5; i < 9; i++) {
				pass3[i] = (int) (Math.random() * 10);
			}
			suma = 0;
			for (int i = 5; i < 9; i++) {
				suma = suma + pass3[i];
			}
			pass3[9] = 35 - suma;

			if (pass3[4] >= 0 && pass3[4] <= 9 && pass3[9] >= 0 && pass3[9] <= 9) {
				int sumaPares = 0;
				int sumaImpares = 0;
				for (int i = 0; i < 10; i++) {
					if (i % 2 == 0) {
						sumaPares = sumaPares + pass3[i];
					} else {
						sumaImpares = sumaImpares + pass3[i];
					}
				}
				if (sumaPares == 25 && sumaImpares == 30) {
					encontrado = true;
				}
			}
		}

		System.out.print("Parte 3: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(pass3[i]);
		}
		System.out.println();
		System.out.println("-".repeat(50));

		// PARTE 4: generar una contraseña con TODAS las restricciones
		int[] pass4 = new int[10];
		encontrado = false;

		while (!encontrado) {
			// Primero la mitad izquierda: suma 20 y dos doses
			boolean izquierdaCorrecta = false;
			while (!izquierdaCorrecta) {
				for (int i = 0; i < 5; i++) {
					pass4[i] = (int) (Math.random() * 10);
				}
				int suma = 0;
				int doses = 0;
				for (int i = 0; i < 5; i++) {
					suma = suma + pass4[i];
					if (pass4[i] == 2) {
						doses++;
					}
				}
				if (suma == 20 && doses >= 2) {
					izquierdaCorrecta = true;
				}
			}

			// Para que las sumas de pares e impares encajen:
			// pares totales = 25 e impares totales = 30
			int sumaParesIzquierda = 0;
			for (int i = 0; i < 5; i = i + 2) {
				sumaParesIzquierda = sumaParesIzquierda + pass4[i];
			}

			if (sumaParesIzquierda >= 7 && sumaParesIzquierda <= 17) {
				int sumaParesDerecha = 25 - sumaParesIzquierda;
				int sumaImparesDerecha = 30 - (20 - sumaParesIzquierda);
				boolean derechaCorrecta = false;
				int intentos = 0;

				while (intentos < 1000 && !derechaCorrecta) {
					intentos++;

					// Posiciones pares de la derecha: índices 6 y 8
					pass4[6] = (int) (Math.random() * 10);
					pass4[8] = sumaParesDerecha - pass4[6];
					if (pass4[8] < 0 || pass4[8] > 9) {
						continue;
					}

					// Posiciones impares de la derecha: índices 5, 7 y 9
					pass4[5] = (int) (Math.random() * 10);
					pass4[7] = (int) (Math.random() * 10);
					pass4[9] = sumaImparesDerecha - pass4[5] - pass4[7];
					if (pass4[9] < 0 || pass4[9] > 9) {
						continue;
					}

					int sumaDerecha = 0;
					int nueves = 0;
					for (int i = 5; i < 10; i++) {
						sumaDerecha = sumaDerecha + pass4[i];
						if (pass4[i] == 9) {
							nueves++;
						}
					}
					if (sumaDerecha == 35 && nueves >= 2) {
						derechaCorrecta = true;
					}
				}

				if (derechaCorrecta) {
					encontrado = true;
				}
			}
		}

		System.out.print("Parte 4 (todas las restricciones): ");
		for (int i = 0; i < 10; i++) {
			System.out.print(pass4[i]);
		}
		System.out.println();
		System.out.println("-".repeat(50));

		// VALIDAR LOS PASSWORDS CORRECTOS DEL ENUNCIADO
		String[] ejemplos = { "1722855997", "4752279559", "2127895489", "6322789819" };

		for (int e = 0; e < ejemplos.length; e++) {
			String texto = ejemplos[e];
			int[] pass = new int[10];
			for (int i = 0; i < 10; i++) {
				pass[i] = Character.getNumericValue(texto.charAt(i));
			}

			int sumaPrimera = 0;
			int sumaSegunda = 0;
			for (int i = 0; i < 5; i++) {
				sumaPrimera = sumaPrimera + pass[i];
			}
			for (int i = 5; i < 10; i++) {
				sumaSegunda = sumaSegunda + pass[i];
			}

			int doses = 0;
			for (int i = 0; i < 5; i++) {
				if (pass[i] == 2) {
					doses++;
				}
			}
			int nueves = 0;
			for (int i = 5; i < 10; i++) {
				if (pass[i] == 9) {
					nueves++;
				}
			}

			int sumaPares = 0;
			int sumaImpares = 0;
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
					sumaPares = sumaPares + pass[i];
				} else {
					sumaImpares = sumaImpares + pass[i];
				}
			}

			if (sumaPrimera == 20 && sumaSegunda == 35 && doses >= 2 && nueves >= 2
					&& sumaPares == 25 && sumaImpares == 30) {
				System.out.println(texto + " -> CORRECTO");
			} else {
				System.out.println(texto + " -> INCORRECTO");
			}
		}
	}
}