public class Main{
    public static void main(String[] args){
        Cor corEstojo1 = new Cor(Teclado.leInt("R: "), Teclado.leInt("G: "), 
        Teclado.leInt("B: "));
        
        Cor corCaneta1 = new Cor(Teclado.leInt("R: "), Teclado.leInt("G: "), 
        Teclado.leInt("B: "));
        
        Caneta caneta1 = new Caneta(Teclado.leString("Marca caneta 1: "),
        corCaneta1);
        
        Cor corCaneta2 = new Cor(Teclado.leInt("R: "), Teclado.leInt("G: "), 
        Teclado.leInt("B: "));
        
        Caneta caneta2 = new Caneta(Teclado.leString("Marca caneta 2: "),
        corCaneta2);
        
        Estojo estojo1 = new Estojo(corEstojo1, caneta1, caneta2);
    }
}