package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        //Se não conseguir retornar vai dar um erro
        System.out.println(queueCarros.add(new Carro("Pegeout")));

        System.out.println(queueCarros);

        //Se não conseguir retornar somente retornaria false
        System.out.println(queueCarros.offer(new Carro("Renault")));

        //Peek não remove
        System.out.println(queueCarros.peek());

        System.out.println(queueCarros);

        //Remove da fila
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());

    }
}
