package shopping;
public class Fornecedor {
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
    public Fornecedor(String nome, String cnpj, Endereco endereco){
        this.nome=nome;
        this.cnpj=cnpj;
        this.endereco=endereco;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CNPJ: "+getCnpj()+
              "\n Endereço do fornecedor: "+getEndereco();
    }
}
