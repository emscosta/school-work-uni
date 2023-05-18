public class Teste{
    public static void main(String[] args){
        
        Calculadora c1 = new Calculadora(Teclado.leString("insira a cor da calculadora: "));
        
        FuncionarioCaixa funcionario = new FuncionarioCaixa(Teclado.leString("insira o nome do funcionario:"), Teclado.leString("insira o endereco do funcionario: "),
        Teclado.leChar("insira o genero do funcionario: "), c1);
        
        System.out.println(c1.soma(2,2));
        System.out.println(c1.subtrai(5,4));
        System.out.println(c1.multiplica(2,3));
        System.out.println(c1.divide(6,3));
        System.out.println(c1.elevaAoQuadrado(72));
        System.out.println(c1.elevaAoCubo(83));
        
        FuncionarioCaixa funcionario2 = new FuncionarioCaixa(Teclado.leString("insira o nome do funcionario:"), Teclado.leString("insira o endereco do funcionario: "),
        Teclado.leChar("insira o genero do funcionario: "), c1);
        
        Empresa empresa1 = new Empresa(Teclado.leString("insira o nome da empresa: "), funcionario, funcionario2);
        
        empresa1.imprimeInfo();
    }
}