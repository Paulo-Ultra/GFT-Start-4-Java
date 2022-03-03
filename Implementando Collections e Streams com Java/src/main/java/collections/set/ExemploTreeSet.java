package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Topo de árvore
        System.out.println("First --> " + treeCapitais.first());

        //Final dá árvore
        System.out.println("Last --> " + treeCapitais.last());

        //Retorna a primeira capital abaixo(Esquerda) da árvore da capital parametrizada
        System.out.println("Lower --> " + treeCapitais.lower("Florianópolis"));

        //Retorna a primeira capital acima(Direita) da árvore da capital parametrizada
        System.out.println("Higher --> " + treeCapitais.higher("Florianópolis"));

        System.out.println(treeCapitais);

        //Retorna a primeira capital do topo da árvore, removendo-a do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna a última capital do final da árvore, removendo-a do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String capital: treeCapitais) {
            System.out.println(capital);
        }
    }
}
