public class Principal{
    
    public static void main (String[] args){
        
        Pessoa pessoa1 = new Pessoa("Joaquim", 'M', 19, 1.78, 0, "Rua C, 145");
        Pessoa pessoa2 = new Pessoa("Manuelita",'F', 30, 1.67, 3, "Rua dos Camelos. 12");
        Pessoa pessoa3 = new Pessoa("Pedro", 'M', 10, 1.91, 1, "Rua dos Gigantes,189");
        
        pessoa1.imprimeInfo();    
        pessoa2.imprimeInfo();  
        pessoa3.imprimeInfo();  
        
        pessoa1.isFilhoUnico();
        pessoa2.isFilhoUnico();
        pessoa3.isFilhoUnico();
        
        
    }
}