package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("¿Como te llamas?: ");
		String nombre = sc.nextLine();
		
		System.out.println("¿Y tu edad?: ");
		int edad = sc.nextInt();
		
		
		
		System.out.printf("Te llamas %s y tu edad es %d", nombre ,edad);
		
		
	}

}
