import components.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Configurando o material que sera usado (Cursos e Mentorias)
        Curso javaPoo = new Curso("Java e Programação Orientada a Objetos", "Curso básico sobre conceitos de Programação Orientada a Objetos com java", 10);
        Curso javaRestApi = new Curso("REST API com Spring Boot", "Curso voltado para a criação e o deploy de APIs RESTful com Spring Boot", 12);
        Mentoria ideIntellij = new Mentoria("Entendendo a IDE IntelliJ", "Extraindo o potêncial maximo do ambiente de desenvolvimento Java da JetBrains, o IntelliJ.", LocalDate.now());

        // Configurando o Bootcamp - Dev do Futuro
        Set<Conteudo> cursos = new LinkedHashSet<>(Arrays.asList(ideIntellij, javaPoo, javaRestApi));
        Bootcamp futuroDev = new Bootcamp("Java-i Codando", "Aprendendo as stacks mais atualizadas do Java!", cursos);

        // Criando dois novos Devs
        Dev lucas = new Dev("Lucas Palhano");
        Dev ada = new Dev("Ada Lovelace");

        // inscrevendo os Dev no Bootcamp
        ada.inscreverBootcamp(futuroDev);
        lucas.inscreverBootcamp(futuroDev);

        // Devs estudando o material do Bootcamp
        ada.progredir();
        ada.progredir();
        lucas.progredir();

        System.out.println(ada);
        System.out.println("XP: " + ada.calcularTotalXp());
        System.out.println("-----------------------------");
        System.out.println(lucas);
        System.out.println("XP: " + lucas.calcularTotalXp());


    }
}