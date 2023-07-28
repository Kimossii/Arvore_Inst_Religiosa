import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        ArvoreBinaria ar= new ArvoreBinaria();
        Scanner in= new Scanner(System.in);
        Organograma orgo = new Organograma();


        int opcao;

        do {
            Menu();
            System.out.print("Digite a Opção: ");
            opcao = in.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("insira o nome");
                    in.nextLine();
                    String nome= in.nextLine();
                    System.out.println("insira a funcao");
                    String funcao=in.nextLine();
                    System.out.println("insira a congregacao religioso");
                    String congregacao=in.nextLine();
                    ar.inserir(new Organograma(nome,funcao,congregacao));
                    break;

                }
                case 2:{
                    System.out.println("Digita a funcao");
                    String fun = in.nextLine();
                    String fu = "j";
                    String f = "ll";
                    Organograma ogo = new Organograma();
                    ar.remover();
                    break;
                }
                case 3:
                    ar.imprimirArvore();
                    break;

                default: {

                    System.out.println("Opção inválida! ");
                    break;
                }

                }

            } while (opcao != 4);

    }
    public static void Menu() {
        System.out.println("----------- MENU -------------");
        System.out.println("[1] -Registrar Lideres Religiosos");
        System.out.println("[2] -Remover Lideres Religiosos");
        System.out.println("[3] -Mostrar todos Lideres Religiosos");
        System.out.println("[4] -Sair");
    }
}
