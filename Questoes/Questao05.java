public class Questao05 {
    public static void main(String[] args) {
        int quantidade = 0;

        for (int i = 2; i <= 50; i++) {
            int divisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                quantidade++;
            }
        }

        System.out.println("Quantidade de primos: " + quantidade);
    }
}
