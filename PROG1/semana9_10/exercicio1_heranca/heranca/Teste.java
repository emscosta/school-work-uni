public class Teste{
    
    public static void main (String[] args){
        Fruta fruta1 = new Melancia("Melancia", 1.70, 2.30, true);
        Melancia melancia = (Melancia)fruta1;
        
        Fruta fruta2 = new Banana("Melancia", 1.70,"caturra");
        Banana banana = (Banana)fruta2;
        
        Pessoa p;
        int opcao = 1;
        System.out.println(Teclado.leInt("criar programador opcao 1" + "\ncriar aluno opcao 2"));
        
        if(opcao == 1){
            p = new Programador("helio", 18, "C#");
            Programador c = (Programador)p;
            System.out.println(c.getFaveLang());
            }
            else if (opcao == 2){
                p = new Aluno("joao", 25, 6.3);
                Aluno a = (Aluno)p;
                System.out.println(a.getNota());
            }
            
        
    }
}