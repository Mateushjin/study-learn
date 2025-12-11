package desafio.modulo1o3;

import java.util.Scanner;

public class SomaAteUsuarioParar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int total= 0;

        while (num != 0){
            System.out.println("Digite um número:  ");
            num = scanner.nextInt();
            total = total + num;
            System.out.println(total);
        }

        scanner.close();
    }
}
