package desafio.modeulo2;

public class Aluno {
    private String nome;
    private double nota1, nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10");
        } else {
            this.nota2 = nota2;
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        } else {
            this.nota1 = nota1;
        }
    }

    double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    void exibitInfo() {
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia(nota1, nota2));
    }
}
