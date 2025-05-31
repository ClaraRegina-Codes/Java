package empresa;
public class PessoaJuridica extends Cliente {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public PessoaJuridica(String nome, String endereco, int idade, String cnpj){
        super(nome, endereco, idade);
        this.cnpj=cnpj;
    }
    public String toString(){
        return"\n nome:"+getNome()+
            "\n endereço: "+getEndereco()+
            "\n idade: "+getIdade()+
            "\n CNPJ: "+getCnpj();
    }
}

