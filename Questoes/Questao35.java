import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = sc.nextInt();

        int maior;
        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }

        int mmc = maior;
        while (true) {
            if (mmc % a == 0 && mmc % b == 0) {
                break;
            }
            mmc = mmc + maior;
        }

        System.out.println("O MMC e: " + mmc);
    }
}
