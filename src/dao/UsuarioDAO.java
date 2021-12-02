package dao;

import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection connection;
    String id;
    String nome;
    String email;
    String senha;
    String confmar_senha;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void insert(Usuario usuario) {
        String sql = "INSERT INTO cadastro(usuario,email,senha,confirmar_senha) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getConfirmar());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public void delete(Usuario usuario) {
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sql = "delete from cadastro where usuario = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.execute();
            stmt.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "' " + usuario.getNome() + " '" + " excluído com sucesso!");

        } catch (SQLException e1) {

            // TODO Auto-generated catch block
            e1.printStackTrace();

        }
    }

    public void select(Usuario usuario) {
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sql = "select * from cadastro where usuario = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                usuario.setId(rs.getString("id"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setConfirmar(rs.getString("confirmar_senha"));

            }
            rs.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public void update(Usuario usuario) {
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sql = "update cadastro set email=?, senha=?, confirmar_senha=? where usuario=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getConfirmar());
            stmt.setString(4, usuario.getNome());

            stmt.execute();
            stmt.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "' " + usuario.getNome() + " '" + " Atualizado com sucesso!");

            stmt.close();
            connection.close();

            //limpa os campos
        } catch (SQLException e1) {

            e1.printStackTrace();

        }
    }

}

//Neste pacote ficam as classes que são responsáveis pelo CRUD (Create, Retrieve, 
//Update, Delete - ou - Criar, Consultar, Alterar, Deletar
