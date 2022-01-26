import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C++");
        curso2.setDescricao("Descrição Curso C++");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosIncritos());

        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Pedro:" + devPedro.getConteudosConcluido());
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosIncritos());
        System.out.println("XP :" + devPedro.calcularTotalXp());

        System.out.println("===============================");

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosIncritos());

        devJulia.progredir();
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Julia:" + devJulia.getConteudosConcluido());
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosIncritos());
        System.out.println("XP :" + devJulia.calcularTotalXp());
    }
}
