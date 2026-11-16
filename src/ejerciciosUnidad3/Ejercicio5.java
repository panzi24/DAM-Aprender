package ejerciciosUnidad3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;
		
		int archivosDescargados = 0;
		int kilobytesTotales = 0;

		int habilidadHacker = 0;

		int contadorIiteraciones = 0;
		
		int velocidadDescarga = rn.nextInt();
		
		int contadorArchivoAllTime = 0;
		int contadorKBAllTime = 0;
		
		double porcentajeArchivo = 0;
		int habilidadHaker50 = 0;
		int habilidadHaker25 = 0;
		int habilidadHakerActual = 0;

		while (controlMenu == 0) {
			

			
			
			System.out.println("opción 1 habilidad Hacker");
			System.out.println("opción 2 crear archivo");
			System.out.println("opción 3 descargar el archivo");
			System.out.println("opción 4 mostrar número de archivos descargados");
			System.out.println("opción 5 mostrar total kilobytes descargados");
			System.out.println("opción 0 salir del programa: ");
			System.out.println("Elige una opcion: ");

			
			opcionMenuUser = sc.nextInt();

			
			switch (opcionMenuUser) {
			case 1:
				velocidadDescarga = 1+rn.nextInt(3);
				
				if (velocidadDescarga == 1) {
					habilidadHacker = 100;
					System.out.println("Habilidad del hacker 100%: " + habilidadHacker);

				}
				
				if (velocidadDescarga == 2) {
					habilidadHacker = 200;
					habilidadHaker50 = habilidadHacker/2;
					System.out.println("Habilidad del hacker 50%: " + habilidadHaker50);
				}
				
				if (velocidadDescarga == 3) {
					habilidadHacker = 500;
					habilidadHaker25 = habilidadHacker/2;
					System.out.println("Habilidad del hacker 75%: " + habilidadHaker25);
				}
				
				
				
			
				
				
				break;
			case 2:
				
				kilobytesTotales = rn.nextInt(1000,100000);
				System.out.println("El archivo de descarga es: " + kilobytesTotales);
				break;
			case 3:
				
				archivosDescargados = 0;
				contadorIiteraciones = 0;
				while (archivosDescargados < kilobytesTotales ) {
					contadorIiteraciones++;
					System.out.println("Descargando el archivo");
					System.out.println("Paquete Nº " + contadorIiteraciones);
					
					
					
					archivosDescargados+=habilidadHacker;
					int kbRestantes = kilobytesTotales - archivosDescargados;
					
					if (kbRestantes < habilidadHacker) {
						archivosDescargados += kbRestantes  ;
					}else if (kbRestantes >= habilidadHacker) {
						archivosDescargados+=habilidadHacker;
					}
					
					porcentajeArchivo = 100.0 * archivosDescargados/kilobytesTotales;
					System.out.println("Porcentaje descargado: " + (int)porcentajeArchivo + "%");
					
					if(porcentajeArchivo<50) {
						habilidadHakerActual+=habilidadHacker;
					}else if(porcentajeArchivo>=50 && porcentajeArchivo <= 75) {
						habilidadHakerActual+= habilidadHaker50;
					}else if (porcentajeArchivo > 75) {
						habilidadHakerActual+= habilidadHaker25;

					}
					
					
					
					
					if( archivosDescargados > kilobytesTotales) {
						System.out.println(archivosDescargados + "KB" + "/" + kilobytesTotales + "KB");

						
					}
					System.out.println(archivosDescargados + "KB" + "/" + kilobytesTotales + "KB");
					System.out.println("-".repeat(50));

					
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO: handle exception
							e.printStackTrace();
						}
					}
				
				contadorArchivoAllTime++;
				contadorKBAllTime = kilobytesTotales;
				
				System.out.println("Archivo descargado");
				System.out.println("-".repeat(50));

				
				break;
				
			case 4:
				System.out.println("El numero de paquetes es de: " + contadorArchivoAllTime);
				
			   break;
			case 5:
				System.out.println("Los kilobytes totales son en total: " +contadorKBAllTime);
				
				break;
			    
			
		
			case 0:
				System.out.println("Ejecutando opcion 0");
				controlMenu = 1;
				break;
			default:
				System.out.println("Número de programa no encontrado");
			}
		}

		System.out.println("Fin del program");						
	}

}
