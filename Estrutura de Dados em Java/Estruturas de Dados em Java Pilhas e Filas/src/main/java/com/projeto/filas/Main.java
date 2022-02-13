package com.projeto.filas;

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));


        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("ultimo"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        FilaRefatorada <String> minhaFilaRefatorada = new FilaRefatorada<>();

        minhaFilaRefatorada.enqueue("primeiro");
        minhaFilaRefatorada.enqueue("segundo");
        minhaFilaRefatorada.enqueue("terceiro");
        minhaFilaRefatorada.enqueue("quarto");

        System.out.println(minhaFilaRefatorada);

        System.out.println(minhaFilaRefatorada.dequeue());

        System.out.println(minhaFilaRefatorada);

        minhaFilaRefatorada.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);


    }
}
