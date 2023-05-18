public class Estojo{
    private Cor corEstojo;
    
    private Caneta caneta1;
    private Caneta caneta2;
    
    public Estojo(Cor corEstojo, Caneta caneta1, Caneta caneta2){
         this.corEstojo = corEstojo;
         this.caneta1 = caneta1;
         this.caneta2 = caneta2;
 }
 
     public void setCorEstojo(Cor corEstojo){
         this.corEstojo = corEstojo;
     }

     public Cor getCorEstojo(){
         return corEstojo;
     }
    
     public void setCaneta1(Caneta caneta1){
         this.caneta1 = caneta1;
     }
    
     public Caneta getCaneta1(){
         return caneta1;
     }
    
     public void setCaneta2(Caneta caneta2){
         this.caneta2 = caneta2;
     }
    
     public Caneta getCaneta2(){
         return caneta2;
     }

}