package desafio.modulo1o3;

import java.util.Scanner;

public class ClassificacaoDeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int user = scanner.nextInt();

        if (user > 0 ) {
            System.out.println("Positivo");
        } else if (user < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}
