package ejerciciosEspeciales;


//SIMON OCHOA IBAÑEZ 22/09/26


public class EjercicioEspecial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String linea = "-".repeat(70);
		
		//VARIABLES POR OBJETOS
		
		//Troposfera
		int distanciaTroposfera = 15 - 0;
		int velocidadTroposfera = 1;
		int tiempoTroposfera = distanciaTroposfera / velocidadTroposfera;
		
		//Estratosfera
		int distanciaEstratosfera = 50 - 16;
		int velocidadEstratosfera = 2;
		int tiempoEstratosfera = distanciaEstratosfera / velocidadEstratosfera;
		
		//Mesosfera
		int distanciaMesosfera = 80 - 51;
		int velocidadMesosfera = 4;
		int tiempoMesosfera = distanciaMesosfera / velocidadMesosfera;
		
		//Termosfera
		int distanciaTermosfera = 500 - 81;
		int velocidadTermosfera = 8;
		int tiempoTermosfera = distanciaTermosfera / velocidadTermosfera;
		
		//Exosfera
		int distanciaExosfera = 10000 - 501;
		int velocidadExosfera = 12;
		int tiempoExosfera = distanciaExosfera / velocidadExosfera;
		
		//EspacioLuna
		int distanciaEspacioLuna = 400000 - 10001;
		int velocidadEspacioLuna = 15;
		int tiempoEspacioLuna = distanciaEspacioLuna / velocidadEspacioLuna;
		
		
		//CALCULOS POR OBJETOS
		
		//Troposfera
		
		int horaInicioTroposfera = 10;
		int minutoInicioTroposfera = 0;
		int segundoInicioTroposfera = 0;
		
		
		
		int minutoTroposfera = tiempoTroposfera / 60;
		int segundoTroposfera = tiempoTroposfera % 60;
		
		int horasExtraTroposfera = minutoTroposfera / 60;
		int minutoExtraTroposfera = minutoTroposfera % 60;
		
		
		int horasExtraAcumuladoTroposfera = minutoTroposfera / 60;
		int minutoExtraAcumuladoTroposfera = minutoTroposfera% 60;
		
		int horaEstimadaTroposfera = horaInicioTroposfera + horasExtraAcumuladoTroposfera;
		int minutoEstimadaTroposfera = minutoInicioTroposfera + minutoExtraAcumuladoTroposfera;
		int segundoEstimadaTroposfera = segundoInicioTroposfera + segundoTroposfera;
		
		
		//Estratosfera
		
		int horaInicioEstratosfera = 10;
		int minutoInicioEstratosfera = 0;
		int segundoInicioEstratosfera = 0;
		
		
		int tiempoAcumuladoEstratosfera = tiempoEstratosfera + tiempoTroposfera;
		int minutoAcumuladoEstratosfera = tiempoAcumuladoEstratosfera / 60;
		int segundoAcumuladoEstratosfera = tiempoAcumuladoEstratosfera % 60;
		
		
		
		
		int minutoEstratosfera = tiempoEstratosfera / 60;
		int segundoEstratosfera = tiempoEstratosfera % 60;
		
		int horasExtraEstratosfera = minutoEstratosfera / 60;
		int minutoExtraEstratosfera = minutoEstratosfera % 60;
		
		int horasExtraAcumuladoEstratosfera = minutoAcumuladoEstratosfera / 60;
		int minutoExtraAcumuladoEstratosfera = minutoAcumuladoEstratosfera % 60;
		
		int horaEstimadaEstratosfera = horaInicioEstratosfera + horasExtraAcumuladoEstratosfera;
		int minutoEstimadaEstratosfera = minutoInicioEstratosfera + minutoExtraAcumuladoEstratosfera;
		int segundoEstimadaEstratosfera = segundoInicioEstratosfera + segundoAcumuladoEstratosfera;
		
	
		
		
		//Mesosfera
		
		int horaInicioMesosfera = 10;
		int minutoInicioMesosfera = 0;
		int segundoInicioMesosfera = 0;
		
		
		int tiempoAcumuladoMesosfera = tiempoMesosfera + tiempoAcumuladoEstratosfera;
		int minutoAcumuladoMesosfera = tiempoAcumuladoMesosfera / 60;
		int segundoAcumuladoMesosfera = tiempoAcumuladoMesosfera % 60;
		
		
		int minutoMesosfera = tiempoMesosfera / 60;
		int segundoMesosfera = tiempoMesosfera % 60;
		
		int horasExtraMesosfera = minutoMesosfera / 60;
		int minutoExtraMesosfera = minutoMesosfera % 60;
		
		
		int horasExtraAcumuladoMesosfera = minutoAcumuladoMesosfera / 60;
		int minutoExtraAcumuladoMesosfera = minutoAcumuladoMesosfera % 60;
		
		
		int horaEstimadaMesosfera = horaInicioMesosfera + horasExtraAcumuladoMesosfera;
		int minutoEstimadaMesosfera = minutoInicioMesosfera + minutoExtraAcumuladoMesosfera;
		int segundoEstimadaMesosfera = segundoInicioMesosfera + segundoAcumuladoMesosfera;
		
		
		//Termosfera
		
		int horaInicioTermosfera = 10;
		int minutoInicioTermosfera = 0;
		int segundoInicioTermosfera = 0;
		
		
		int tiempoAcumuladoTermosfera = tiempoTermosfera + tiempoAcumuladoMesosfera;
		int minutoAcumuladoTermosfera = tiempoAcumuladoTermosfera / 60;
		int segundoAcumuladoTermosfera = tiempoAcumuladoTermosfera % 60;
		
		
		int minutoTermosfera = tiempoTermosfera / 60;
		int segundoTermosfera = tiempoTermosfera % 60;
		
		int horasExtraTermosfera = minutoTermosfera / 60;
		int minutoExtraTermosfera = minutoTermosfera % 60;
		
		int horasExtraAcumuladoTermosfera = minutoAcumuladoTermosfera / 60;
		int minutoExtraAcumuladoTermosfera = minutoAcumuladoTermosfera % 60;
		

		int horaEstimadaTermosfera = horaInicioTermosfera + horasExtraAcumuladoTermosfera;
		int minutoEstimadaTermosfera = minutoInicioTermosfera + minutoExtraAcumuladoTermosfera;
		int segundoEstimadaTermosfera = segundoInicioTermosfera + segundoAcumuladoTermosfera;
		
		
		
		//Exosfera
		
		int horaInicioExosfera = 10;
		int minutoInicioExosfera = 0;
		int segundoInicioExosfera = 0;
		
		
		int tiempoAcumuladoExosfera = tiempoExosfera + tiempoAcumuladoTermosfera;
		int minutoAcumuladoExosfera = tiempoAcumuladoExosfera / 60;
		int segundoAcumuladoExosfera = tiempoAcumuladoExosfera % 60;
		
		
		int minutoExosfera = tiempoExosfera / 60;
		int segundoExosfera = tiempoExosfera % 60;
		
		int horasExtraExosfera = minutoExosfera / 60;
		int minutoExtraExosfera = minutoExosfera % 60;
		
		int horasExtraAcumuladoExosfera = minutoAcumuladoExosfera / 60;
		int minutoExtraAcumuladoExosfera = minutoAcumuladoExosfera % 60;
		
		
		int horaEstimadaExosfera = horaInicioExosfera + horasExtraAcumuladoExosfera;
		int minutoEstimadaExosfera = minutoInicioExosfera + minutoExtraAcumuladoExosfera;
		int segundoEstimadaExosfera = segundoInicioExosfera + segundoAcumuladoExosfera;
		
		
		//EspacioLuna
		
		int horaInicioEspacioLuna = 10;
		int minutoInicioEspacioLuna = 0;
		int segundoInicioEspacioLuna = 0;
		
		
		int tiempoAcumuladoEspacioLuna = tiempoEspacioLuna + tiempoAcumuladoExosfera;
		int minutoAcumuladoEspacioLuna = tiempoAcumuladoEspacioLuna / 60;
		int segundoAcumuladoEspacioLuna = tiempoAcumuladoEspacioLuna % 60;
		
		
		int minutoEspacioLuna = tiempoEspacioLuna / 60;
		int segundoEspacioLuna = tiempoEspacioLuna % 60;
		
		int horasExtraEspacioLuna = minutoEspacioLuna / 60;
		int minutoExtraEspacioLuna = minutoEspacioLuna % 60;
		
		int horasExtraAcumuladoEspacioLuna = minutoAcumuladoEspacioLuna / 60;
		int minutoExtraAcumuladoEspacioLuna = minutoAcumuladoEspacioLuna % 60;
		
		int horaEstimadaEspacioLuna = horaInicioEspacioLuna + horasExtraAcumuladoEspacioLuna;
		int minutoEstimadaEspacioLuna = minutoInicioEspacioLuna + minutoExtraAcumuladoEspacioLuna;
		int segundoEstimadaEspacioLuna = segundoInicioEspacioLuna + segundoAcumuladoEspacioLuna;
		
		
		
		//IMPRIMIR
		
		System.out.println(linea);
		System.out.println("IES FAUSTÍ BARBERÀ SPECIAL PROJECT WITH ESA");
		System.out.println(linea);
		System.out.println("This program show the expected times and estimated time of arrival");
		System.out.println(linea);
		
		//Troposfera
		
		String textoTroposfera = "Paso por Troposfera";
		String textoHoraEstimadaTroposfera = "Hora estimada: " + horaEstimadaTroposfera + ":" + minutoEstimadaTroposfera + ":" + segundoEstimadaTroposfera;
		String textoTiempoParcialTroposfera = "tiempo parcial: " + horasExtraTroposfera + ":" + minutoExtraTroposfera + ":" + segundoTroposfera;
	
		
		System.out.printf("%-20s %25s %25s%n", textoTroposfera, textoHoraEstimadaTroposfera, textoTiempoParcialTroposfera);
		
		
		//Estratosfera    
		
		String textoEstratosfera = "Paso por Estratosfera";
		String textoHoraEstimadaEstratosfera = "Hora estimada: " + horaEstimadaEstratosfera + ":" + minutoEstimadaEstratosfera + ":" + segundoEstimadaEstratosfera;
		String textoTiempoParcialEstratosfera = "tiempo parcial: " + horasExtraEstratosfera + ":" + minutoExtraEstratosfera + ":" + segundoEstratosfera;
	
		
		System.out.printf("%-20s %25s %25s%n", textoEstratosfera, textoHoraEstimadaEstratosfera, textoTiempoParcialEstratosfera);
	
		
		
		//Mesosfera        
		
		String textoMesosfera = "Paso por Mesosfera";
		String textoHoraEstimadaMesosfera = "Hora estimada: " + horaEstimadaMesosfera + ":" + minutoEstimadaMesosfera + ":" + segundoEstimadaMesosfera;
		String textoTiempoParcialMesosfera = "tiempo parcial: " + horasExtraMesosfera + ":" + minutoExtraMesosfera + ":" + segundoMesosfera;
	
		
		System.out.printf("%-20s %25s %25s%n", textoMesosfera, textoHoraEstimadaMesosfera, textoTiempoParcialMesosfera);
			
		
		//Termosfera       
		
		String textoTermosfera = "Paso por Termosfera";
		String textoHoraEstimadaTermosfera = "Hora estimada: " + horaEstimadaTermosfera + ":" + minutoEstimadaTermosfera + ":" + segundoEstimadaTermosfera;
		String textoTiempoParcialTermosfera = "tiempo parcial: " + horasExtraTermosfera + ":" + minutoExtraTermosfera+ ":" + segundoTermosfera;
	
		
		System.out.printf("%-20s %25s %25s%n", textoTermosfera, textoHoraEstimadaTermosfera, textoTiempoParcialTermosfera);
	
	
		
		//Exosfera         
		
		String textoExosfera = "Paso por Exosfera";
		String textoHoraEstimadaExosfera = "Hora estimada: " + horaEstimadaExosfera + ":" + minutoEstimadaExosfera + ":" + segundoEstimadaExosfera;
		String textoTiempoParcialExosfera = "tiempo parcial: " + horasExtraExosfera + ":" + minutoExtraExosfera + ":" + segundoExosfera;
	
		
		System.out.printf("%-20s %25s %25s%n", textoExosfera, textoHoraEstimadaExosfera, textoTiempoParcialExosfera);
	
		
		//EspacioLuna             
		
		String textoEspacioLuna = "Paso por Luna";
		String textoHoraEstimadaEspacioLuna = "Hora estimada: " + horaEstimadaEspacioLuna + ":" + minutoEstimadaEspacioLuna + ":" + segundoEstimadaEspacioLuna;
		String textoTiempoParcialEspacioLuna = "tiempo parcial: " + horasExtraEspacioLuna + ":" + minutoExtraEspacioLuna + ":" + segundoEspacioLuna;
	
		
		System.out.printf("%-20s %25s %25s", textoEspacioLuna, textoHoraEstimadaEspacioLuna, textoTiempoParcialEspacioLuna);
	
	
	
	
	
	
	}

}
