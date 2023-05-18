public class Pessoa{
    private String nome;
    private char sexo;
    private int idade;
    private double altura;
    private int qtdIrmaos;
    private String endereco;
    
    public Pessoa(String nome, char sexo, int idade, double altura, int qtdIrmaos, String endereco){ 
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.qtdIrmaos = qtdIrmaos;
        this.endereco = endereco;
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
    
    public int getIdade(){
        return idade;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public int getQtdIrmaos(){
        return qtdIrmaos;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void setQtdIrmaos(int qtdIrmaos){
        this.qtdIrmaos = qtdIrmaos;
    }
    
    
    public void imprimeInfo(){
        System.out.println("nome: " + nome);
        System.out.println("Sexo: " +sexo);
        System.out.println("Idade: " +idade);
        System.out.println("altura: " +altura);
        System.out.println("quantidade irmãos: " + qtdIrmaos);
        System.out.println("endereço: " +endereco);
    }
    
    public boolean isFilhoUnico(){
        if (qtdIrmaos <= 0 && sexo == 'F'){
            System.out.println("é filha unica");
            return true;
        }
        else if(qtdIrmaos <= 0 && sexo == 'M'){
        System.out.println("é filho unico");
            return true;
        }
        else if (qtdIrmaos > 0 && sexo == 'M'){
            System.out.println("n é filho unico");
            return false;
        }
        else
            System.out.println("n é filha unica");
            return false;
    }
}