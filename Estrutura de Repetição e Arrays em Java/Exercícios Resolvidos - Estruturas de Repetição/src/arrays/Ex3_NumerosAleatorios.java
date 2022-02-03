package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numAleatorios = new int[20];

        System.out.print("Numeros Aleatorios: ");
        for(int i = 0; i < numAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for ( int numero: numAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessor dos Numeros Aleatorios: ");
        for ( int numero: numAleatorios) {
            System.out.print((numero+1) + " ");
        }
    }
}
