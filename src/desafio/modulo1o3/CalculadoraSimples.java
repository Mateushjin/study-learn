package desafio.modulo1o3;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Peça ao usuário dois números inteiros e mostre:
        // soma, subtração, multiplicação e divisão real
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
        double div = (double) n1 / n2;

        System.out.println("A soma dos dois número é igual à: " + soma);
        System.out.println("A subtração dos dois número é igual à: " + sub);
        System.out.println("A multiplicação dos dois número é igual à: " + mult);
        System.out.println("A Divisão dos dois número é igual à: " + div);

        scanner.close();
    }
}
