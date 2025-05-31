package sistema;
public class Fisica extends Pessoa{
    private String cpf;
    private ParaPessoaFisica paraPessoaFisica;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ParaPessoaFisica getParaPessoaFisica() {
        return paraPessoaFisica;
    }

    public void setParaPessoaFisica(ParaPessoaFisica paraPessoaFisica) {
        this.paraPessoaFisica = paraPessoaFisica;
    }
    public Fisica(String nome, String cpf, ParaPessoaFisica paraPessoaFisica){
        super(nome);
        this.cpf=cpf;
        this.paraPessoaFisica=paraPessoaFisica;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n\n Informações de pessoa física: "+getParaPessoaFisica();
    }
}
