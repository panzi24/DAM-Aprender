package ejerciciosEspeciales;

//SIMON OCHOA IBAÑEZ

public class EjercicioEspecial1 {
	public static void main(String[] args) {
		
		int vueltas = 20;
		String linea = ("-").repeat(70);
		
		
		int tiempoBlando = vueltas * 80;
		int tiempoIntermedio = vueltas * 85 + tiempoBlando;
		int tiempoDuro = vueltas * 90 + tiempoIntermedio;
		
		int tiempoBlandoParcial = vueltas * 80;
		int tiempoIntermedioParcial = vueltas * 85;
		int tiempoDuroParcial = vueltas * 90;
		
		
		int minutoBlando = tiempoBlando / 60;
		int minutoIntermedio = tiempoIntermedio / 60;
		int minutoDuro = tiempoDuro / 60;
		
		int minutoBlandoParcial = tiempoBlandoParcial / 60;
		int minutoIntermedioParcial = tiempoIntermedioParcial / 60;
		int minutoDuroParcial = tiempoDuroParcial / 60;
		
		
		int segundosBlando = tiempoBlando % 60;
		int segundosIntermedio = tiempoIntermedio % 60;
		int segundosDuro = tiempoDuro % 60;
		
		
		int segundosBlandoParcial = tiempoBlandoParcial % 60;
		int segundosIntermedioParcial = tiempoIntermedioParcial % 60;
		int segundosDuroParcial = tiempoDuroParcial % 60;
		
		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------

		
		//hora salida blando
		int horaSalidaBlando = 14;
		int minutoSalidaBlando = 0;
		int segundoSalidaBlando = 0;
		
		//paso estimado Blando
		int horaEstimadoBlando = horaSalidaBlando;
		int minutoEstimadoBlando = minutoSalidaBlando + minutoBlando;
		int segundoEstimadoBlando = segundoSalidaBlando + segundosBlando;
		

		String textoLapBlando = "time lap 20";
		String textoEstimadoBlando = " Hora estimada: "+ horaEstimadoBlando + ":"+ minutoEstimadoBlando + ":" + segundoEstimadoBlando;
		String textoParcialBlando = "Tiempo parcial: 0:" + minutoBlandoParcial + ":" + segundosBlandoParcial;
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------

		
		
		//paso estimado Intermedio
		
		//hora salida
		int horaSalidaIntermedio = 14;
		int minutoSalidaIntermedio = 0;
		int segundoSalidaIntermedio = 0;
		
		int horaEstimadoIntermedio = horaSalidaIntermedio;
		int minutoEstimadoIntermedio = minutoSalidaIntermedio + minutoIntermedio;
		int segundoEstimadoIntermedio = segundoSalidaIntermedio + segundosIntermedio;
		
		String textoLapIntermedio = "time lap 40";
		String textoEstimadoIntermedio = " Hora estimada: "+ horaEstimadoIntermedio + ":"+ minutoEstimadoIntermedio + ":" + segundoEstimadoIntermedio;
		String textoParcialIntermedio = "Tiempo parcial: 0:" + minutoIntermedioParcial + ":" + segundosIntermedioParcial;
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------

		
		
		//paso estimado Duro
		
		int horaSalidaDuro = 14;
		int minutoSalidaDuro = 0;
		int segundoSalidaDuro = 0;
		
		
		
		
		int minutoEstimadoDuro = minutoSalidaDuro + minutoDuro;
		int segundoEstimadoDuro = segundoSalidaDuro + segundosDuro;
		
		
		int horasExtra = (minutoEstimadoDuro / 60) + horaSalidaDuro;
		int minutosRestantes = (minutoEstimadoDuro % 60) + minutoSalidaDuro;
		
		
		
		String textoLapDuro = "time lap 60";
		String textoEstimadoDuro = " Hora estimada: "+ horasExtra + ":"+ minutosRestantes + ":" + segundoEstimadoDuro;
		String textoParcialDuro = "Tiempo parcial: 0:" + minutoDuroParcial + ":" + segundosDuroParcial;
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println(linea);
		System.out.println("FAUSTÍ BARBERÀ PARTNERING WITH ASTON MARTIN F1");
		System.out.println(linea);
		System.out.println("This program show the expected times and estimated time laps");
		System.out.println(linea);
		
		
		System.out.printf("%-15s %-25s %-25s %n",textoLapBlando, textoEstimadoBlando, textoParcialBlando);
		System.out.printf("%-15s %-25s %-25s %n",textoLapIntermedio, textoEstimadoIntermedio, textoParcialIntermedio);
		System.out.printf("%-15s %-25s %-25s %n",textoLapDuro, textoEstimadoDuro, textoParcialDuro);



		
	}

}
