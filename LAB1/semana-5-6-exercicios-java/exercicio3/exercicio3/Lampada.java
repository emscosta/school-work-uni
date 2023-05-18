public class Lampada{
    private boolean ligada = true;
    
    public Lampada(boolean ligada){
        this.ligada = ligada;
    }
    
    public boolean getLigada(){
        return ligada;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
}