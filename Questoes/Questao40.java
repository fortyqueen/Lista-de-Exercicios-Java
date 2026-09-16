import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        int tentativas = 0;
        boolean acertou = false;

        do {
            System.out.print("Digite a senha: ");
            String senha = sc.next();
            tentativas++;

            if (senha.equals(senhaCorreta)) {
                acertou = true;
                System.out.println("Acesso liberado!");
            } else {
                int restantes = 3 - tentativas;
                if (restantes > 0) {
                    System.out.println("Senha incorreta! Restam " + restantes + " tentativas.");
                } else {
                    System.out.println("Acesso bloqueado!");
                }
            }

        } while (acertou == false && tentativas < 3);
    }
}
