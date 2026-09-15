public class Questao08 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= 20; i++) {
            if (a % 2 == 0) {
                System.out.println(a + " - PAR");
            } else {
                System.out.println(a + " - ÍMPAR");
            }

            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
