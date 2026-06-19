package br.edu.ifrn;

import java.util.Arrays;

import br.edu.ifrn.joialheria_a.modelo.Joia;
import br.edu.ifrn.joialheria_a.modelo.Personalizacao;

import br.edu.ifrn.joialheria_a.servico.JoiaServico;
import br.edu.ifrn.joialheria_a.servico.PersonalizacaoServico;

public class Main {

    public static void main(String[] args) {

        Joia anel = new Joia(

            "Anel de Ouro 18k",

            Arrays.asList(
                "anel_frente.jpg",
                "anel_lateral.jpg"
            ),

            "Ouro 18k",
            "Diamante",
            5.5

        );

        JoiaServico joiaService = new JoiaServico();

        System.out.println("--- TESTE REQ.001 ---");

        joiaService.cadastrarJoia(anel);
        joiaService.ativarZoom();

        Personalizacao gravacao =
            new Personalizacao(
                "Brunna",
                "Cursiva"
            );

        PersonalizacaoServico personalizacaoService =
            new PersonalizacaoServico();

        System.out.println("\n--- TESTE REQ.002 ---");

        personalizacaoService.validarGravacao(gravacao);

    }
}