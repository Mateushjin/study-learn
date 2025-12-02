package exerciciopropostos.section05;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual teu salário: ");
        double salario = scanner.nextDouble();
        double ir;
        double valorPraCalcularDeIr;
        double irAPagar;
        double totalIrAPagar = 0;

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        } else if (salario >= 2000.01 && salario <= 3000) {
            ir = 0.08;
            valorPraCalcularDeIr = salario - 2000;
            irAPagar = valorPraCalcularDeIr * ir;
            System.out.printf("R$ %.2f", irAPagar);
        } else if (salario >= 3000.01 && salario <= 4500){
            ir = 0.18;
            valorPraCalcularDeIr = salario - 2000;

            if (valorPraCalcularDeIr >= 1000) {
                irAPagar = 1000 * 0.08;
                valorPraCalcularDeIr = valorPraCalcularDeIr - 1000;
                totalIrAPagar = totalIrAPagar + irAPagar;
            }

            irAPagar = valorPraCalcularDeIr * ir;
            totalIrAPagar = totalIrAPagar + irAPagar;
            System.out.printf("R$ %.2f", totalIrAPagar);
        } else if (salario > 4500) { // 4520
            ir = 0.28;
            valorPraCalcularDeIr = salario - 2000; // 2520

            if (valorPraCalcularDeIr >= 1000) { // 1520
                irAPagar = 1000 * 0.08;
                valorPraCalcularDeIr = valorPraCalcularDeIr - 1000;
                totalIrAPagar = totalIrAPagar + irAPagar;
            }

            if (valorPraCalcularDeIr >= 1500) {
                irAPagar = 1500 * 0.18;
                valorPraCalcularDeIr = valorPraCalcularDeIr - 1500;
                totalIrAPagar = totalIrAPagar + irAPagar;
            }

            irAPagar = valorPraCalcularDeIr * ir;
            totalIrAPagar = totalIrAPagar + irAPagar;
            System.out.printf("R$ %.2f", totalIrAPagar);
        } else {
            System.out.println("Número inválido");
        }

        scanner.close();
    }
}
