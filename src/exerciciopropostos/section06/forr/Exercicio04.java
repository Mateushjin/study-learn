package exerciciopropostos.section06.forr;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        for (int i = 0; i < op; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = a / b;
                System.out.println(resultado);
            }

        }

        scanner.close();
    }
}
