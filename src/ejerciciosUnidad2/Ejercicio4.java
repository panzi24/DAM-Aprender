package ejerciciosUnidad2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroTemporada = 0;
		int numeroCapitulo = 0;

		//for para j = Temporada
		for (int j = 1; j <= 8; j++) {
			if (j%2 == 0) {
				continue;
			}
			//for i que es el capitulo
			for (int i = 1; i <= 10; i++) {

				if (!(i%2 == 0)) {
					continue;
				}

				if (j == 3 && i == 9 ) {
					System.out.println("Capitulo " + j + "x" + i + ": La boda roja");
				}else if (j == 6 && i == 10 ) {
					System.out.println("Capitulo " + j + "x" + i + ": Vientos de invierno");
				}else if (j == 8 && i == 10 ) {
					System.out.println("Capitulo " + j + "x" + i + ": Fin de serie");
				}else if (j != 8 && i == 10 ) {
					System.out.println("Capitulo " + j + "x" + i + ": Fin de temporada");
				}else {
					System.out.println("Capitulo " + j + "x" + i);
				}





			}

		}		
	}
}
