package br.edu.ifrn;

import br.edu.ifrn.joialheria_a.modelo.Joia;
import br.edu.ifrn.joialheria_a.servico.JoiaServico;

public class Main {

    public static void main(String[] args) {

        JoiaServico joiaService = new JoiaServico();

        System.out.println("\n--- [C] - INSERINDO Joias no MySQL ---");

        Joia joia1 = new Joia(
                "Anel Solitário",
                "Ouro 18k",
                "Diamante",
                3.5
        );

        Joia joia2 = new Joia(
                "Colar Luxo",
                "Ouro Branco 18k",
                "Esmeralda",
                6.2
        );

        joiaService.salvarNovaJoia(joia1);
        joiaService.salvarNovaJoia(joia2);

        System.out.println("\n--- [R] - LISTANDO AS JOIAS ---");
        joiaService.listarJoias().forEach(System.out::println);

        System.out.println("\n--- [U] - ATUALIZANDO UMA JOIA ---");

        joia2.setPeso(7.0);

        joiaService.atualizarJoia(joia2);

        joiaService.listarJoias().forEach(System.out::println);

        System.out.println("\n--- [D] - EXCLUINDO UMA JOIA ---");

        joiaService.removerJoia(joia1.getId());

        System.out.println("\nEstado final da tabela:");

        joiaService.listarJoias().forEach(System.out::println);

    }

}
``
