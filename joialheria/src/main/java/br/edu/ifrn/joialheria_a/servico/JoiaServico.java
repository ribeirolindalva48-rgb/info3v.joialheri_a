package br.edu.ifrn.joialheria_a.servico;


import br.edu.ifrn.joialheria_a.modelo.*;


public class JoiaServico {


    public void cadastrarJoia(Joia joia) {


        if (!joia.possuiFotos()) {

            throw new IllegalArgumentException(
            "A joia deve possuir fotos em alta resolução."
            );

        }


        System.out.println(
        "Joia cadastrada com sucesso: "
        + joia.getNome()
        );

    }



    public void ativarZoom() {

        System.out.println(
        "Zoom/Lupa ativado na imagem da joia."
        );

    }


}