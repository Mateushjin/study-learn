package desafio.modeulo2;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    void depositar (double valor) {
        if (valor <= 0){
            System.out.println("Valor Inválido! Você está depositando um valor negativo.");
        } else {
            saldo += valor;
        }
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

}
