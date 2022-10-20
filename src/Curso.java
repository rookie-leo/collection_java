import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

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

    public void adiciona(Aula aula) {
        aulas.add(aula);
    }

    public void list() {
        aulas.forEach(aula -> {
            System.out.println(aula);
        });
    }

    public int getTempoTotal() {
      return aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome= '" + nome + '\'' +
                ", instrutor= '" + instrutor + '\'' +
                ", aulas= " + aulas +
                ", tempoTotal= " + getTempoTotal() +
                '}';
    }
}
