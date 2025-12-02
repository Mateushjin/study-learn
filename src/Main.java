import desafio.modeulo2.Matematica;
import desafio.modeulo2.Pessoa;
import desafio.modeulo2.Produto;
import desafio.modeulo2.Saudacao;

public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = new Saudacao();
        saudacao.dizerOla();

        Matematica matematica = new Matematica();
        System.out.println(matematica.somar(1, 5));

        Pessoa pessoa = new Pessoa();
        pessoa.idade = 19;
        System.out.println(pessoa.ehMaiorDeIdade());

        Produto produto1 = new Produto("Lápis", 10.00 , 99);
        produto1.exibirInfo();
        Produto produto2 = new Produto("Borracha", 4.99, 98);
        produto2.exibirInfo();

    }
}
