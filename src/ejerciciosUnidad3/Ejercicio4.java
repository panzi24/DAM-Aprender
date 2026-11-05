package ejerciciosUnidad3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        int opcionMenuUser = 0;
        int controlMenu = 0;

        int velocidadMediaA = 0;
        int velocidadMediaB = 0;

        int probalidadPincharA = 0;
        int probalidadPincharB = 0;
        int contadorIteracciones = 0;

        int contadorVictoriasA = 0;
        int contadorVictoriasB = 0;

        int distanciaCarreraTotal = 250;

        int distanciaCarreraActualA = 0;
        int distanciaCarreraActualB = 0;

        int posibilidadAveria = 0;

        int ruedaPinchaA = 0;
        int ruedaPinchaB = 0;

        while (controlMenu == 0) {

            System.out.println("Opción 1: habilidad de velocidad media de los 2 ciclistas");
            System.out.println("Opción 2: habilidad de pinchar la rueda de los 2 ciclistas");
            System.out.println("Opción 3: ejecutar la carrera");
            System.out.println("Opción 4: mostrar carreras ganadas por el ciclista A");
            System.out.println("Opción 5: mostrar carreras ganadas por el ciclista B");
            System.out.println("Opción 0: salir del programa");
            System.out.println("Elige una opción:");

            opcionMenuUser = sc.nextInt();

            switch (opcionMenuUser) {

                case 1:

                    velocidadMediaA = rn.nextInt(10, 36);
                    System.out.println("Velocidad media A: " + velocidadMediaA + " km/h");

                    velocidadMediaB = rn.nextInt(10, 36);
                    System.out.println("Velocidad media B: " + velocidadMediaB + " km/h");

                    System.out.println("-".repeat(50));
                    break;

                case 2:

                    probalidadPincharA = rn.nextInt(5, 26);
                    System.out.println("Probabilidad de pinchar A: " + probalidadPincharA + "%");

                    probalidadPincharB = rn.nextInt(5, 26);
                    System.out.println("Probabilidad de pinchar B: " + probalidadPincharB + "%");

                    System.out.println("-".repeat(50));
                    break;

                case 3:

                    if (velocidadMediaA == 0 || velocidadMediaB == 0) {
                        System.out.println("Primero debes configurar las velocidades.");
                        break;
                    }

                    if (probalidadPincharA == 0 || probalidadPincharB == 0) {
                        System.out.println("Primero debes configurar las probabilidades de pinchazo.");
                        break;
                    }

                    System.out.println("La carrera empieza");

                    distanciaCarreraActualA = 0;
                    distanciaCarreraActualB = 0;
                    contadorIteracciones = 0;

                    while (distanciaCarreraActualA < distanciaCarreraTotal
                            && distanciaCarreraActualB < distanciaCarreraTotal) {

                        contadorIteracciones++;

                        System.out.println("Iteración Nº " + contadorIteracciones);
                        System.out.println("-".repeat(50));


                        // Comprobamos las averías cada 5 iteraciones
                        if (contadorIteracciones % 5 == 0) {

                            posibilidadAveria = rn.nextInt(100);

                            if (posibilidadAveria < probalidadPincharA) {
                                ruedaPinchaA = 10;
                                System.out.println("Avería ciclista A");
                            } else {
                                System.out.println("Ciclista A OK");
                            }

                            posibilidadAveria = rn.nextInt(100);

                            if (posibilidadAveria < probalidadPincharB) {
                                ruedaPinchaB = 10;
                                System.out.println("Avería ciclista B");
                            } else {
                                System.out.println("Ciclista B OK");
                            }
                        }
                        
                        

                        // Avance del ciclista A
                        if (ruedaPinchaA == 0) {
                            distanciaCarreraActualA += velocidadMediaA;
                        }else if (ruedaPinchaA==10) {
                        	ruedaPinchaA = 20;
                        }else if (ruedaPinchaA == 20) {
                        	System.out.println("Reparando rueda A");
							ruedaPinchaA = 0;
						}

                        System.out.println("Distancia ciclista A: "
                                + distanciaCarreraActualA + " km");

                        // Avance del ciclista B
                        if (ruedaPinchaB == 0) {
                            distanciaCarreraActualB += velocidadMediaB;
                        }else if (ruedaPinchaB==10) {
                        	ruedaPinchaB = 20;
                        }else if (ruedaPinchaB == 20) {
                        	System.out.println("Reparando rueda B");
							ruedaPinchaB = 0;
						}

                        System.out.println("Distancia ciclista B: "
                                + distanciaCarreraActualB + " km");

                        System.out.println("-".repeat(50));

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }

                    // Determinamos el ganador
                    if (distanciaCarreraActualA >= distanciaCarreraTotal
                            && distanciaCarreraActualB < distanciaCarreraTotal) {

                        contadorVictoriasA++;
                        System.out.println("Victoria para el ciclista A");

                    } else if (distanciaCarreraActualB >= distanciaCarreraTotal
                            && distanciaCarreraActualA < distanciaCarreraTotal) {

                        contadorVictoriasB++;
                        System.out.println("Victoria para el ciclista B");

                    } else if (distanciaCarreraActualA >= distanciaCarreraTotal
                            && distanciaCarreraActualB >= distanciaCarreraTotal) {

                        if (distanciaCarreraActualA < distanciaCarreraActualB) {
                            contadorVictoriasA++;
                            System.out.println("Victoria para el ciclista A");
                        } else if (distanciaCarreraActualB < distanciaCarreraActualA) {
                            contadorVictoriasB++;
                            System.out.println("Victoria para el ciclista B");
                        } else {
                            System.out.println("Empate");
                        }
                    }

                    break;

                case 4:

                    System.out.println("Victorias de A: " + contadorVictoriasA);
                    break;

                case 5:

                    System.out.println("Victorias de B: " + contadorVictoriasB);
                    break;

                case 0:

                    System.out.println("Saliendo del programa");
                    controlMenu = 1;
                    break;

                default:

                    System.out.println("Número de programa no encontrado");
            }
        }

        sc.close();
        System.out.println("Fin del programa");
    }
}