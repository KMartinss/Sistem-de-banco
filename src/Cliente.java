import java.util.Scanner;

public class Cliente extends Conta {
    Scanner input = new Scanner(System.in);

    String nome, cpf, cliente;

    public void setCliente() {
        System.out.println("Qual é o seu nome? ");
        nome = input.next();
        System.out.println("Agora, informe o seu CPF: ");
        cpf = input.next();

        System.out.println("===========================================");
        System.out.println(nome + ", sua conta foi criada com sucesso! \n");
        System.out.println("Nome: " + nome + "\n" + "CPF: " + cpf + "\n");
    }

    public String getCliente() {
        return nome + " " + cpf;
    }
}
