package desafio.modeulo2;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto (String n, double p, int q) {
        nome = n;
        preco = p;
        quantidade = q;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade: " + quantidade + " unidades");
    }
}
