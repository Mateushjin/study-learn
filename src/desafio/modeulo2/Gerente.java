package desafio.modeulo2;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario,String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    void mostrarDado() {
        exibirInfo();
        System.out.println("Departamento: " + departamento);
    }
}
