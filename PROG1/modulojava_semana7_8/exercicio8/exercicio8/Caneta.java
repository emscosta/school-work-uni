public class Caneta{
    private String marca;
    
    private Cor corCaneta;
    
    public Caneta(String marca, Cor corCaneta){
        this.marca = marca;
        this.corCaneta = corCaneta;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public Cor getCorCaneta(){
        return corCaneta;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCorCaneta(Cor corCaneta){
        this.corCaneta = corCaneta;
    }
}