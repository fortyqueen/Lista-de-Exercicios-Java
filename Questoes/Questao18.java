import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            numero = -numero;
        }

        int soma = 0;

        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("Soma dos dígitos: " + soma);
    }
}
