package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String lineaGion = ("-").repeat(40);
		
		double cargoEmpleado = 0;
		double diasViajes = 0 ;
		double estadoCivil = 0;
		
		//cargo
		
		while (true) {
			System.out.printf(" %20s%n %10s%n %10s%n ", "1- Programador junior", "2- Prog. senior", "3- Jefe de proyecto");
			System.out.println("Introduzca el cargo del empleado (1-3): ");
			cargoEmpleado = sc.nextInt();
			
			if (cargoEmpleado >= 1 && cargoEmpleado <= 3) {
				break;
			}else {
				System.out.println("No esta estre el 1-3");
			}
			
		}
		
		

		//Vacaciones
		while (true) {
			System.out.println("¿Cuantos dias ha estado de viaje visitando clientes?: ");
			diasViajes = sc.nextInt();
			if (diasViajes >= 1 && diasViajes <= 31) {
				break;
			} else{
				System.out.println("Del 1 al 30");
			}
			
		}	
		//estadoCivil
		while (true) {
		System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		estadoCivil = sc.nextInt();
		if (estadoCivil == 1 || estadoCivil == 2) {
			break;
		} else{
			System.out.println("Del 1 al 2");
		}
		}
		
		
		
		//Junior casado y no
		
		if (cargoEmpleado == 1 && estadoCivil == 1) {
			double sueldoBaseJunior = 950;
			double dietasViaje = diasViajes * 30;
			
			double sueldoBruto = sueldoBaseJunior + dietasViaje;
			double restaIRPF = 25;
			double rentencionIRPF = (sueldoBruto * restaIRPF) / 100;
			
			double sueldoNeto = sueldoBruto - rentencionIRPF;
			
			
			System.out.println(lineaGion);
			System.out.println("Sueldo base: " + sueldoBaseJunior);
			System.out.println("Dietas( " + (int)diasViajes + " viajes" + " ): "  + dietasViaje);
			System.out.println(lineaGion);
			System.out.println("Sueldo bruto: " + sueldoBruto);
			System.out.println("Retencion IRPF ( " + (int)restaIRPF + "%" + " ): "  + rentencionIRPF);
			System.out.println(lineaGion);
			System.out.println("Sueldo neto: " + sueldoNeto);
			
			
			}
		
		
		if (cargoEmpleado == 1 && estadoCivil == 2) {
			double sueldoBaseJunior = 950;
			double dietasViaje = diasViajes * 30;
			
			double sueldoBruto = sueldoBaseJunior + dietasViaje;
			double restaIRPF = 20;
			double rentencionIRPF = (sueldoBruto * restaIRPF) / 100;
			
			double sueldoNeto = sueldoBruto - rentencionIRPF;
			
			
			System.out.println(lineaGion);
			System.out.println("Sueldo base: " + sueldoBaseJunior);
			System.out.println("Dietas( " + (int)diasViajes + " viajes" + " ): "  + dietasViaje);
			System.out.println(lineaGion);
			System.out.println("Sueldo bruto: " + sueldoBruto);
			System.out.println("Retencion IRPF ( " + (int)restaIRPF + "%" + " ): "  + rentencionIRPF);
			System.out.println(lineaGion);
			System.out.println("Sueldo neto: " + sueldoNeto);
			
			
			}
		
		
		//Senior casado y no
		
		if (cargoEmpleado == 2 && estadoCivil == 1) {
			double sueldoBaseJunior = 1200;
			double dietasViaje = diasViajes * 30;
			
			double sueldoBruto = sueldoBaseJunior + dietasViaje;
			double restaIRPF = 25;
			double rentencionIRPF = (sueldoBruto * restaIRPF) / 100;
			
			double sueldoNeto = sueldoBruto - rentencionIRPF;
			
			
			System.out.println(lineaGion);
			System.out.println("Sueldo base: " + sueldoBaseJunior);
			System.out.println("Dietas( " + (int)diasViajes + " viajes" + " ): "  + dietasViaje);
			System.out.println(lineaGion);
			System.out.println("Sueldo bruto: " + sueldoBruto);
			System.out.println("Retencion IRPF ( " + (int)restaIRPF + "%" + " ): "  + rentencionIRPF);
			System.out.println(lineaGion);
			System.out.println("Sueldo neto: " + sueldoNeto);
			
			
			}
		
		
		if (cargoEmpleado == 2 && estadoCivil == 2) {
			double sueldoBaseJunior = 1200;
			double dietasViaje = diasViajes * 30;
			
			double sueldoBruto = sueldoBaseJunior + dietasViaje;
			double restaIRPF = 20;
			double rentencionIRPF = (sueldoBruto * restaIRPF) / 100;
			
			double sueldoNeto = sueldoBruto - rentencionIRPF;
			
			
			System.out.println(lineaGion);
			System.out.println("Sueldo base: " + sueldoBaseJunior);
			System.out.println("Dietas( " + (int)diasViajes + " viajes" + " ): "  + dietasViaje);
			System.out.println(lineaGion);
			System.out.println("Sueldo bruto: " + sueldoBruto);
			System.out.println("Retencion IRPF ( " + (int)restaIRPF + "%" + " ): "  + rentencionIRPF);
			System.out.println(lineaGion);
			System.out.println("Sueldo neto: " + sueldoNeto);
			
			
			}
		
		
		//Jefe casado y no
		
		if (cargoEmpleado == 3 && estadoCivil == 1) {
			double sueldoBaseJunior = 1600;
			double dietasViaje = diasViajes * 30;
			
			double sueldoBruto = sueldoBaseJunior + dietasViaje;
			double restaIRPF = 25;
			double rentencionIRPF = (sueldoBruto * restaIRPF) / 100;
			
			double sueldoNeto = sueldoBruto - rentencionIRPF;
			
			
			System.out.println(lineaGion);
			System.out.println("Sueldo base: " + sueldoBaseJunior);
			System.out.println("Dietas( " + (int)diasViajes + " viajes" + " ): "  + dietasViaje);
			System.out.println(lineaGion);
			System.out.println("Sueldo bruto: " + sueldoBruto);
			System.out.println("Retencion IRPF ( " + (int)restaIRPF + "%" + " ): "  + rentencionIRPF);
			System.out.println(lineaGion);
			System.out.println("Sueldo neto: " + sueldoNeto);
			
			
			}
		
		
		if (cargoEmpleado == 3 && estadoCivil == 2) {
			double sueldoBaseJunior = 1600;
			double dietasViaje = diasViajes * 30;
			
			double sueldoBruto = sueldoBaseJunior + dietasViaje;
			double restaIRPF = 20;
			double rentencionIRPF = (sueldoBruto * restaIRPF) / 100;
			
			double sueldoNeto = sueldoBruto - rentencionIRPF;
			
			
			System.out.println(lineaGion);
			System.out.println("Sueldo base: " + sueldoBaseJunior);
			System.out.println("Dietas( " + (int)diasViajes + " viajes" + " ): "  + dietasViaje);
			System.out.println(lineaGion);
			System.out.println("Sueldo bruto: " + sueldoBruto);
			System.out.println("Retencion IRPF ( " + (int)restaIRPF + "%" + " ): "  + rentencionIRPF);
			System.out.println(lineaGion);
			System.out.println("Sueldo neto: " + sueldoNeto);
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}

