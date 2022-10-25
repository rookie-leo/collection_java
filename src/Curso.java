import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula) {
        aulas.add(aula);
    }

    public void listaAulas() {
        aulas.forEach(aula -> {
            System.out.println(aula);
        });
    }

    public int getTempoTotal() {
      return aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno aluno) {
        alunos.add(aluno);
        matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public void listaAlunos() {
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome= '" + nome + '\'' +
                ", instrutor= '" + instrutor + '\'' +
                ", aulas= " + aulas +
                ", tempoTotal= " + getTempoTotal() +
                ", alunos= '" + getAlunos() + '\'' +
                '}';
    }

    public Aluno buscaAlunoPorMatricula(int matricula) {
        return matriculaParaAluno.get(matricula);
    }
}
