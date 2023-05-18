public class Aluno{
    private String nome;
    private String matricula;
    private double grauA;
    private double grauB;
    
    public Aluno(String nome, String matricula, double grauA, double grauB){
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public double getGraua(){
        return grauA;
    }
    
    public double getGraub(){
        return grauB;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setGraua(double grauA){
        this.grauA = grauA;
    }
    
    public void setGraub(double grauB){
        this.grauB = grauB;
    }
    
    public double calculaMediaFinal(){
        this.grauA = grauA;
        this.grauB = grauB;
        return (grauA * 0.33) + (grauB * 0.67);
    }
    
     public void imprimeInfo(){
      System.out.println("Aluno: "+nome);
      System.out.println("Matricula: "+matricula);
      System.out.println("Grau A: "+grauA);
      System.out.println("Grau B: "+ grauB);
      System.out.println("Média final: " + calculaMediaFinal());
   }
}