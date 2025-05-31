package classeVeiculo;
public class Proprietario {
    private String nome;
    private String cpf;
    private Endereco endereco;

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
    public Proprietario(String nome, String cpf, Endereco endereco){
        this.cpf=cpf;
        this.endereco=endereco;
        this.nome=nome;
    } 
    public String toString(){
        return"\n CPF: "+getCpf()+
              "\n Nome: "+getNome()+
              " Endereço: "+getEndereco();
    }
}
