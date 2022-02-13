package com.projeto.no;

public class Main {
    public static void main(String[] args) {

        No no1 = new No("Conteudo no1");

        No no2 = new No("Conteudo no2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo no4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->NULL

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println("------------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


        NoGenerico<String> noGenerico1 = new NoGenerico<>("Conteudo noGenerico1");

        NoGenerico<String> noGenerico2 = new NoGenerico<>("Conteudo noGenerico2");
        noGenerico1.setProximoNo(noGenerico2);

        NoGenerico<String> noGenerico3 = new NoGenerico<>("Conteudo noGenerico3");
        noGenerico2.setProximoNo(noGenerico3);

        NoGenerico<String> noGenerico4 = new NoGenerico<>("Conteudo noGenerico4");
        noGenerico3.setProximoNo(noGenerico4);

        System.out.println(noGenerico1);
        System.out.println(noGenerico1.getProximoNo());
        System.out.println(noGenerico2);
        System.out.println("------------------------------");
        System.out.println(noGenerico1);
        System.out.println(noGenerico1.getProximoNo());
        System.out.println(noGenerico1.getProximoNo().getProximoNo());
        System.out.println(noGenerico1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(noGenerico1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }

}
