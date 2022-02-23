package modelo;
public class Usuario {
    String id;
    String nome;
    String email;
    String senha;
    String confirmar_senha;
    public String getEmail() {
        return email;
    }
    public void setEmail(String cpf) {
        this.email = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String email) {
        this.senha = email;

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getConfirmar() { 
        return confirmar_senha;
    } 
    public void setConfirmar(String telefone) { 
        this.confirmar_senha = telefone;
        
    } 

    
    
}