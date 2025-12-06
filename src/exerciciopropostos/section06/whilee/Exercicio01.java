package exerciciopropostos.section06.whilee;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int senha = 2002;
        int userInput = 0;



        while (userInput != senha) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digita a senha: ");
            userInput = scanner.nextInt();

            if (userInput == senha) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha  Invalida");
            }
        }
    }
}
