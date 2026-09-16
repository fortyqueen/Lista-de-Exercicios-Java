import java.util.Scanner;

public class Questao38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;

        if (expoente == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i <= expoente; i++) {
                resultado = resultado * base;
            }
        }

        System.out.println(base + " elevado a " + expoente + " = " + resultado);
    }
}
