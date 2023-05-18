public class Livro{
    private String titulo;
    private String autor;
    private int ano;
    private double preco;
    private double paginas;
    
    public Livro(String titulo,String autor, int ano, double preco,double paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
        this.paginas = paginas;
    }
        
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPaginas(){
        return paginas;
    }
    
    public void setPaginas(double paginas){
        this.paginas = paginas;
    }
    
    public double calcularPrecoPorPagina(){
        this.paginas = paginas;
        return preco / paginas;
        
    }
    
    public void imprimeInformacoes(){
      System.out.println("Título: "+titulo);
      System.out.println("Autor: "+autor);
      System.out.println("Ano: "+ano);
      System.out.println("Preço: "+ preco);
      System.out.println("Páginas: " + paginas);
      System.out.println("Preço por páginas: " + calcularPrecoPorPagina());
   }

}

