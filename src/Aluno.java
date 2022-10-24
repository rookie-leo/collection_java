import java.util.Objects;

public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode estar vazio!");//TODO - acredito que essa validação tenha que ser feita em um service, ou no momento antes de intanciar o objeto
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.nome) && this.matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }
}
