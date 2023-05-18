public class Produto{
    private String nome, descricao;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
}