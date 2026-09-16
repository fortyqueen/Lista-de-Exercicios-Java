public class Questao29 {
    public static void main(String[] args) {

        for (int ano = 2000; ano <= 2030; ano++) {
            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                System.out.println(ano + " é bissexto.");
            }
        }
    }
}
