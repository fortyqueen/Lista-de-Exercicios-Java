import java.util.Scanner;
 
public class Questao31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, valor;
        int positivos = 0, negativos = 0, zeros = 0;
 
        System.out.print("Quantos números deseja informar? ");
        n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            valor = sc.nextInt();
 
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }
 
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
 
        sc.close();
    }
}
 
