  public class Questao07 {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            int soma = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }

            if (soma == i) {
                System.out.println(i);
            }
        }
    }
}
