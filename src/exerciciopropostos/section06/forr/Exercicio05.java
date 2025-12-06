package exerciciopropostos.section06.forr;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fator = scanner.nextInt();
        int total = 1;

        for (int i = 1; i <= fator; i++) {
            total = total * i;
        }

        System.out.println(total);

        scanner.close();

    }
}
