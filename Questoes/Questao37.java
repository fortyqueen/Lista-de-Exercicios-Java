import java.util.Scanner;

public class Questao37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos clientes serao atendidos? ");
        int n = sc.nextInt();

        int cliente = 1;
        while (cliente <= n) {
            System.out.println("Atendendo cliente " + cliente);

            if (cliente % 5 == 0) {
                System.out.println("-> Cliente especial numero " + cliente + "!");
            }

            cliente++;
        }
    }
}
