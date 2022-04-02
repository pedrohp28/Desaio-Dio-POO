
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorias;
import java.time.LocalDate;


public class Main {


    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("descrição curso C#");
        curso2.setCargaHoraria(7);
        
        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("DEscrição mentoria java");
        mentoria.setData(LocalDate.now());
        
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDecricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        System.out.println("Conteudo Inscritos" + devPedro.getConteudosInscritos());
        System.out.println("Conteudo Concluidos" + devPedro.getConteudosConcluidos());
        System.out.println("XP = " + devPedro.calcularTotalXp());
        
        System.out.println("----------------------");
        
        Dev devJorge = new Dev();
        devPedro.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos" + devJorge.getConteudosInscritos());
        devJorge.progredir();
        System.out.println("Conteudo Inscritos" + devJorge.getConteudosInscritos());
        System.out.println("Conteudo Concluidos" + devJorge.getConteudosConcluidos());
        System.out.println("XP = " + devJorge.calcularTotalXp());
        
    }
    
}
