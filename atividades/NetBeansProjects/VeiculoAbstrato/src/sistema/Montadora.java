package sistema;
public class Montadora {
    private String nome;
    private String cnpj;
    private Endereco endereco;

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
    public Montadora(String nome, String cnpj, Endereco endereco){
        this.cnpj=cnpj;
        this.endereco=endereco;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj()+
              "\n Endereço da montadora: "+getEndereco();
    }
}
