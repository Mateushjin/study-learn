package exerciciopropostos.section06.forr;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 - 1000: ");
        int user = scanner.nextInt();

        if (user >= 1 && user <= 1000) {
            for (int i = 0; i < user; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
