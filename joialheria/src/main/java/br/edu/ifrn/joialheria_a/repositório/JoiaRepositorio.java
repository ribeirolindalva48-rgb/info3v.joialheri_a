package br.edu.ifrn.joialheria_a.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifrn.joialheria_a.modelo.Joia;

public class JoiaRepositorio {

    private Connection getConnection() throws SQLException {
        return GerenciadorDeConexao.getConnection();
    }

    // [C] - INSERIR (INSERT)
    public void inserir(Joia joia) {
        String sql = "INSERT INTO joia (nome, teor_ouro, tipo_gema, peso) VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, joia.getNome());
            stmt.setString(2, joia.getTeorOuro());
            stmt.setString(3, joia.getTipoGema());
            stmt.setDouble(4, joia.getPeso());

            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    joia.setId(generatedKeys.getLong(1));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no MySQL", e);
        }
    }

    // [R] - LISTAR (SELECT)
    public List<Joia> selecionarTodas() {

        List<Joia> joias = new ArrayList<>();

        String sql = "SELECT * FROM joia";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Joia joia = new Joia();

                joia.setId(rs.getLong("id"));
                joia.setNome(rs.getString("nome"));
                joia.setTeorOuro(rs.getString("teor_ouro"));
                joia.setTipoGema(rs.getString("tipo_gema"));
                joia.setPeso(rs.getDouble("peso"));

                joias.add(joia);

            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao selecionar dados do MySQL", e);
        }

        return joias;
    }

    // [U] - ATUALIZAR (UPDATE)
    public void atualizar(Joia joia) {

        String sql = "UPDATE joia SET nome = ?, teor_ouro = ?, tipo_gema = ?, peso = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, joia.getNome());
            stmt.setString(2, joia.getTeorOuro());
            stmt.setString(3, joia.getTipoGema());
            stmt.setDouble(4, joia.getPeso());
            stmt.setLong(5, joia.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no MySQL", e);
        }

    }

    // [D] - EXCLUIR (DELETE)
    public void excluir(Long id) {

        String sql = "DELETE FROM joia WHERE id = ?
