package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String linea = "-".repeat(40);
		
		
		System.out.println("¿Como te llamas?: ");
		String nombre = sc.nextLine();
		
		System.out.println("¿Y tu edad?: ");
		int edad = sc.nextInt();
		sc.nextLine();
		
		
		
		
		
		System.out.println(linea);
		
		int numeroBiblio = 0;
		
		System.out.println("¿Cuantos libros hay en tu biblioteca?: ");
		
		numeroBiblio = Integer.parseInt(sc.nextLine());
		System.out.printf("Te llamas %s y tu edad es %d%n", nombre ,edad);
		System.out.println(linea);
		System.out.printf("En tu biblio hay %d libros", numeroBiblio);
		
		
	}

}
