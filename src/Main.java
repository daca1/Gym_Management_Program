import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.




void main() {


    Scanner scanner= new Scanner(System.in);

    System.out.println("\n\nBem-vindo ao menu do Ginasio Ann-bolicos!\n\n");
    System.out.println("O que deseja fazer hoje?\n\n1- Gestão de Clientes\n2- Ver maquinas\n0-Sair do Programa\n\n");
    System.out.println("Insira a sua opção: ");


    int opcaoInicialMenu= scanner.nextInt();
    int opcaoMenuGestaoClientes;

    if (opcaoInicialMenu==1){
        System.out.println("\n\nIniciando o menu de Gestao de Clientes...\n\n");
        System.out.flush();
        ClearConsoleScreen.clearWithANSICodes();
        System.out.println("Menu Gestão de Clientes\n\nO que deseja realizar?\n\n1-Ver lista de Clientes\n\n2-Adicionar membro\n\n0-Voltar atras");
        opcaoMenuGestaoClientes= scanner.nextInt();
        if (opcaoMenuGestaoClientes==1){
            System.out.println("Lista dos Clientes atuais: ");
        }

    }if(opcaoInicialMenu==2){
        System.out.println("\n\nIniciando o menu de Maquinas...\n\n");
        System.out.flush();
        ClearConsoleScreen.clearWithANSICodes();


    } else if (opcaoInicialMenu==0) {
        ClearConsoleScreen.clearWithANSICodes();
        System.out.println("Até a proxima!");
        System.out.flush();

        return;

    }


}



