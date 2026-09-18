package printfcasting;


public class Main {
    public static void main(String[] args) {
        int contadorPar = 3;
        int contadorImpar = 2;
        
        
        String linea = "-".repeat(40);

        
        System.out.printf("Hay %d numeros pares y %d numeros impares%n", contadorPar, contadorImpar);

        System.out.println(linea);

        
        String nombre = "Java";
        double nota = 8.5;
        System.out.printf("Mi nombre es %s y saque un %.2f en mi nota%n", nombre, nota);

        System.out.println(linea);

        
        double numeroDecimal = 4.99;
        int numeroEntero = (int) numeroDecimal;
        double numeroRedondeo = Math.round(numeroDecimal);
        System.out.printf("El numero redondeado es %.2f y el no redondeado %d%n", numeroRedondeo, numeroEntero);
        
        System.out.println(linea);
        
        final double IVA = 0.21;
        double precio = 100.0;
        double total = precio + precio * IVA;
        System.out.printf("El precio total es de %.2f €%n", total);
        
        System.out.println(linea);

        
        System.out.printf("[%20s]%n", "Java");
        System.out.printf("[%-20s]%n", "Java");
        
        
        System.out.println(linea);

        
        System.out.printf("%23s %-8s %-8s%n", "Título", "Autor", "Año");
        System.out.printf("%22s %-8s %-8s%n", "El Quijote", "Cervantes", "1605");
        System.out.printf("%23s %-8s %-8s%n", "1984", "Orwell", "1949");
        System.out.printf("%23s %-8s %-8s%n", "Agente 0", "Panzi", "1972");
        
        
        System.out.println(linea);

        
        
        
        
    }
}