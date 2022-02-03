package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        double soma = 0;
        int count = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma += numero;

            if(numero > maior) maior = numero;
            count++;
        } while(count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: " + soma/5);
        System.out.println("Fim do Programa");
    }
}
