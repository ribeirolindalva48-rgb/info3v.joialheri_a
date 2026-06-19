package br.edu.ifrn.joialheria_a.modelo;


public class Personalizacao {


    private String textoGravacao;
    private String tipoFonte;


    public Personalizacao(
            String textoGravacao,
            String tipoFonte) {


        this.textoGravacao = textoGravacao;
        this.tipoFonte = tipoFonte;

    }



    public int tamanhoTexto() {

        return textoGravacao.length();

    }



    public String getTipoFonte() {

        return tipoFonte;

    }



    public String getTextoGravacao() {

        return textoGravacao;

    }

}
