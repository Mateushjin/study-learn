package exerciciopropostos.section06.forr;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        double media = 0;

        for (int i = 1; i <= cases; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            media = ((a * 2) + ( b * 3) + (c * 5)) / 10;

            System.out.printf("%.1f\n", media);
        }

        scanner.close();
    }
}
