package applications;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginCorreta = "davi";
        String senhaCorreta = "123";
        boolean contaCorreta = true;
        double media;
        double soma = 0;


        while (contaCorreta) {
            System.out.print("Digite seu login: ");
            String login = sc.next();

            System.out.print("Digite a sua senha: ");
            String senha = sc.next();

            if (login.equals(loginCorreta) && senha.equals(senhaCorreta)) {
                System.out.println("Conta acessada com sucesso para calcular o valor de suas notas");
                contaCorreta = false;
            } else {
                System.out.println("acesso invalido, tente novamente!");
            }
        }
        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma = soma + notas[i];
        }
        media = soma / notas.length;
        if (media <= 2.9) {
            System.out.println("Reprovado com média de: " + media);
        } else if (media >= 3 && media <= 5.9) {
            System.out.println("Recuperação com média de: " + media);
        } else {
            System.out.println("Aprovado com média de: " + media);
        }
        sc.close();
    }
}
