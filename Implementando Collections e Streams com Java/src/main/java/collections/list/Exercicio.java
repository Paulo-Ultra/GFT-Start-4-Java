package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {


        List<String> pessoas = new ArrayList<>();

        pessoas.add("Juliana");
        pessoas.add("Pedro");
        pessoas.add("Carlos");
        pessoas.add("Larissa");
        pessoas.add("João");

        for (String pessoa: pessoas) {
            System.out.println("-->" + pessoa);
        }

        pessoas.set(2, "Roberto");

        System.out.println(pessoas);
        System.out.println(pessoas.get(1));

        pessoas.remove(4);
        pessoas.remove("João");

        int tamanho = pessoas.size();
        System.out.println(tamanho);

        boolean contemJuliano = pessoas.contains("Juliano");

        System.out.println(contemJuliano);

        pessoas.add("Juliana");
        pessoas.add("Pedro");
        pessoas.add("Carlos");
        pessoas.add("Larissa");
        pessoas.add("João");
        pessoas.add("Ismael");
        pessoas.add("Rodrigo");

        System.out.println(pessoas);

        Collections.sort(pessoas);

        System.out.println(pessoas);

        boolean listEstaVazia = pessoas.isEmpty();

        System.out.println(listEstaVazia);
    }
}
