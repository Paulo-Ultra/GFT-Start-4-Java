package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {

        Queue<String> minhaFila = new LinkedList<>();

        minhaFila.add("Juliana");
        minhaFila.add("Pedro");
        minhaFila.add("Carlos");
        minhaFila.add("Larissa");
        minhaFila.add("João");

        System.out.println(minhaFila);

        String filaSemRemover = minhaFila.peek();

        System.out.println(filaSemRemover);

        System.out.println(minhaFila);

        String filaRemovendo = minhaFila.poll();

        System.out.println(filaRemovendo);

        System.out.println(minhaFila);

        minhaFila.add("Daniel");

        System.out.println(minhaFila);

        System.out.println(minhaFila.size());

        System.out.println(minhaFila.isEmpty());

        System.out.println(minhaFila);

        System.out.println(minhaFila.contains("Carlos"));

    }
}
