package br.edu.ifrn.joialheria_a.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorDeConexao {

    private static final String URL = "jdbc:mysql://localhost:3306/joialheria_db";
    private static final String USER = "root";
    private static final String PASSWORD = "@Emmycami1607";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
