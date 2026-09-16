import java.util.Scanner;

public class Questao34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = sc.nextInt();

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.println("O MDC e: " + a);
    }
}
