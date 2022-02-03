package loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o número da tabuada: ");
        int tabuada = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println("Tabuada de " + tabuada + ": " + tabuada + " x " + i + " = " + (tabuada *i));
        }

    }
}
