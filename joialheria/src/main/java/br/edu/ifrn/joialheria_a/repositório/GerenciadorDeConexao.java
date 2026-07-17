
package br.edu.ifrn.joialheria_a.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável pela conexão com o banco de dados MySQL.
 */
public class GerenciadorDeConexao {

    // URL do banco de dados da Joalheria
    private static final String URL =
            "jdbc:mysql://localhost:3306/joialheria_db?useTimezone=true&serverTimezone=UTC";

    // Altere para o usuário do seu MySQL
    private static final String USER = "root";

    // Altere para a senha do seu MySQL
    private static final String PASSWORD = "root";

    /**
     * Retorna uma conexão ativa com o banco de dados.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
