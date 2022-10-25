import java.util.*;

public class TestandoCursoEAluno {

    public static void main(String[] args) {
        Curso colecoes = new Curso("Java Efetivo", "Joshua Bloch");
        List<Aula> aulas = colecoes.getAulas();
        System.out.println(aulas);

//        colecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 25));

        System.out.println(colecoes.getAulas());

        colecoes.adiciona(new Aula("Trabalhando com listas", 20));
        colecoes.adiciona(new Aula("Criando uma Aula", 15));
        colecoes.adiciona(new Aula("Modelando com coleções", 23));

        colecoes.listaAulas();

        List<Aula> aulasImutaveis = colecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println("Tempo total de aulas " + colecoes.getTempoTotal());

        System.out.println(colecoes);

        Aluno a1 = new Aluno("Kratos de Esparta", 12345);
        Aluno a2 = new Aluno("Jin Sakai", 01656);
        Aluno a3 = new Aluno("Lara Croft", 987654);
        Set<Aluno> alunos = new HashSet<>();

        colecoes.matricula(a1);
        colecoes.matricula(a2);
        colecoes.matricula(a3);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        colecoes.listaAlunos();

        Iterator<Aluno> iterator = colecoes.getAlunos().iterator();

        System.out.println("Iterator");

        while(iterator.hasNext()) {
            Aluno aluno = iterator.next();
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println("Aluno: " + aluno);
        });

        a1 = new Aluno("Desmond", 12345);
        a2 = new Aluno("Desmond", 54321);

        System.out.println(a1.equals(a2));
    }

}
