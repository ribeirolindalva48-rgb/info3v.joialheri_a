package br.edu.ifrn.joialheria_a.servico;

import br.edu.ifrn.joialheria_a.modelo.Personalizacao;

public class PersonalizacaoServico {

    public void validarGravacao(
            Personalizacao personalizacao) {

        if (personalizacao.tamanhoTexto() > 20) {

            throw new IllegalArgumentException(
                    "A gravação ultrapassa o limite permitido.");
        }

        if (!personalizacao.getTipoFonte().equals("Cursiva")
                && !personalizacao.getTipoFonte().equals("Bastao")) {

            throw new IllegalArgumentException(
                    "Escolha uma fonte válida.");
        }

        System.out.println(
                "Gravação personalizada aprovada!");
    }
}