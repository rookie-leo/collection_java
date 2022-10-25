public class TestaBuscaAlunoNoCurso {

    public static void main(String[] args) {
        Curso colecoes = new Curso("Java Efetivo", "Joshua Bloch");
        colecoes.adiciona(new Aula("Trabalhando com listas", 20));
        colecoes.adiciona(new Aula("Criando uma Aula", 15));
        colecoes.adiciona(new Aula("Modelando com coleções", 23));

        colecoes.listaAulas();

        Aluno a1 = new Aluno("Kratos de Esparta", 12345);
        Aluno a2 = new Aluno("Jin Sakai", 01656);
        Aluno a3 = new Aluno("Lara Croft", 987654);

        colecoes.matricula(a1);
        colecoes.matricula(a2);
        colecoes.matricula(a3);

        int matricula = 12345;
        Aluno aluno = colecoes.buscaAlunoPorMatricula(matricula);
        System.out.println("O aluno matricula = " + matricula + " é o aluno " + aluno);
    }

}
