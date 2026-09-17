package printfcasting;


public class Main {
    public static void main(String[] args) {
        int contadorPar = 3;
        int contadorImpar = 2;
        System.out.printf("Hay %d numeros pares y %d numeros impares%n", contadorPar, contadorImpar);

        String nombre = "Java";
        double nota = 8.5;
        System.out.printf("Mi nombre es %s y saque un %.2f en mi nota%n", nombre, nota);

        double numeroDecimal = 4.99;
        int numeroEntero = (int) numeroDecimal;
        double numeroRedondeo = Math.round(numeroDecimal);
        System.out.printf("El numero redondeado es %.2f y el no redondeado %d%n", numeroRedondeo, numeroEntero);

        final double IVA = 0.21;
        double precio = 100.0;
        double total = precio + precio * IVA;
        System.out.printf("El precio total es de %.2f €%n", total);
    }
}