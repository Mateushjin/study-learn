package desafio.modulo1o3;

import java.util.Scanner;

public class EntradaUsuario1 {
    public static void main(String[] args) {
        // Peça ao usuário oara digitar seu nome e idade
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");

        scanner.close();
    }
}
