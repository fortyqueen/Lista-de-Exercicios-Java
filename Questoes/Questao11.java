import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if ((n * i) % 3 != 0) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
