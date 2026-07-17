package br.edu.ifrn.joialheria_a.modelo;

/**
 * Entidade que representa uma Joia.
 * Mapeia diretamente os dados da tabela do MySQL.
 */
public class Joia {

    private Long id; // Chave primária do MySQL
    private String nome;
    private String teorOuro;
    private String tipoGema;
    private double peso;

    // Construtor vazio
    public Joia() {
    }

    // Construtor completo
    public Joia(String nome, String teorOuro, String tipoGema, double peso) {
        this.nome = nome;
        this.teorOuro = teorOuro;
        this.tipoGema = tipoGema;
        this.peso = peso;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTeorOuro() {
        return teorOuro;
    }

    public void setTeorOuro(String teorOuro) {
        this.teorOuro = teorOuro;
    }

    public String getTipoGema() {
        return tipoGema;
    }

    public void setTipoGema(String tipoGema) {
        this.tipoGema = tipoGema;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Joia{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", teorOuro='" + teorOuro + '\'' +
                ", tipoGema='" + tipoGema + '\'' +
                ", peso=" + peso +
                '}';
    }
}
