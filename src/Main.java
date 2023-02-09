import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs devCamila = new Devs();
        devCamila.setNome("Camila");
        devCamila.inscreverBottcamp(bootcamp);
        System.out.println("Conteudos inscritos de Camila " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos inscritos de Camila " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP de Camila " + devCamila.calcularTotalXp());


        Devs devJoao = new Devs();
        devJoao.setNome("João");
        devJoao.inscreverBottcamp(bootcamp);
        System.out.println("Conteudos inscritos de João " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("Conteudos inscritos de João " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos de João " + devJoao.getConteudosConcluidos());
        System.out.println("XP de João: " + devJoao.calcularTotalXp());

    }
}