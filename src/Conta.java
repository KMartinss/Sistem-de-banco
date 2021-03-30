import java.util.Scanner;

public abstract class Conta {
    Scanner input = new Scanner(System.in);

    int numero;
    double saldo;
    double valorSaque;
    double valorDeposito;
    int caseDeposito;
    int caseSaque;

    public void gerarNumeroConta() {
        int max = 1000;
        int min = 100;

        int numConta = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Número da conta: 1-" + numConta);
    }

    public void sacar() {
        saldo = 100;

        if (saldo == 0) {
            System.out.println("Você precisa depositar antes de sacar.");
        } else if (saldo >= 1) {
            System.out.println("Conta corrente ou conta poupança? \n[1]- Poupança \n[2]- Corrente");
            caseSaque = input.nextInt();
            switch (caseSaque) {
            case 1:
                System.out.println("Seu saldo na conta poupança R$ " + saldo);
                System.out.println("Quanto você deseja sacar?");
                valorSaque = input.nextDouble();
                System.out.println("Você sacou: R$ " + valorSaque + "\nSeu saldo atual é R$: " + (saldo - valorSaque));
                break;
            case 2:
                System.out.println("Seu saldo na conta corrente R$ " + saldo);
                System.out.println("Quanto você deseja sacar?");
                valorSaque = input.nextDouble();
                System.out.println("Você sacou: R$ " + valorSaque + "\nSeu saldo atual é R$: " + (saldo - valorSaque));
                break;
            default:
                System.out.println("Opção inválida");
                break;
            }
        }
    }

    public void depositar() {
        System.out.println("Conta corrente ou conta poupança? \n[1]- Poupança \n[2]- Corrente");
        caseDeposito = input.nextInt();
        switch (caseDeposito) {
            case 1:
            System.out.println("Quanto você deseja depositar? R$ ");
            valorDeposito = input.nextDouble();
            System.out.println("Você depositou na conta poupança: R$ " + valorDeposito + "\nSeu saldo atual é R$: " + (saldo + valorDeposito));
            break;
            case 2:
            System.out.println("Quanto você deseja depositar? R$ ");
            valorDeposito = input.nextDouble();
            System.out.println("Você depositou na conta Corrente: R$ " + valorDeposito + "\nSeu saldo atual é R$: " + (saldo + valorDeposito));
            break;
            default:
            System.out.println("Opção inválida");
            break;
        }
    }
}

// Coisas que faltam: BANCO DE DADOS, valor de saque como atributo estático