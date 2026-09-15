public class Questao03 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;

        while (i <= 100) {
            if (i % 2 != 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("Soma dos ímpares: " + soma);
    }
}
