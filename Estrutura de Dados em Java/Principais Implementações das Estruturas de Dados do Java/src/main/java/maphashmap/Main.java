package maphashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        //Mostra o grupo das chaves
        System.out.println(aluno.keySet());

        //Mostra os valores
        System.out.println(aluno.values());

        List<Map<String, String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Média", "8.9");
        aluno2.put("Turma", "3b");

        listAlunos.add(aluno2);

        System.out.println(listAlunos);

        System.out.println(aluno.containsKey("Nome"));

    }
}
