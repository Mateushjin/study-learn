package exerciciopropostos.section05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual produto? ");
        double produto = scanner.nextInt();

        System.out.println("Quantidade? ");
        int quantidade = scanner.nextInt();

        double valorTotal;

        if (produto == 1) {
            produto = 4;
            valorTotal = (double) produto * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (produto == 2) {
            produto = 4.5;
            valorTotal = (double) produto * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (produto == 3) {
            produto = 5;
            valorTotal = (double) produto * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (produto == 4){
            produto = 2;
            valorTotal = (double) produto * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else if (produto == 5) {
            produto = 1.5;
            valorTotal = (double) produto * quantidade;
            System.out.printf("Total: R$ %.2f", valorTotal);
        } else {
            System.out.println("Produto inválida");
        }

        scanner.close();
    }
}
