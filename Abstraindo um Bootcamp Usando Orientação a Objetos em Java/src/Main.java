import desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("decrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("decrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso Básico de Java e Spring Boot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo Ricardo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXP());

        System.out.println("-------------------------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());






    }
}
