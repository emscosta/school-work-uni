public class PrincipalAluno{
    public static void main (String[] args){
        Aluno aluno1 = new Aluno("Bradamente Brasil", "1585258", 5, 9);
        Aluno aluno2 = new Aluno("Redigunda Cercená", "2254879", 8, 2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo","0085994", 7, 1);
        
        aluno1.imprimeInfo();
        aluno2.imprimeInfo();
        aluno3.imprimeInfo();
        
        aluno2.setGraua(9);
        System.out.println(aluno3.getMatricula());
        System.out.println(aluno2.calculaMediaFinal());
        
        aluno1.setMatricula("1585228");
        aluno2.setGraub(Teclado.leDouble("informe a nova nora do grau b: "));
        
        
        
    
        

        
        
                
    }
}