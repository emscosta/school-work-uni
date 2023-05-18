public class Livro{
    private String titulo, autor;
    private int ano, quantidadePaginas;
    private double preco;
    
    public Livro(String titulo, String autor, int ano, int quantidadePaginas, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantidadePaginas = quantidadePaginas;
        this.preco = preco;
    }
    
    public Livro(){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantidadePaginas = quantidadePaginas;
        this.preco = preco;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAno(){
        return ano;
    }
    
    public int getQuantidadePaginas(){
        return quantidadePaginas;
    }
    
    public double getpreco(){
        return preco;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
     public void setAno(int ano){
        this.ano = ano;
    }
    
     public void setQuantidadePaginas(int quantidadePaginas){
        this.quantidadePaginas = quantidadePaginas;
    }
    
     public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double calcularPrecoPorPagina(){
        preco = quantidadePaginas / preco;
        return preco;
    }
    
    @Override
    
     public String toString(){
        return String.format(
            "Livro [Título = %s, Autor = %s, Publicação = %d, Preco = R$%.2f, Páginas = %d, Preço por Página = R$%.2f]",
            this.titulo, this.autor, this.ano, this.preco, this.quantidadePaginas, this.calcularPrecoPorPagina());
    }
}