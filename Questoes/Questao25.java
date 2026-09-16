import java.util.Scanner;

public class Questao28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor inicial: ");
        double valor = sc.nextDouble();

        System.out.print("Taxa mensal (%): ");
        double taxa = sc.nextDouble();

        System.out.print("Quantidade de meses: ");
        int meses = sc.nextInt();

        System.out.print("Limite: ");
        double limite = sc.nextDouble();

        for (int i = 1; i <= meses; i++) {
            valor = valor + (valor * taxa / 100);

            System.out.println("Mês " + i + ": R$ " + valor);

            if (valor > limite) {
                System.out.println("O valor ultrapassou o limite no mês " + i);
            }
        }
    }
}
