package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exercício {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        Iterator<Integer> iterator = numeros.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        numeros.remove(3);
        numeros.add(23);

        for(Integer num : numeros) {
            System.out.println(num);
        }

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());

        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");

        LinkedHashSet<Integer> numeros2 = new LinkedHashSet<>();

        numeros2.add(3);
        numeros2.add(88);
        numeros2.add(20);
        numeros2.add(44);
        numeros2.add(3);

        Iterator<Integer> iterator2 = numeros2.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        numeros2.remove(3);
        numeros2.add(23);

        for(Integer num2 : numeros2) {
            System.out.println(num2);
        }

        System.out.println(numeros2.size());

        System.out.println(numeros2.isEmpty());

        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");

        TreeSet<Integer> numeros3 = new TreeSet<>();

        numeros3.add(3);
        numeros3.add(88);
        numeros3.add(20);
        numeros3.add(44);
        numeros3.add(3);

        Iterator<Integer> iterator3 = numeros3.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        numeros3.remove(3);
        numeros3.add(23);

        for(Integer num3 : numeros3) {
            System.out.println(num3);
        }

        System.out.println(numeros2.size());

        System.out.println(numeros2.isEmpty());

    }
}
