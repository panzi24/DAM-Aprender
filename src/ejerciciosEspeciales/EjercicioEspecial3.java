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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("la velocidad es: " + minutoTotalCincoKM + " Minutos: " +segundoTotalCincoKM);
		

		
		
		
		
		
	}

}
