package arrays;



public class Main {
    public static void main(String[] args) {
        int[] numeros = {8, 23, 4, 42, 15};

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma es: " + suma);

        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);

        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero menor es: " + menor);

        int contadorPar = 0;
        int contadorImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPar = contadorPar + 1;
            }
            if (numeros[i] % 2 == 1) {
                contadorImpar = contadorImpar + 1;
            }
        }
        System.out.println("Hay " + contadorPar + " numeros pares y " + contadorImpar + " numeros impares");
    }
}