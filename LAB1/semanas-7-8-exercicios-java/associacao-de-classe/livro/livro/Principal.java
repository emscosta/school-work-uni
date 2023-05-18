public class Principal{
    
    public static void main(String[] args){
        
        Livro livro1 = new Livro("foi-se o tempo", "augusto", 1982, 300, 45.30);
        Livro livro2 = new Livro("foi-se ", "augus", 1992, 200, 32.30);
        Livro livro3 = new Livro("Amarelo", "roberta", 1870, 600, 50.20);
        
        Cliente cliente1 = new Cliente(Teclado.leString("Insira seu nome: "), Teclado.leString("insira seu email: "),
                            Teclado.leString("insira sua senha: " ), Teclado.leChar("insira seu genero: "),
                            Teclado.leInt("insira sua idade: "), livro1);
                            
      /*  Cliente cliente2 = new Cliente(Teclado.leString("Insira seu nome: "), Teclado.leString("insira seu email: "),
                            Teclado.leString("insira sua senha: " ), Teclado.leChar("insira seu genero: "),
                            Teclado.leInt("insira sua idade: "), livro2);                    
             
        Cliente cliente3 = new Cliente(Teclado.leString("Insira seu nome: "), Teclado.leString("insira seu email: "),
                            Teclado.leString("insira sua senha: " ), Teclado.leChar("insira seu genero: "),
                            Teclado.leInt("insira sua idade: "), livro3);*/
                            
        //System.out.println("Cliente: " + cliente1.getNome(), "está com o livro: " + livro1.getTitulo(),
                        //"e o preço por página deste livro é: " + livro1.calcularPrecoPorPagina());
        System.out.println (livro1.toString());
        //livro1.toString();
        
        System.out.println(cliente1.toString());
        //cliente2.toString();
        //cliente3.toString();
    }
}