public class Produto{
    private String nome, descricao;
    private int qntEstoque;
    private double preco;
    
    public Produto(String nome, int qntEstoque, double preco){
        this.nome = nome;
        this.preco = preco;
        this.qntEstoque = qntEstoque;
    }
}