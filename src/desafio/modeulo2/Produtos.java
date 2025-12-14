package desafio.modeulo2;

public class Produtos {
    String nome;
    double preco;

    public Produtos (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void aplicarDesconto(double desconto) {
        this.preco -= this.preco * (desconto / 100);
    }
}
