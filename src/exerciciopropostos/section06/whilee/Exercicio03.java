package exerciciopropostos.section06.whilee;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (user != 4){
            System.out.print("Qual combustível? ");
            user = scanner.nextInt();

            if (user == 1) {
                alcool++;
            } else if (user == 2) {
                gasolina++;
            } else if (user == 3) {
                diesel++;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println(alcool);
        System.out.println(gasolina);
        System.out.println(diesel);

        scanner.close();
    }
}
