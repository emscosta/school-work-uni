public class Prateleira{
    public Produto produto1, produto2, produto3;
    
    public Prateleira(Produto produto1, Produto produto2, Produto produto3){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }
    
    public Prateleira(){
        
    }
    
    public Produto getProduto1(){
        return produto1;
    }
    
    public Produto getProduto2(){
        return produto2;
    }
    
    public Produto getProduto3(){
        return produto3;
    }
    
    public void setProduto1(Produto produto1){
        this.produto1 = produto1;
    }
    
    public void setProduto2(Produto produto2){
        this.produto2 = produto2;
    }
    
    public void setProduto3(Produto produto3){
        this.produto3 = produto3;
    }
    
    public Produto produtoMaisCaro(){
         if (produto1 == null && produto2 == null && produto3 == null) {
            return null;
        }
        
        Produto maisCaro = produto1;
        if (produto2 !=null && produto2.getPreco() > maisCaro.getPreco() && produto2.getPreco() > produto3.getPreco())
            maisCaro = produto2;
        if (produto3 !=null && produto3.getPreco() > maisCaro.getPreco() && produto3.getPreco() > produto2.getPreco())
            maisCaro = produto3;
        
        return maisCaro;
    }
    
    public String toString(){
        String strProdutos = "";
        if (produto1 != null) {
            strProdutos += produto1.toString() + "\n";
        }
        if (produto2 != null) {
            strProdutos += produto2.toString() + "\n";
        }
        if (produto3 != null) {
            strProdutos += produto3.toString() + "\n";
        }
        return "Prateleira\nProdutos:\n" + strProdutos;
    } 
    
}