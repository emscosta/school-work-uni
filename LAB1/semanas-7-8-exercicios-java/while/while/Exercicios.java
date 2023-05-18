public class Exercicios{
    
    public void contador(int x){
        while(x < 300){
            x++;
            System.out.println(x);
        }
    }
    
    public void imprimePares(int x){
        int y = 0;
        while(y < x){
            y++;
            if (y % 2 == 0){
                
                System.out.println(y);    
            }
            else if (x < 0){
                System.out.println("numero negativo, invalido");
            }
        }
    }
    
    public boolean verificaPrimo(int x){
        boolean isPrimo = true;
        int count = 2;
        
        while(count < x){
            if(x % count == 0){
                isPrimo = false;
                System.out.println("n é numero primo");
                break;
            }       
            count++;
        }
        
        if (isPrimo){
          System.out.println("é numero primo");
          return true;
        }
        else
            return false;
}
}