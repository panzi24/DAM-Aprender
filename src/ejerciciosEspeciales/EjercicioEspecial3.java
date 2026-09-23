package ejerciciosEspeciales;

import java.util.Scanner;

//SIMON OCHOA IBAÑEZ 23/09/26


public class EjercicioEspecial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea = ("-").repeat(70);
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Dime las horas: ");
		double tiempoHoras= sc.nextDouble();
		
		System.out.println("Dime los minutos: ");
		double tiempodMinutos = sc.nextDouble();
		
		double distanciaTotal = 30.0;
		double segundosTotales = (tiempoHoras * 3600) + (tiempodMinutos * 60);
		double velocidad = distanciaTotal / segundosTotales;
		
		
		int horaInicio = 8;
		int minutoInicio = 0;
		int segundoInicio = 0;
		
		
		//5km
		double distanciaCincoKM = 5.0;
				
		double tiempoCincoKM  = distanciaCincoKM  / velocidad ;
		
		int minutoTotalCincoKM = (int)tiempoCincoKM / 60;
		
		int segundoTotalCincoKM = (int)tiempoCincoKM % 60;
		
		
		int horaExtraCincoKM = (int)minutoTotalCincoKM / 60;
		int minutoExtraCincoKM = (int)minutoTotalCincoKM % 60;
		
		int horaEstimadaCincoKM = horaInicio + horaExtraCincoKM;
		int minutoEstimadaCincoKM = minutoInicio + minutoExtraCincoKM;
		int segundoEstimadaCincoKM = segundoInicio + segundoTotalCincoKM;
		
		String textoPasoCincoKM = "paso por 5K";
		String textoEstimadoCincoKM = "Hora estimada: " + horaEstimadaCincoKM + ":" + minutoEstimadaCincoKM + ":" + segundoEstimadaCincoKM;
		String textoParcialCincoKM = "tiempo parcial: " + horaExtraCincoKM + ":" + minutoExtraCincoKM + ":" + segundoTotalCincoKM;
		
		
		
		
		//10km
		int distanciaDiezKM = 10;
				
		double tiempoDiezKM  = distanciaDiezKM  / velocidad ;
		
		int minutoTotalDiezKM = (int)tiempoDiezKM / 60;
		
		int segundoTotalDiezKM = (int)tiempoDiezKM % 60;
		
		int horaExtraDiezKM = (int)minutoTotalDiezKM / 60;
		int minutoExtraDiezKM = (int)minutoTotalDiezKM % 60;
		
		int horaEstimadaDiezKM = horaInicio + horaExtraDiezKM;
		int minutoEstimadaDiezKM = minutoInicio + minutoExtraDiezKM;
		int segundoEstimadaDiezKM = segundoInicio + segundoTotalDiezKM;
		
		String textoPasoDiezKM = "paso por 10K";
		String textoEstimadoDiezKM = "Hora estimada: " + horaEstimadaDiezKM + ":" + minutoEstimadaDiezKM + ":" + segundoEstimadaDiezKM;
		String textoParcialDiezKM = "tiempo parcial: " + horaExtraDiezKM + ":" + minutoExtraDiezKM + ":" + segundoTotalDiezKM;
		


		
		//15km
		int distanciaQuinceKM = 15;
				
		double tiempoQuinceKM  = distanciaQuinceKM  / velocidad ;
		
		int minutoTotalQuinceKM = (int)tiempoQuinceKM / 60;
		
		int segundoTotalQuinceKM = (int)tiempoQuinceKM % 60;
		
		int horaExtraQuinceKM = (int)minutoTotalQuinceKM / 60;
		int minutoExtraQuinceKM = (int)minutoTotalQuinceKM %60;
		
		int horaEstimadaQuinceKM = horaInicio + horaExtraQuinceKM;
		int minutoEstimadaQuinceKM = minutoInicio + minutoExtraQuinceKM;
		int segundoEstimadaQuinceKM = segundoInicio + segundoTotalQuinceKM;
		

		String textoPasoQuinceKM = "paso por 15K";
		String textoEstimadoQuinceKM = "Hora estimada: " + horaEstimadaQuinceKM + ":" + minutoEstimadaQuinceKM + ":" + segundoEstimadaQuinceKM;
		String textoParcialQuinceKM = "tiempo parcial: " + horaExtraQuinceKM + ":" + minutoExtraQuinceKM + ":" + segundoTotalQuinceKM;
		

		
		//20km
		int distanciaVeinteKM = 20;
				
		double tiempoVeinteKM  = distanciaVeinteKM  / velocidad ;
		
		int minutoTotalVeinteKM = (int)tiempoVeinteKM / 60;
		
		int segundoTotalVeinteKM = (int)tiempoVeinteKM % 60;
		
		int horaExtraVeinteKM = (int)minutoTotalVeinteKM / 60;
		int minutoExtraVeinteKM = (int)minutoTotalVeinteKM % 60;
		
		int horaEstimadaVeinteKM = horaInicio + horaExtraVeinteKM;
		int minutoEstimadaVeinteKM = minutoInicio + minutoExtraVeinteKM;
		int segundoEstimadaVeinteKM = segundoInicio + segundoTotalVeinteKM;
		
		String textoPasoVeinteKM = "paso por 20K";
		String textoEstimadoVeinteKM = "Hora estimada: " + horaEstimadaVeinteKM + ":" + minutoEstimadaVeinteKM + ":" + segundoEstimadaVeinteKM;
		String textoParcialVeinteKM = "tiempo parcial: " + horaExtraVeinteKM + ":" + minutoExtraVeinteKM + ":" + segundoTotalVeinteKM;
	
		
		
		//25km
		int distanciaVCKM = 25;
				
		double tiempoVCKM  = distanciaVCKM  / velocidad ;
		
		int minutoTotalVCKM = (int)tiempoVCKM / 60;
		
		int segundoTotalVCKM = (int)tiempoVCKM % 60;
		
		int horaExtraVCKM = (int)minutoTotalVCKM / 60;
		int minutoExtraVCKM = (int)minutoTotalVCKM % 60;
		
		int horaEstimadaVCKM = horaInicio + horaExtraVCKM;
		int minutoEstimadaVCKM = minutoInicio + minutoExtraVCKM;
		int segundoEstimadaVCKM = segundoInicio + segundoTotalVCKM;
		
				
		String textoPasoVCKM = "paso por 25K";
		String textoEstimadoVCKM = "Hora estimada: " + horaEstimadaVCKM + ":" + minutoEstimadaVCKM + ":" + segundoEstimadaVCKM;
		String textoParcialVCKM = "tiempo parcial: " + horaExtraVCKM + ":" + minutoExtraVCKM + ":" + segundoTotalVCKM;
	
		
		//30km
		int distanciaTreintaKM = 30;
				
		double tiempoTreintaKM  = distanciaTreintaKM  / velocidad ;
		
		int minutoTotalTreintaKM = (int)tiempoTreintaKM / 60;
		
		int segundoTotalTreintaKM = (int)tiempoTreintaKM % 60;
		
		int horaExtraTreintaKM = (int)minutoTotalTreintaKM / 60;
		int minutoExtraTreintaKM = (int)minutoTotalTreintaKM % 60;
		
		int horaEstimadaTreintaKM = horaInicio + horaExtraTreintaKM;
		int minutoEstimadaTreintaKM = minutoInicio + minutoExtraTreintaKM;
		int segundoEstimadaTreintaKM = segundoInicio + segundoTotalTreintaKM;
		
		String textoPasoTreintaKM = "paso por 30K";
		String textoEstimadoTreintaKM = "Hora estimada: " + horaEstimadaTreintaKM + ":" + minutoEstimadaTreintaKM + ":" + segundoEstimadaTreintaKM;
		String textoParcialTreintaKM = "tiempo parcial: " + horaExtraTreintaKM + ":" + minutoExtraTreintaKM + ":" + segundoTotalTreintaKM;
		
		
		//OUT
		
		System.out.println(linea);
		System.out.println("IES FAUSTÍ BARBERÀ ATHLETICS 30K");
		System.out.println(linea);
		System.out.println("This program show the expected times and estimated every 5K");
		System.out.println(linea);
		
		System.out.printf("%-15s %-25s %20s%n", textoPasoCincoKM, textoEstimadoCincoKM, textoParcialCincoKM);
		System.out.printf("%-15s %-25s %20s%n", textoPasoDiezKM, textoEstimadoDiezKM, textoParcialDiezKM);
		System.out.printf("%-15s %-25s %20s%n", textoPasoQuinceKM, textoEstimadoQuinceKM, textoParcialQuinceKM);
		System.out.printf("%-15s %-25s %20s%n", textoPasoVeinteKM, textoEstimadoVeinteKM, textoParcialVeinteKM);
		System.out.printf("%-15s %-25s %20s%n", textoPasoVCKM, textoEstimadoVCKM, textoParcialVCKM);
		System.out.printf("%-15s %-25s %20s", textoPasoTreintaKM, textoEstimadoTreintaKM, textoParcialTreintaKM);
		



		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
