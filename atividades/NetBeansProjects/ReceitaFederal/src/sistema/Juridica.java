package sistema;
public class Juridica extends Pessoa{
    private String cnpj;
    private ParaPessoaJuridica paraPessoaJuridica;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ParaPessoaJuridica getParaPessoaJuridica() {
        return paraPessoaJuridica;
    }

    public void setParaPessoaJuridica(ParaPessoaJuridica paraPessoaJuridica) {
        this.paraPessoaJuridica = paraPessoaJuridica;
    }
    public Juridica(String nome, String cnpj, ParaPessoaJuridica paraPessoaJuridica){
        super(nome);
        this.cnpj=cnpj;
        this.paraPessoaJuridica=paraPessoaJuridica;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPNJ: "+getCnpj()+
              "\n\n Informações de pessoa jurídica: "+getParaPessoaJuridica();
    }
}
