public class Questao33 {
    public static void main(String[] args) {
        System.out.println("Celsius | Fahrenheit");

        for (int c = 0; c <= 100; c++) {
            double f = c * 9.0 / 5.0 + 32;

            if (c == 0) {
                System.out.println(c + " | " + f + "  <- Congelamento da agua");
            } else if (c == 100) {
                System.out.println(c + " | " + f + "  <- Ebulicao da agua");
            } else {
                System.out.println(c + " | " + f);
            }
        }
    }
}
