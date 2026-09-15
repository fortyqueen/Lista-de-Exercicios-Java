import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int original = numero;
        int quantidade = 0;
        int temp = numero;

        while (temp != 0) {
            quantidade++;
            temp /= 10;
        }

        int soma = 0;
        temp = numero;

        for (int i = 0; i < quantidade; i++) {
            int digito = temp % 10;
            int potencia = 1;

            for (int j = 0; j < quantidade; j++) {
                potencia *= digito;
            }

            soma += potencia;
            temp /= 10;
        }

        if (soma == original) {
            System.out.println("É um número de Armstrong.");
        } else {
            System.out.println("Não é um número de Armstrong.");
        }
    }
}
