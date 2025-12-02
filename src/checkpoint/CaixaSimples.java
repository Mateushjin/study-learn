package checkpoint;

import java.util.Scanner;

public class CaixaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 1;
        double saldo = 0;

        do {
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);

                    break;
                case 2:
                    System.out.print("Valor a depositar: ");
                    double valorDepositar = scanner.nextDouble();
                    saldo += valorDepositar;
                    break;
                case 3:
                    System.out.print("Qual valor quer sacar: ");
                    double valorSacado = scanner.nextDouble();
                    if (valorSacado > saldo) {
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo-= valorSacado;
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Operação Inválida!");
                    break;
            }
        } while (op != 4);


        scanner.close();
    }
}
