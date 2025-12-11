package desafio.modulo1o3;

import java.util.Scanner;

public class MenuSimplesComLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        while (menu != 3) {
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Mostrar a hora atual");
            System.out.println("3 - Sair");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Olá");
                    break;
                case 2:
                    System.out.println("Hora atual");
                    break;
                case 3:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }


        }

        scanner.close();
    }
}
