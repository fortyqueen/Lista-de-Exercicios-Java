import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anterior = 0;
        boolean crescente = true;
        boolean primeiro = true;

        System.out.println("Digite numeros inteiros (-1 para parar):");

        while (true) {
            int numero = sc.nextInt();

            if (numero == -1) {
                break;
            }

            if (primeiro == false) {
                if (numero <= anterior) {
                    crescente = false;
                }
            }

            anterior = numero;
            primeiro = false;
        }

        if (crescente == true) {
            System.out.println("A sequencia foi crescente.");
        } else {
            System.out.println("A sequencia NAO foi crescente.");
        }
    }
}
