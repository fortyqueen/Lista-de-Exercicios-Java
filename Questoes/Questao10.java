import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        int opcao;

        do {
            System.out.println("1 - Sacar");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor do saque: ");
                double saque = sc.nextDouble();

                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado!");
                    System.out.println("Saldo: R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }

        } while (opcao != 2);

        System.out.println("Programa encerrado.");
    }
}
