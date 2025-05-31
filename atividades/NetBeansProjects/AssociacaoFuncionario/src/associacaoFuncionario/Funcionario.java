package associacaoFuncionario;
public class Funcionario {
    private int matricula;
    private String nome;
    private Salario salario;
    private Cargo cargo;
    private Dependente dependente;
    private Formacao formacao;
    private Endereco endereco;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Funcionario(String nome,int matricula, Cargo cargo, Salario salario, Formacao formacao, Endereco endereco, Dependente dependente){
        this.cargo=cargo;
        this.nome=nome;
        this.matricula=matricula;
        this.salario=salario;
        this.formacao=formacao;
        this.endereco=endereco;
        this.dependente=dependente;
    }
    public String toString(){
        return"\n Nome do funcionário: "+getNome()+
              "\n Matrícula do funcionário: "+getMatricula()+
              "\n\n Informações do cargo do funcionário: "+getCargo()+
              "\n\n Informações do Salário do funcionário: "+getSalario()+
              "\n\n Informações da Formação do funcionário: "+getFormacao()+
              "\n\n Informações do endereço do funcionário: "+getEndereco()+
              "\n\n Informações de dependência do funcionário: "+getDependente();
    }
}
