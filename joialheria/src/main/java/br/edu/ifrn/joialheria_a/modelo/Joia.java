package br.edu.ifrn.joialheria_a.modelo;

import java.util.List;

public class Joia {

    private String nome;
    private List<String> fotos;
    private String teorOuro;
    private String tipoGema;
    private double peso;


    public Joia(String nome, List<String> fotos,
                String teorOuro,
                String tipoGema,
                double peso) {

        this.nome = nome;
        this.fotos = fotos;
        this.teorOuro = teorOuro;
        this.tipoGema = tipoGema;
        this.peso = peso;
    }


    public boolean possuiFotos() {

        return fotos != null && !fotos.isEmpty();

    }


    public String getNome() {
        return nome;
    }


    public double getPeso() {
        return peso;
    }


    public String getTeorOuro() {
        return teorOuro;
    }


    public String getTipoGema() {
        return tipoGema;
    }

}