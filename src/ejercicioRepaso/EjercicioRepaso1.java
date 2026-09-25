package ejercicioRepaso;

public class EjercicioRepaso1 {

	public static void main(String[] args) {
		// Un dron tiene que entregar un paqeute a una distancia de 12km
		//Su velocidad es de 8m/s
		//El dron despegua a las 16:45
		
		/*Los datos que tengo son:
		  1- La distancia que corre que es 12
		  2- Su velocidad que es de 8m/s
		  3- Y la hora inicial y los minutos iniciales que empieza 16:45 */
		
		
		//int distancia = 12;
		int velocidad = 8;
		//int tiempo = (distancia * 1000) / velocidad;
		
		int horaInicio = 16;
		int minutoInicio = 45;
		int segundoInicio = 0;
		
		
		/*2
		int distanciaDos = 2;
				
		int tiempoDos  = (distanciaDos * 1000)  / velocidad ;
		
		int minutoTotalDos = (int)tiempoDos/ 60;
		
		int segundoTotalDos  = (int)tiempoDos  % 60;
		
		
		int horaExtraDos  = (int)minutoTotalDos / 60;
		int minutoExtraDos  = (int)minutoTotalDos % 60;
		
		int horaEstimadaDos = horaInicio + horaExtraDos;
		int minutoEstimadaDos  = minutoInicio + minutoExtraDos;
		int segundoEstimadaDos  = segundoInicio + segundoTotalDos;
		
		String textoPasoCincoKM = "paso por 2K";
		String textoEstimadoCincoKM = "Hora estimada: " + horaEstimadaDos + ":" + minutoEstimadaDos + ":" + segundoEstimadaDos;
		String textoParcialCincoKM = "tiempo parcial: " + horaExtraDos + ":" + minutoExtraDos + ":" + segundoTotalDos;
		
		System.out.printf("%-20s %-15s %-20s" , textoPasoCincoKM, textoEstimadoCincoKM, textoParcialCincoKM);*/
		
		int[] puntosControl = {2, 4, 6, 8, 10, 12};
		
		for (int i = 0; i < puntosControl.length; i++) {
			int tiempoControl = (puntosControl[i] * 1000) / velocidad;
			int minutoTotalControl = (int)tiempoControl/ 60;
			
			int segundoTotalControl = (int)tiempoControl  % 60;
			
			
			int horaExtraControl  = (int)minutoTotalControl / 60;
			int minutoExtraControl  = (int)minutoTotalControl % 60;
			
			int horaEstimadaControl = horaInicio + horaExtraControl;
			int minutoEstimadaControl  = minutoInicio + minutoExtraControl;
			int segundoEstimadaControl  = segundoInicio + segundoTotalControl;
			
			String textoPasoControl = "paso por: " + puntosControl[i];
			String textoEstimadoControl = "Hora estimada: " + horaEstimadaControl + ":" + minutoEstimadaControl + ":" + segundoEstimadaControl;
			String textoParcialControl = "tiempo parcial: " + horaExtraControl + ":" + minutoExtraControl + ":" + segundoTotalControl;
			
			System.out.printf("%-20s %-15s %-20s%n",  textoPasoControl, textoEstimadoControl, textoParcialControl);

			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
