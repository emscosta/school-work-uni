public class Empresa{
    
    private String nome;
    private FuncionarioCaixa funcionario1, funcionario2;
    
    public Empresa(String nome, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2){
        this.nome = nome;
        this.funcionario1= funcionario1;
        this.funcionario2 = funcionario2;
    }
    
    public Empresa(String nome){
        funcionario1 = null;
        funcionario2 = null;
        this.nome = nome;
    }
    
    public Empresa(){
        funcionario1 = null;
        funcionario2 = null;
        nome = "";
    }
    
    public String getNome(){
        return nome;
    }
    
    public FuncionarioCaixa getFuncionario1(){
        return funcionario1;
    }
    
    public FuncionarioCaixa getFuncionario2(){
        return funcionario2;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setFuncionario1(FuncionarioCaixa funcionario1){
        this.funcionario1 = funcionario1;
    }
    
    public void setFuncionario2(FuncionarioCaixa funcionario2){
        this.funcionario2 = funcionario2;
    }
    
    public void imprimeInfo(){
        System.out.println("Nome: " + nome);
        funcionario1.imprimeInfo();
        funcionario2.imprimeInfo();
    }
}