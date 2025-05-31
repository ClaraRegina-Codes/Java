package escola;
public class Funcionario extends Pessoa {
    private String cargo;
    private Double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Funcionario(String nome, String cpf, String endereco, String cargo, Double salario){
        super(nome, cpf, endereco);
        this.cargo=cargo;
        this.salario=salario;
    }
}
