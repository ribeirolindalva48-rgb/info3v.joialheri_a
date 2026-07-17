package br.edu.ifrn.joialheria_a.servico;

import java.util.List;

import br.edu.ifrn.joialheria_a.modelo.Joia;
import br.edu.ifrn.joialheria_a.repositorio.JoiaRepositorio;

/**
 * Classe responsável pelas regras de negócio relacionadas às Joias.
 * Implementa as validações dos requisitos do sistema.
 */
public class JoiaServico {

    private final JoiaRepositorio repositorio = new JoiaRepositorio();

    // Salvar uma nova joia
    public void salvarNovaJoia(Joia joia) {

        if (joia.getNome() == null || joia.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Erro de Regra: O nome da joia é obrigatório.");
        }

        if (joia.getTeorOuro() == null || joia.getTeorOuro().trim().isEmpty()) {
            throw new IllegalArgumentException("Erro de Regra: O teor do ouro é obrigatório.");
        }

        if (joia.getTipoGema() == null || joia.getTipoGema().trim().isEmpty()) {
            throw new IllegalArgumentException("Erro de Regra: O tipo da gema é obrigatório.");
        }

        if (joia.getPeso() <= 0) {
            throw new IllegalArgumentException("Erro de Regra: O peso deve ser
