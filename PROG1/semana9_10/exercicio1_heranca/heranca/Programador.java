public class Programador extends Pessoa{
    private String faveLang;
    
    public Programador(String nome, int idade, String faveLang){
        super(nome, idade);
        this.faveLang = faveLang;
    }
    
    public String getFaveLang(){
        return faveLang;
    }
    
    public void setFaveLang(String faveLang){
        this.faveLang = faveLang;
    }
    
     public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Linguagem favorita: "+faveLang);
    }
}