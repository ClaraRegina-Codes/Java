package sistema;
public abstract class Funcionario {
    private Endereco endereco;
    private String matr;
    private String nome;
    protected static double salario;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Funcionario(String nome, String matr, double salario, Endereco endereco){
        this.nome=nome;
        this.matr=matr;
        this.salario=salario;
        this.endereco=endereco;
               
    }
    public abstract String toString();
    public abstract double Inss();
 
}
