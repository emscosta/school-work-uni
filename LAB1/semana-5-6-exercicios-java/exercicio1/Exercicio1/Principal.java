public class Principal{
    public static void main (String[] args){
        
        int idLivro = 1;
        Livro livro1 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe a quantidade de páginas do livro "+idLivro+":")
                                 );
        idLivro++;
                                 
        Livro livro2 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe a quantidade de páginas do livro "+idLivro+":")
                                 );
        idLivro++;
        
        Livro livro3 = new Livro(Teclado.leString("Informe o título do livro "+idLivro+":"),
                                 Teclado.leString("Informe o autor do livro "+idLivro+":"),
                                 Teclado.leInt("Informe o ano de publicação do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe o preço do livro "+idLivro+":"),
                                 Teclado.leDouble("Informe a quantidade de páginas do livro "+idLivro+":")
                                 );
        idLivro++;
        
        int idCliente = 1;
        Cliente cliente1 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"));
        idCliente++;
        
        Cliente cliente2 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"));
        idCliente++;
        
        Cliente cliente3 = new Cliente(Teclado.leString("Informe o nome do cliente "+idCliente+":"),
                                 Teclado.leChar("Informe o sexo do cliente "+idCliente+":"),
                                 Teclado.leString("Informe o email do cliente "+idCliente+":"),
                                 Teclado.leString("Informe a senha do cliente "+idCliente+":"),
                                 Teclado.leInt("Informe a idade do cliente "+idCliente+":"));
        
        livro1.calcularPrecoPorPagina();
        livro2.calcularPrecoPorPagina();
        livro3.calcularPrecoPorPagina();
        
        livro1.imprimeInformacoes();
        livro2.imprimeInformacoes();
        livro3.imprimeInformacoes();
        
        cliente1.imprimeInformacoes();
        cliente2.imprimeInformacoes();
        cliente3.imprimeInformacoes();
        
        
       
        
    }
}