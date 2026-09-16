import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int vogais = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' ||
                letra == 'O' || letra == 'U') {
                vogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
    }
}
