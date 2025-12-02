package exerciciopropostos.section05;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double eixoX = scanner.nextDouble();
        double eixoY = scanner.nextDouble();

        if (eixoX > 0 && eixoY > 0) {
            System.out.println("Q1");
        } else if (eixoX < 0 &&  eixoY > 0) {
            System.out.println("Q2");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.println("Q3");
        } else if (eixoX > 0 &&  eixoY < 0) {
            System.out.println("Q4");
        } else if (eixoX == 0 && eixoY == 0){
            System.out.println("Origem");
        } else if (eixoX == 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Eixo X");
        }


        scanner.close();
    }
}
