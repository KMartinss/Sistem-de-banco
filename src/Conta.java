import java.util.Scanner;

public abstract class Conta {
    Scanner input = new Scanner(System.in);

    int numero;
    double saldo;
    double valorSaque;
    // Depositar (double, boolean) **Boolean caso deseje sacar
    // Sacar (double, boolean)

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
            System.out.println("Seu saldo é de R$ " + saldo);
            System.out.println("Quanto você deseja sacar?");
            valorSaque = input.nextDouble();

            System.out.println("Você sacou: R$ " + valorSaque + "\nSeu saldo atual é R$: " + (saldo - valorSaque));
        }
    }
}