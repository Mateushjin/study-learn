package exerciciopropostos.section06.forr;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        for (int i = 1; i <= op; i++) {
            System.out.print(i+ " ");
            System.out.print((int) Math.pow(i, 2) + " ");
            System.out.println((int) Math.pow(i, 3) );
        }

        scanner.close();
    }
}
