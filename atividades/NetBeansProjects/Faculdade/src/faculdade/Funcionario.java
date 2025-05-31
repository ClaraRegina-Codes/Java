package faculdade;
public class Funcionario {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private Salario salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }
    public Funcionario(String nome, String cnpj, Salario salario, Endereco endereco){
        this.nome=nome;
        this.cnpj=cnpj;
        this.endereco=endereco;
        this.salario=salario;
    }
}
