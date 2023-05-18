public class Principal{
    public static void menu(){
        System.out.println("escolha uma das opções");
        System.out.println("1. conta até 300");
        System.out.println("2. imprime pares");
        System.out.println("3. verifica primo");   
    } 

    public static void main(String[]args){
        
        Exercicios teste1 = new Exercicios();
        int opcao;
 
        do{
            menu();
            opcao = Teclado.leInt("digite a opção desejada: ");
            switch (opcao) {
            case 1: {
                 teste1.contador(Teclado.leInt("digite um numero: "));
                 break;
                }
            case 2: {
                teste1.imprimePares(Teclado.leInt("digite um numero: "));
                break;
            }
            case 3: {
                teste1.verificaPrimo(Teclado.leInt("digite um numero: "));
                break;
            }
            default:
                System.out.print("\nOpção Inválida!");
                break;}
        }while(opcao != 0);
    }
}