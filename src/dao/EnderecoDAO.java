package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Endereco;

public class EnderecoDAO {
    private Connection connection;
    String id;
    String usuario;
    String nome;
    String cep;
    String enrececo;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
     public EnderecoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
     public void adiciona(Endereco endereco) {
        String sql = "INSERT INTO endereco(usuario, nome, cep, endereco, numero, complemento, bairro, cidade, uf ) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, endereco.getUsuario());
            stmt.setString(2, endereco.getNome());
            stmt.setString(3, endereco.getCep());
            stmt.setString(4, endereco.getEnrececo());
            stmt.setString(5, endereco.getNumero());
            stmt.setString(6, endereco.getComplemento());
            stmt.setString(7, endereco.getBairro());
            stmt.setString(8, endereco.getCidade());
            stmt.setString(9, endereco.getUf());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
}
