package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeiracapital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira capital abaixo(esquerda) na árvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira capital Acima(direita) na árvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + "--> " + treeCapitais.firstEntry().getValue());

        //Retorna a última capital no topo da árvore
        System.out.println(treeCapitais.lastEntry().getKey() + "--> " + treeCapitais.lastEntry().getValue());

        //lowerEntry com chamada de chave/valor
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + "--> " + treeCapitais.lowerEntry("SC").getValue());

        //higherEntry com chamada de chave/valor
        System.out.println(treeCapitais.higherEntry("SC").getKey() + "--> " + treeCapitais.higherEntry("SC").getValue());

        System.out.println(treeCapitais);

        //poll faz a remoção da chave/valor da árvore
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println(firstEntry.getKey() + "--> " + firstEntry.getValue());

        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println(lastEntry.getKey() + "--> " + lastEntry.getValue());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "--> " + treeCapitais.get(key));
        }
        System.out.println("-----------------------------------");
        for(String capital : treeCapitais.keySet()){
            System.out.println(capital + "--> " + treeCapitais.get(capital));
        }
        System.out.println("-----------------------------------");
        for (Map.Entry<String, String> capital : treeCapitais.entrySet())
            System.out.println(capital.getKey() + "--> " + capital.getValue());
    }
}
