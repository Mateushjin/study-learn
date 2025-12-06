package exerciciopropostos.section06.forr;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de número: ");
        int quantNum = scanner.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < quantNum; i++) {
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
