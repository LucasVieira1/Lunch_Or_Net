package dao;

import factory.ConnectionFactory;
import modelo.Produto;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    private Connection connection;
    String id;
    String produto;
    String descricao;
    String preçocusto;
    String preçovenda;
    String categoria;
    String tipo;
    String quantidade; 
    String precoatt;

    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    
            
    public void adiciona(Produto produto) {
        String sql = "INSERT INTO cprodutos(produto, descricao, preçocusto, preçovenda, categoria, tipo ) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getProduto());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3, produto.getPreçocusto());
            stmt.setString(4, produto.getPreçovenda());
            stmt.setString(5, produto.getCategoria());
            stmt.setString(6, produto.getTipo());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public void delete(Produto produto) {
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sql = "delete from cprodutos where produto = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getProduto());
            stmt.execute();
            stmt.close();
            connection.close();
            JOptionPane.showMessageDialog(null, "' " + produto.getProduto() + " '" + " excluído com sucesso!");

        } catch (SQLException e1) {

            // TODO Auto-generated catch block
            e1.printStackTrace();

        }
    }

    public void select(Produto produto) {
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sql = "select * from cprodutos where produto = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getProduto());
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                produto.setId(rs.getString("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreçocusto(rs.getString("preçocusto"));
                produto.setPreçovenda(rs.getString("preçovenda"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setTipo(rs.getString("tipo"));

            }
            rs.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void update(Produto produto) {
        try {

            Connection connection = new ConnectionFactory().getConnection();
            String sql = "update cprodutos set descricao=?, preçocusto=?, preçovenda=?, categoria=?, tipo = ? where produto = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setString(2, produto.getPreçocusto());
            stmt.setString(3, produto.getPreçovenda());
            stmt.setString(4, produto.getCategoria());
            stmt.setString(5, produto.getTipo());
            stmt.setString(6, produto.getProduto());

            stmt.execute();
            stmt.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "' " + produto.getProduto() + " '" + " Atualizado com sucesso!");

            stmt.close();
            connection.close();

            //limpa os campos
        } catch (SQLException e1) {

            e1.printStackTrace();

        }
        
    }

   
}
