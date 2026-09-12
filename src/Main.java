import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.




void main() {


    Scanner scanner= new Scanner(System.in);

    System.out.println("\n\nBem-vindo ao menu do Ginasio Ann-bolicos!\n\n");
    System.out.println("O que deseja fazer hoje?\n\n1- Gestão de Clientes\n2- Ver maquinas\n0-Sair do Programa\n\n");
    System.out.println("Insira a sua opção: ");


    int opcaoInicialMenu= scanner.nextInt();
    int opcaoMenuGestaoClientes;
    boolean validar_sexoCliente;

    if (opcaoInicialMenu==1){
        System.out.println("\n\nIniciando o menu de Gestao de Clientes...\n\n");
        System.out.flush();
        ClearConsoleScreen.clearWithANSICodes();
        System.out.println("Menu Gestão de Clientes\n\nO que deseja realizar?\n\n1-Ver lista de Clientes\n\n2-Adicionar membro\n\n0-Voltar atras");
        opcaoMenuGestaoClientes= scanner.nextInt();


            if (opcaoMenuGestaoClientes==1){
            System.out.println("Lista dos Clientes atuais: ");


            }else if(opcaoMenuGestaoClientes==2){
            System.out.println("\n\nIniciando o menu de Maquinas...\n\n");


            System.out.println("Insira o nome do Cliente:");
            String  nomeCliente = scanner.nextLine();

            scanner.nextLine();

            System.out.println("Insira a idade do Cliente:");
            int idadeCliente = scanner.nextInt();

            System.out.println("Insira a morada do Cliente:");
            String  moradaCliente = scanner.nextLine();

            scanner.nextLine();

            System.out.println("Insira o peso do Cliente (KG,g):");
            float  pesoCliente_KG = scanner.nextFloat();

            System.out.println("Insira a altura do Cliente (CM):");
            int  alturaCliente = scanner.nextInt();

            System.out.println("Insira o sexo do Cliente 'Femenino' ou 'Masculino':");
            String  sexoCliente = scanner.nextLine();
            scanner.nextLine();

//            Validação do input correto para o sexo do cliente
            if(sexoCliente.equals("Masculino") ||sexoCliente.equals("Femenino")){
                    validar_sexoCliente =true;

            } else {
                validar_sexoCliente =false;
                    while(!validar_sexoCliente){
                    System.out.println("Valor invalido! Digite 'Masculino' ou 'Femenino':");
                    sexoCliente = scanner.nextLine();
                    if(sexoCliente.equals("Masculino") || sexoCliente.equals("Femenino")){
                        validar_sexoCliente =true;
                    }
                }
            }





                Cliente cliente = new Cliente(nomeCliente, idadeCliente, moradaCliente, pesoCliente_KG, alturaCliente, sexoCliente);
                System.out.println("A altura do cliente em CM é: " + cliente.alturaCliente);
            }


    }else if (opcaoInicialMenu==0) {
    ClearConsoleScreen.clearWithANSICodes();
    System.out.println("Até a proxima!");
    System.out.flush();

        return;

    }


}







