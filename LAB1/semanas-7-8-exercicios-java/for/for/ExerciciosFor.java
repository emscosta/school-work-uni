public class ExerciciosFor{
    
    public void inserirPessoas(int x){
        int b = x;
        int y = 0;
        for (x = b; y < x; y++){
            System.out.println(Teclado.leString("digite nome da pessoa: "));
        }
    }
    
    public void contador(int x){
        int b = x;
        int y = 0;
        for(x = b; y < x; y++){
            System.out.println(x);
        }
    }
    
    public void imprimePar(int x){
        int b = x;
        int y = 0;
        for(x = b; y < x; y++){
            if (y % 2 == 0){
                System.out.println(x);
            }
            if (x < 0){
                System.out.println("erro, valor negativo.");
            }
        }
    }
    
    public void imprimeNumDecre(int x){
        int b = x;
        for(x = b; x > 0; x--){
            System.out.println(x);
            if (x < 0){
                System.out.println("erro, valor negativo.");
            }
        }
    }
    
     public void inserirTime(int x){
        int b = x;
        int gremio = 0;
        int other = 0;
        int y = 0;
        for (x = b; y < x; y++){
            String time = (Teclado.leString("sigite seu time: "));
            
            if(time == "gremio"){
                gremio++;
            }
            else
            other++;
        }
        System.out.println("quantidade de torcedores gremistas: "+ gremio);
    }
    
    public double somaPontoFlutuante(int x){
        int y = 0;
        double soma = 0;
        double num = 0;
        for(x = 0 ; y < x; y++){
            num = Teclado.leInt("insira um numero");
            soma += num;
        }
        return soma;
    }
    
    public void somaNumeros(){
        int soma = 0;
        int num = 0;
        int x = 0;
        for(x = 10 ; x > 0; x--){
            num = Teclado.leInt("insira um numero inteiro: ");
            soma += num;
        }
        System.out.println(soma);
    }
    
    public void numInteiro(){
        int y = 0;
        int num = 0;
        int quant;
        int quantTexto = Teclado.leInt("insira um numero inteiro: ");
        for(quant = quantTexto ; quant > y; y++){
            num = Teclado.leInt("insira um numero inteiro: ");
            if(num > 0){
                System.out.println("este numero é psotivo");
            }
            else if(num < 0){
                System.out.println("este numero é negativo");
            }
            else
             System.out.println("zero");
        }
        
    }
    
    public void exercicio9(int val1, int val2){
        
        for(;val1 > val2;){
            val1--;
            System.out.println(val1);
        }
        for(;val2> val1;){
            val2--;
            System.out.println(val2);
        }
        
    }
    
    public void exercicio10(){
        int soma = 0;
        int x = 0;
        for(x = 0; x < 198; x++){
            soma += x;
        }
    }
    
    public int exercicio11(int val1, int val2){
        int count = 0;
        int soma = 0;
        for(;val1 < val2;val1++){
            count = val1;
            count++;
            if(count % 2 != 0){
                soma += count;
            }
        }
        
        for(;val2 < val1; val2++){
            count = val2;
            count++;
            if(count % 2 != 0){
                soma += count;
            }
        }
        System.out.println(soma);
        return soma;
    }
    
    public double exercicio12(){
        double val = 0;
        int count = 0;
        double soma = 0;
        double media = 0;
        for(;;){
            val = Teclado.leInt("insira um numero inteiro: ");
            count++;
            soma += val;
            if (val < 0){
                media = soma /= count;
                break;
            }
        }
        System.out.println(media);
        return media;
    }
    
    public void exercicio5( 
}
