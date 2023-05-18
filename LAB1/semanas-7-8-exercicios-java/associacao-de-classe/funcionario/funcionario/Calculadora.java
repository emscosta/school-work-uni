public class Calculadora{
    private int memoria;
    private String cor;
    
    public Calculadora(String cor){
        memoria = 0;
        this.cor = cor;
    }
    
    public int getMemoria(){
        return memoria;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public double soma(double valor1, double valor2){
        double soma = valor1 + valor2;
        return soma;
    }
    
    public double subtrai(double valor1, double valor2){
        double subtracao = valor1 - valor2;
        return subtracao;
    }
    
    public double multiplica(double v1, double v2){
        double multiplica = v1 * v2;
        return multiplica;
    }
    
    public double divide(double v1, double v2){
        double divide = v1 / v2;
        return divide;
    }
    
    public int elevaAoQuadrado(int v1){
        return (int)(Math.pow(v1, 2));
    }
    
    public int elevaAoCubo(int v1){
        return (int)(Math.pow(v1, 3));  
    }
    
    public void imprimeInfo(){
        System.out.println("Memória: " + memoria);
        System.out.println("Cor: " + cor);
    }
}