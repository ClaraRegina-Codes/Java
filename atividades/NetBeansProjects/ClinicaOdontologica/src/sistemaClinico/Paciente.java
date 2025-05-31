package sistemaClinico;
public class Paciente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Exame exame;
    private Consulta consulta;
    private Funcionario funcionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Paciente(String nome, String cpf, Endereco endereco, Consulta consulta, Exame exame, Funcionario funcionario){
        this.nome=nome;
        this.cpf=cpf;
        this.endereco=endereco;
        this.consulta=consulta;
        this.exame=exame;
        this.funcionario=funcionario;
    }
    public String toString(){
        return"\n Nome do paciente: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n Endereço do paciente: "+getEndereco()+
              "\n Consulta: "+getConsulta()+
              "\n Exame: "+getExame()+
              "\n Atendido por: "+getFuncionario();
    }  
}
