public class Cliente{
    private String nome;
    private char sexo;
    private String email;
    private String senha;
    private int idade;
    
    public Cliente(String nome, char sexo, String email, String senha, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        
    }
    
    public String getNome(String nome){
        return nome;
    }
    
    public String getEmail(String email){
        return email;
    }
    
    public String getSenha(String senha){
        return senha;
    }
    
    public char getSexo(char sexo){
        return sexo;
    }
    
    public int getIdade(int idade){
        return idade;
    }
    
     public void setNome(String nome){
        this.nome = nome;
    }
    
     public void setEmail(String email){
        this.email = email;
    }
    
     public void setSenha(String senha){
        this.senha = senha;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Email: "+email);
        System.out.println("Senha: "+senha);
    }
}
