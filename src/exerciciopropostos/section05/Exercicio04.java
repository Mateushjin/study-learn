package exerciciopropostos.section05;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextByte();
        int horaFinal = scanner.nextByte();
        int duracao;

        if (horaInicial > horaFinal) {
            duracao = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (horaFinal == horaInicial) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }

        scanner.close();
    }
}
