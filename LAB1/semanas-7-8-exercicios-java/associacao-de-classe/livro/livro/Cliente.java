public class Cliente{
    private String nome, email, senha;
    private char sexo;
    private int idade;
    private Livro livro;
    
    public Cliente(String nome, String email, String senha, char sexo, int idade, Livro livro){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.livro = livro;
        this.idade = idade;
    }
    
     public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.livro = livro;
    }
    
     public Cliente(){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.livro = livro;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public Livro getLivro(){
        return livro;
    }
    
     public int getIdade(){
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
    
    public void setAutor(char sexo){
        this.sexo = sexo;
    }
    
    public void setLivro(Livro livro){
        this.livro = livro;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
  /*  public void imprimeInformacoes(){
        System.out.println(nome);
        System.out.println(email);
        System.out.println(senha);
        System.out.println(sexo);
        System.out.println(livro);
    }*/
    
    
@Override
    public String toString()
    {
        String strLivro;
        if (this.livro == null)
            strLivro = "Indefinido";
        else
            strLivro = this.livro.toString();
        
        return String.format(
            "Cliente [Nome = %s, Idade = %d, Sexo = %c, Email = %s, Senha = %s, Livro = %s]",
            this.nome, this.idade, this.sexo, this.email, this.senha, strLivro);
    }
    
    public void imprimeInformacoes()
    {
        System.out.println(this);
    }
    
}