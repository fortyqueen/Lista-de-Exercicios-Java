import java.util.Scanner;

public class Questao39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite N: ");
        int n = sc.nextInt();

        int soma = 0;

        System.out.println("Numeros triangulares ate " + n + ":");
        for (int i = 1; i <= n; i++) {
            soma = soma + i;

            if (soma <= n) {
                System.out.println(soma);
            }
        }
    }
}
