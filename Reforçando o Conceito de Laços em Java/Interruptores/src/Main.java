
public class Main {
    public static void main(String[] args) {

        System.out.println("BREAK");

        //Break Sem label
        while(true) {
            System.out.println("Não vai ser infinito...");
            break;
        }

        for(int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i " + i);
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j == 2){
                    break;
                }
                System.out.println("i " + i + " j " + j);
            }
        }

        int i = 0;
        do {
            if(i == 3) {
                break;
            }
            System.out.println("i " + i);
            i++;
        } while(i < 5);

        //Break Com label

        out:
        for(i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j == i) {
                    break out;
                }
                System.out.println("i " + i + " j " + j);
            }
        }
        System.out.println("Veio para cá...");

        System.out.println("CONTINUE");

        //Continue Sem label

        i = 0;
        while(i < 5) {
            i++;
            if(i == 2 || i == 5) {
                continue;
            }
            System.out.println("i " + i);
        }

        for(i = 0; i < 5; i++) {
            if( i == 3) {
                continue;
            }
            System.out.println("i " + i);
        }

        for(i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(j == 1) {
                    continue;
                }
                System.out.println("i " + i + " j " + j);
            }
        }

        int a = 0;
        do {
            a++;
            if( a == 2 || a == 5) {
                continue;
            }
            System.out.println("a " + a);
        }while (a < 5);

        // Continue com label
        out:
        for(i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j == 2) {
                    continue out;
                }
                System.out.println("i " + i + " j " + j);
            }
        }

        System.out.println("1 até 14 FOR");
        for(i = 0; i <= 14; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println("i " + i);
            if(i == 12) {
                break;
            }
        }

        System.out.println("1 até 14 WHILE");
        i = 1;
        while(i <= 14) {
            if(i == 12) {
                break;
            }
        if(i % 2 == 0) {
            System.out.println("i " + i);
            i++;
        }else {
            i++;
            continue;
         }
        }

        //RETURN
        for(int j = 0; j <= 2; j++) {
            return;
        }
        System.out.println("Não vai aparecer este texto.");
    }
}
