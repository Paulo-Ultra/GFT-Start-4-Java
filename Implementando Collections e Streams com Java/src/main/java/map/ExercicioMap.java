package map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {

        HashMap<String, String> estados = new HashMap<>();

        estados.put("SE", "Sergipe");
        estados.put("AC", "Acre");
        estados.put("PA", "Pará");
        estados.put("MG", "Minas Gerais");
        estados.put("RR", "Roraima");
        estados.put("RR", "Roraima");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MT", "Mato Grosso");
        estados.put("PR", "Paraná");
        estados.put("SC", "Santa Catarina");
        estados.put("CE", "Ceará");
        estados.put("GO", "Goiás");
        estados.put("PB", "Paraíba");
        estados.put("AP", "Amapá");
        estados.put("AL", "Alagoas");
        estados.put("AM", "Amazonas");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("TO", "Tocantins");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("PE", "Pernambuco");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("BA", "Bahia");
        estados.put("MA", "Maranhão");
        estados.put("SP", "São Paulo");
        estados.put("PI", "Piauí");
        estados.put("ES", "Espírito Santo");

        System.out.println(estados);

        estados.remove("MG");
        estados.put("DF", "Distrito Federal");

        System.out.println(estados);

        System.out.println(estados.size());

        estados.remove("MS", "Mato Grosso do Sul");

        System.out.println(estados);

        for(Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + "---> " + entry.getKey());
        }

        System.out.println(estados.containsKey("SC"));

        System.out.println(estados.containsValue("Maranhão"));
    }
}
