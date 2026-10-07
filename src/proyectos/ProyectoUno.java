package proyectos;


public class ProyectoUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SIMÖN OCHOA IBAÑEZ 1/10/26
		
		int diaInicio = 0;
		int horaInicio = 6;
		int minutoInicio = 0;
		int segundoInicio = 0;
		
		int velocidadBarco = 40 * 1000;
		double tiempoAcumulado = 0;
		
		//ValenciaBarcelona
		
		int distanciaTotalValenciaBarcelona = 305 * 1000;
		int tiempoValenciaBarcelona = (distanciaTotalValenciaBarcelona * 3600) / velocidadBarco;
		

		tiempoAcumulado = tiempoAcumulado + tiempoValenciaBarcelona;
		
		
		
		int horasExtraValenciaBarcelona = tiempoValenciaBarcelona / 3600;		
		int minutoExtraValenciaBarcelona = (tiempoValenciaBarcelona % 3600) / 60;		
		int segundoValenciaBarcelona = tiempoValenciaBarcelona % 60;

		
		
		double horaEstimadaValenciaBarcelona = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio + tiempoAcumulado;
		double minutoEstimadaValenciaBarcelona = (horaEstimadaValenciaBarcelona % 3600) / 60;
		double segundoEstimadaValenciaBarcelona = horaEstimadaValenciaBarcelona % 60;
		double diaEstimadoValenciaBarcelona = diaInicio + horaEstimadaValenciaBarcelona / 86400;
		
		horaEstimadaValenciaBarcelona = (horaEstimadaValenciaBarcelona % 86400) / 3600;
		
		
		
		
		String textoPaso = "Paso de Valencia -> Barcelona";
		String textoEstimado = "Hora estimada: " + (int)diaEstimadoValenciaBarcelona+ ":" + (int)horaEstimadaValenciaBarcelona + ":" + (int)minutoEstimadaValenciaBarcelona + ":" + (int)segundoEstimadaValenciaBarcelona;
		String textoParcial = "Tiempo parcial: " + (int)horasExtraValenciaBarcelona + ":" + (int)minutoExtraValenciaBarcelona + ":" + (int)segundoValenciaBarcelona;
		
		System.out.printf("%-20s %-20s %-20s%n", textoPaso, textoEstimado, textoParcial);
		
		
		
		//BarcelonaMarsella 
		
		int distanciaTotalBarcelonaMarsella = 280 * 1000;
		int tiempoBarcelonaMarsella = (distanciaTotalBarcelonaMarsella * 3600) / velocidadBarco;
		

		
		int minutoBarcelonaMarsella = tiempoBarcelonaMarsella / 60;
		
		int horasExtraBarcelonaMarsella = tiempoBarcelonaMarsella / 3600;		
		int minutoExtraBarcelonaMarsella = (tiempoBarcelonaMarsella % 3600) / 60;		
		int segundoBarcelonaMarsella = tiempoBarcelonaMarsella % 60;

		tiempoAcumulado = tiempoAcumulado + tiempoBarcelonaMarsella;
		
		int horasExtraAcumuladoBarcelonaMarsella = horasExtraBarcelonaMarsella;
		int minutoExtraAcumuladoBarcelonaMarsella = minutoExtraBarcelonaMarsella;
		
		
		double horaEstimadaBarcelonaMarsella = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio +  + tiempoAcumulado;
		double minutoEstimadaBarcelonaMarsella = (horaEstimadaBarcelonaMarsella % 3600) / 60;
		double segundoEstimadaBarcelonaMarsella = horaEstimadaBarcelonaMarsella % 60;
		double diaEstimadoBarcelonaMarsella = diaInicio + horaEstimadaBarcelonaMarsella / 86400;
		
		horaEstimadaBarcelonaMarsella = (horaEstimadaBarcelonaMarsella % 86400) / 3600;
		
		
		
		
		String textoPasoBarcelonaMarsella = "Paso de Barcelona ➔ Marsella ";
		String textoEstimadoBarcelonaMarsella = "Hora estimada: " + (int)diaEstimadoBarcelonaMarsella + ":" + (int)horaEstimadaBarcelonaMarsella + ":" + (int)minutoEstimadaBarcelonaMarsella + ":" + (int)segundoEstimadaBarcelonaMarsella;
		String textoParcialBarcelonaMarsella = "Tiempo parcial: " + (int)horasExtraAcumuladoBarcelonaMarsella + ":" + (int)minutoExtraAcumuladoBarcelonaMarsella + ":" + (int)segundoBarcelonaMarsella;
		
		System.out.printf("%-20s %-20s %-20s%n", textoPasoBarcelonaMarsella, textoEstimadoBarcelonaMarsella, textoParcialBarcelonaMarsella);
		
		
		//MarsellaSavona 
		
		int distanciaTotalMarsellaSavona = 280 * 1000;
		int tiempoMarsellaSavona = (distanciaTotalMarsellaSavona * 3600) / velocidadBarco;
		

		
		tiempoAcumulado = tiempoAcumulado + tiempoMarsellaSavona;
		
		int horasExtraMarsellaSavona = tiempoMarsellaSavona / 3600;		
		int minutoExtraMarsellaSavona = (tiempoMarsellaSavona % 3600) / 60;		
		int segundoMarsellaSavona = tiempoMarsellaSavona % 60;

		
		int horasExtraAcumuladoMarsellaSavona = horasExtraMarsellaSavona;
		int minutoExtraAcumuladoMarsellaSavona = minutoExtraMarsellaSavona;
		
		
		double horaEstimadaMarsellaSavona = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio + tiempoAcumulado;
		double minutoEstimadaMarsellaSavona = (horaEstimadaMarsellaSavona % 3600) / 60;
		double segundoEstimadaMarsellaSavona = horaEstimadaMarsellaSavona % 60;
		double diaEstimadoMarsellaSavona= diaInicio + horaEstimadaMarsellaSavona / 86400;
		
		horaEstimadaMarsellaSavona = (horaEstimadaMarsellaSavona % 86400) / 3600;
		
		
		
		
		String textoPasoMarsellaSavona= "Paso de Marsella -> Savona";
		String textoEstimadoMarsellaSavona = "Hora estimada: " + (int)diaEstimadoMarsellaSavona + ":" + (int)horaEstimadaMarsellaSavona + ":" + (int)minutoEstimadaMarsellaSavona + ":" + (int)segundoEstimadaMarsellaSavona;
		String textoParcialMarsellaSavona = "Tiempo parcial: " + (int)horasExtraAcumuladoMarsellaSavona + ":" + (int)minutoExtraAcumuladoMarsellaSavona + ":" + (int)segundoMarsellaSavona;
		
		System.out.printf("%-20s %-20s %-20s%n", textoPasoMarsellaSavona, textoEstimadoMarsellaSavona, textoParcialMarsellaSavona);
		
		
		//SavonaCivitavecchia 
		
		int distanciaTotalSavonaCivitavecchia = 390 * 1000;
		int tiempoSavonaCivitavecchia = (distanciaTotalSavonaCivitavecchia * 3600) / velocidadBarco;
		

		
		tiempoAcumulado = tiempoAcumulado + tiempoSavonaCivitavecchia;
		
		int horasExtraSavonaCivitavecchia = tiempoSavonaCivitavecchia / 3600;		
		int minutoExtraSavonaCivitavecchia = (tiempoSavonaCivitavecchia % 3600) / 60;		
		int segundoSavonaCivitavecchia= tiempoSavonaCivitavecchia % 60;

		
		
		double horaEstimadaSavonaCivitavecchia = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio +  tiempoAcumulado;
		double minutoEstimadaSavonaCivitavecchia = (horaEstimadaSavonaCivitavecchia % 3600) / 60;
		double segundoEstimadaSavonaCivitavecchia = horaEstimadaSavonaCivitavecchia % 60;
		double diaEstimadoSavonaCivitavecchia = diaInicio + horaEstimadaSavonaCivitavecchia / 86400;
		
		horaEstimadaSavonaCivitavecchia = (horaEstimadaSavonaCivitavecchia % 86400) / 3600;
		
		
		
		
		String textoPasoSavonaCivitavecchia = "Paso de Savona -> Civitavecchia";
		String textoEstimadoSavonaCivitavecchia = "Hora estimada: " + (int)diaEstimadoSavonaCivitavecchia + ":" + (int)horaEstimadaSavonaCivitavecchia + ":" + (int)minutoEstimadaSavonaCivitavecchia + ":" + (int)segundoEstimadaSavonaCivitavecchia;
		String textoParcialSavonaCivitavecchia = "Tiempo parcial: " + (int)horasExtraSavonaCivitavecchia + ":" + (int)minutoExtraSavonaCivitavecchia + ":" + (int)segundoSavonaCivitavecchia;
		
		System.out.printf("%-20s %-20s %-20s%n", textoPasoSavonaCivitavecchia, textoEstimadoSavonaCivitavecchia, textoParcialSavonaCivitavecchia);
		
		

		//CivitavecchiaPM 
		
		double distanciaTotalCivitavecchiaPM = 740 * 1000;
		double tiempoCivitavecchiaPM = (distanciaTotalCivitavecchiaPM * 3600) / velocidadBarco;
		

		
		tiempoAcumulado = tiempoAcumulado + tiempoCivitavecchiaPM;
		
		double horasExtraCivitavecchiaPM = tiempoCivitavecchiaPM / 3600;		
		double minutoExtraCivitavecchiaPM = (tiempoCivitavecchiaPM % 3600) / 60;		
		double segundoCivitavecchiaPM = tiempoCivitavecchiaPM % 60;

		
		
		double horaEstimadaCivitavecchiaPM = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio +  tiempoAcumulado;
		double minutoEstimadaCivitavecchiaPM = (horaEstimadaCivitavecchiaPM % 3600) / 60;
		double segundoEstimadaCivitavecchiaPM = horaEstimadaCivitavecchiaPM % 60;
		double diaEstimadoCivitavecchiaPM = diaInicio + horaEstimadaCivitavecchiaPM / 86400;
		
		horaEstimadaCivitavecchiaPM = (horaEstimadaCivitavecchiaPM % 86400) / 3600;
		
		
		
		
		String textoPasoCivitavecchiaPM = "Paso de Civitavecchia ➔ Palma de Mallorca";
		String textoEstimadoCivitavecchiaPM = "Hora estimada: " + (int)diaEstimadoCivitavecchiaPM + ":" + (int)horaEstimadaCivitavecchiaPM + ":" + (int)minutoEstimadaCivitavecchiaPM + ":" + (int)segundoEstimadaCivitavecchiaPM;
		String textoParcialCivitavecchiaPM = "Tiempo parcial: " + (int)horasExtraCivitavecchiaPM + ":" + (int)minutoExtraCivitavecchiaPM + ":" + (int)segundoCivitavecchiaPM;
		
		System.out.printf("%-20s %-20s %-20s%n", textoPasoCivitavecchiaPM, textoEstimadoCivitavecchiaPM, textoParcialCivitavecchiaPM);
		
		
		//PMValencia  
		
		double distanciaTotalPMValencia = 260 * 1000;
		double tiempoPMValencia = (distanciaTotalPMValencia * 3600) / velocidadBarco;
		

		
		tiempoAcumulado = tiempoAcumulado + tiempoPMValencia;
		
		double horasExtraPMValencia = tiempoPMValencia / 3600;		
		double minutoExtraPMValencia = (tiempoPMValencia % 3600) / 60;		
		double segundoPMValencia = tiempoPMValencia % 60;

		
		
		double horaEstimadaPMValencia = (horaInicio * 3600) + (minutoInicio * 60) + segundoInicio +  tiempoAcumulado;
		double minutoEstimadaPMValencia = (horaEstimadaPMValencia % 3600) / 60;
		double segundoEstimadaPMValencia = horaEstimadaPMValencia % 60;
		double diaEstimadoPMValencia = diaInicio + horaEstimadaPMValencia / 86400;
		
		horaEstimadaPMValencia = (horaEstimadaPMValencia % 86400) / 3600;
		
		
		
		
		String textoPasoPMValencia = "Paso de Civitavecchia ➔ Palma de Mallorca";
		String textoEstimadoPMValencia = "Hora estimada: " + (int)diaEstimadoPMValencia + ":" + (int)horaEstimadaPMValencia + ":" + (int)minutoEstimadaPMValencia + ":" + (int)segundoEstimadaPMValencia;
		String textoParcialPMValencia = "Tiempo parcial: " + (int)horasExtraPMValencia + ":" + (int)minutoExtraPMValencia + ":" + (int)segundoPMValencia;
		
		System.out.printf("%-20s %-20s %-20s%n", textoPasoPMValencia, textoEstimadoPMValencia, textoParcialPMValencia);
		
		


		

	}

}
