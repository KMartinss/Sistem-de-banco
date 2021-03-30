import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int operacao;

        Cliente cliente = new Cliente();

        // menu com opções para realizar operações nas contas a partir da classe
        // GerenciaContas.

        System.out.println("Bem vindo ao Banco Anhembi!");
        System.out.println("Bó criar sua conta");
        System.out.println("=============================================");
        cliente.setCliente();
        cliente.gerarNumeroConta();
        System.out.println("============================================= \n");

        System.out.println("[1] - Saque \n[2] - Depósito");

        System.out.println("Agora, digite o número da operação que você deseja realizar: \n");
        operacao = input.nextInt();

        switch (operacao) {
        case 1:
            System.out.println("vamo sacar então");
            cliente.sacar();
            break;
        case 2:
            System.out.println("vamos depositar então");
            cliente.depositar();
            break;
        default:
            System.out.println("coloca o bagulho direito ne");
        }
    }
}
