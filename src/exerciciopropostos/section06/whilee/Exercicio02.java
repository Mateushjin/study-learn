package exerciciopropostos.section06.whilee;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
       int x = 1;
       int y = 1;

        while (x != 0 && y != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Coordenada X: ");
            x = scanner.nextInt();

            System.out.println("Coordenada Y: ");
            y = scanner.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0 ) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else {
                System.out.println(" ");
            }
        }
    }
}
