package sistema;
public abstract class Funcionario {
    private String nome;
    private int matricula;
    protected static double salario;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Funcionario(String nome, int matricula, double salario, Endereco endereco){
        this.matricula=matricula;
        this.nome=nome;
        this.salario=salario;
        this.endereco=endereco;
    }
    public abstract double CalculaSalario();
    public abstract String toString();
}
