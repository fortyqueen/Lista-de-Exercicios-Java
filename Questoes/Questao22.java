import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = sc.nextLine();

        int maiusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra >= 'A' && letra <= 'Z') {
                maiusculas++;
            } else if (letra >= 'a' && letra <= 'z') {
                minusculas++;
            }
        }

        System.out.println("Maiúsculas: " + maiusculas);
        System.out.println("Minúsculas: " + minusculas);
    }
}
