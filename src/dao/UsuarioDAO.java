package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
public class UsuarioDAO { 
    private Connection connection;
    Long id;
    String nome;
    String email;
    String senha;
    String confmar_senha;
    public UsuarioDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO cadastro(usuario,email,senha,confirmar_senha) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getConfirmar());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}

//Neste pacote ficam as classes que são responsáveis pelo CRUD (Create, Retrieve, 
//Update, Delete - ou - Criar, Consultar, Alterar, Deletar