public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public String toString(){
        return "Nome: " + nome + "\nPreço: " + preco + "\nData de validade: " + dataValidade.toString();    
    }
    
     public boolean verificaProdutoVencido(Data dataAtual) {
        if (dataAtual.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() > dataValidade.getMes()) {
            return true;
        } else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() == dataValidade.getMes() && dataAtual.getDia() > dataValidade.getDia()) {
            return true;
        } else {
            return false;
        }
    }

}