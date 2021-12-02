package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cartao;


public class CartaoDAO {
   private Connection connection;
   String id;
   String bandeira;
   String usuario;
   String nome;
   String numero;
   String validade;
   String cvv; 
   public CartaoDAO() {
       this.connection = new ConnectionFactory().getConnection();
    }
         public void adiciona(Cartao cartao) {
        String sql = "INSERT INTO cartao(bandeira, usuario, nome, numero, validade, cvv) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cartao.getBandeira());
            stmt.setString(2, cartao.getUsuario());
            stmt.setString(3, cartao.getNome());
            stmt.setString(4, cartao.getNumero());
            stmt.setString(5, cartao.getValidade());
            stmt.setString(6, cartao.getCvv());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }
}
