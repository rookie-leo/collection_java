import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando as ArraysList", 21);
        Aula a2 = new Aula("Lista de Objetos", 25);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        aulas.forEach(aula -> {
            System.out.println(aula);
        });
        System.out.println();
        System.out.println("************* Ordenando as aulas pelo titulo *************");
        Collections.sort(aulas);

        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println();
        System.out.println("************* Ordenando as aulas pelo tempo *************");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });
    }

}
