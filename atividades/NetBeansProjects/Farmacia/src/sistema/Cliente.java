package sistema;
public class Cliente {
   private String nome;
   private String cpf;
   private int idade;
   private DoCliente doCliente;
    private Medicamento medicamento;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public DoCliente getDoCliente() {
        return doCliente;
    }

    public void setDoCliente(DoCliente doCliente) {
        this.doCliente = doCliente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Cliente(String nome, String cpf, int idade, Endereco endereco, Medicamento medicamento, DoCliente doCliente){
        this.cpf=cpf;
        this.doCliente=doCliente;
        this.endereco=endereco;
        this.idade=idade;
        this.medicamento=medicamento;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n Idade: "+getIdade()+
              "\n\n Informações de endereço: "+getEndereco()+
              "\n\n Informações do medicamento do cliente: "+getMedicamento()+
              "\n\\n Informações da nota fiscal do cliente: "+getDoCliente();
   }
}
