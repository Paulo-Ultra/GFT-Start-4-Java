package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        //Usa-se lista em quer retornar e navegar em banco de dados e mantem a ordenação que for definida
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("João");
        nomes.add("Maria");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        //Lista em forma ascendente
        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        String nome = nomes.get(3);

        System.out.println(nome);

        int posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        boolean listEstaVazia = nomes.isEmpty();

        System.out.println(listEstaVazia);

        //Uso do for each --> Faz a navegação na lista, reebe a declaração de uma variável na esquerda e o segundo argumento é a Lista
        for(String nomeDoItem: nomes){
            System.out.println("--->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        //hasNext traz o booleano true ou false
        while(iterator.hasNext()){
            //next retorna o objeto que vc está interando, no caso aqui uma String
            System.out.println("------>" + iterator.next());
        }

        nomes.clear();

        listEstaVazia = nomes.isEmpty();

        System.out.println(listEstaVazia);



    }
}
