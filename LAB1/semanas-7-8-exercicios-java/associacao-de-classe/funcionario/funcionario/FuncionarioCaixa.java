public class FuncionarioCaixa{
    private String nome, endereco;
    private char sexo;
    private Calculadora calculadora;
    
    public FuncionarioCaixa(){
    
    }
    
    public FuncionarioCaixa(String nome, String endereco, char sexo, Calculadora calculadora){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }
    
     public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public Calculadora getCalculadora(){
        return calculadora;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public void setEndereco(String e){
        endereco = e;
    }
    
    public void setSexo(char s){
        sexo = s;
    }
    
    public void setCalculadora(Calculadora calc){
        calculadora = calc;
    }
    
    public double soma(double v1, double v2){
        return calculadora.soma(v1,v2);
    }
    
    public double subtrai(double v1, double v2){
        return calculadora.subtrai(v1,v2);
    }
    
    public double multiplica(double v1, double v2){
        return calculadora.multiplica(v1,v2);
    }
    
    public double divide(double v1, double v2){
        return calculadora.divide(v1,v2);
    }
    
    public int elevaAoQuadrado(int v1){
        return calculadora.elevaAoQuadrado(v1);
    }
    
    public int elevaAoCubo(int v1){
        return calculadora.elevaAoCubo(v1);
    }
    
    public void imprimeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Gênero: " + sexo);
        System.out.println("-> Calculadora <-");
        calculadora.imprimeInfo();//classe Calculadora
    }
    
}