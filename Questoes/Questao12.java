import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão informados? ");
        int n = sc.nextInt();

        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (i == 1) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
