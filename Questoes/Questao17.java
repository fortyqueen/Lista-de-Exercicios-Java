import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int quantidade = 0;

        if (numero == 0) {
            quantidade = 1;
        } else {
            if (numero < 0) {
                numero = -numero;
            }

            while (numero != 0) {
                quantidade++;
                numero /= 10;
            }
        }

        System.out.println("Quantidade de dígitos: " + quantidade);
    }
}
