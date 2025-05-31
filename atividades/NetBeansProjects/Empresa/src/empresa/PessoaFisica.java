package empresa;
public class PessoaFisica extends Cliente{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public PessoaFisica(String nome, String endereco, int idade, String cpf){
        super(nome,endereco,idade);
        this.cpf=cpf;
    }
    public String toString(){
        return"\n nome:"+getNome()+
              "\n endereço: "+getEndereco()+
              "\n idade: "+getIdade()+
              "\n CPF: "+getCpf();
        
    }
}
