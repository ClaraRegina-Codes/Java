package escola;
public class Administracao extends Funcionario{
    private String descricaoCargo;

    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }
    public Administracao(String nome, String cpf, String endereco, String cargo, Double salario, String descricaoCargo){
        super(nome, cpf, endereco, cargo, salario);
        this.descricaoCargo=descricaoCargo;
    }
}
