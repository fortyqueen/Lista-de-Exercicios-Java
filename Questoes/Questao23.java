import java.util.Scanner;

public class Questao23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean palindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("É uma palavra palíndroma.");
        } else {
            System.out.println("Não é uma palavra palíndroma.");
        }
    }
}
