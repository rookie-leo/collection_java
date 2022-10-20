import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoCurso {

    public static void main(String[] args) {
        Curso colecoes = new Curso("Java Efetivo", "Joshua Bloch");
        List<Aula> aulas = colecoes.getAulas();
        System.out.println(aulas);

//        colecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 25));

        System.out.println(colecoes.getAulas());

        colecoes.adiciona(new Aula("Trabalhando com listas", 20));
        colecoes.adiciona(new Aula("Criando uma Aula", 15));
        colecoes.adiciona(new Aula("Modelando com coleções", 23));

        colecoes.list();

        List<Aula> aulasImutaveis = colecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println("Tempo total de aulas " + colecoes.getTempoTotal());

        System.out.println(colecoes);
    }

}
