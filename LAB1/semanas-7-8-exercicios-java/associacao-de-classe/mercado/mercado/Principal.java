public class Principal{
    
    public static void main(String[] args){
        Produto produto1 = new Produto("amaciante", Teclado.leDouble("insira valor do produto:" ), new Data (10,4,2014));
        Produto produto2 = new Produto("creme dental", Teclado.leDouble("insira valor do produto:" ), new Data (5,5,2015));
        Produto produto3 = new Produto("leite condensado", Teclado.leDouble("insira valor do produto:" ), new Data (4,12,2012));
        
        Prateleira prateleira1 = new Prateleira(produto1, produto2, produto3);
        
        Produto cortina = new Produto("cortina", 167.98, new Data(13, 10, 2025));
        Prateleira prateleira2 = new Prateleira();
        prateleira2.setProduto1(cortina);
        
        Mercado mercado1 = new Mercado(prateleira1, prateleira2);
        
        Data dataAtual = new Data(25, 4, 2023);
        
        prateleira1.getProduto1().verificaProdutoVencido (dataAtual);
        prateleira1.getProduto2().verificaProdutoVencido (dataAtual);
        prateleira1.getProduto3().verificaProdutoVencido (dataAtual);
        prateleira2.getProduto1().verificaProdutoVencido (dataAtual);
       
        if ( prateleira1.getProduto1().verificaProdutoVencido (dataAtual) == true)
        System.out.println("Produto vencido" +  prateleira1.getProduto1().getNome());
        if ( prateleira1.getProduto2().verificaProdutoVencido (dataAtual) == true)
        System.out.println("Produto vencido" +  prateleira1.getProduto2().getNome());
        if ( prateleira1.getProduto3().verificaProdutoVencido (dataAtual) == true)
        System.out.println("Produto vencido" +  prateleira1.getProduto3().getNome());
        
        if ( prateleira2.getProduto1().verificaProdutoVencido (dataAtual) == true)
        System.out.println("Produto vencido" +  prateleira2.getProduto1().getNome());
        
        
        mercado1.getPrateleira1().produtoMaisCaro();
        mercado1.getPrateleira2().produtoMaisCaro();
        
        System.out.println("produto mais caro no mercado: " + mercado1.getPrateleira1().produtoMaisCaro());
    
    }
    
}