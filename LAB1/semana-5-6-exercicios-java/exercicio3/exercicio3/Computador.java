public class Computador{
    private String marca;
    private double velocidade;
    private int ano;
    private char novo;
    
    public Computador(String marca, double velocidade, int ano, char novo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.ano = ano;
        this.novo = novo;
    }
    
    
     public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setVel(double velocidade){
        this.velocidade = velocidade;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setNovo(char novo){
        this.novo = novo;
    }
    
    public String getMarca(){
        return marca;
    }
    
     public double getVel(){
        return velocidade;
    }
    
     public int getAno(){
        return ano;
    }
    
     public char getNovo(){
        return novo;
    }
}