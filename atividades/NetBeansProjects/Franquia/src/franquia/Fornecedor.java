package franquia;
public class Fornecedor {
    private String cnpj;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCpnj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Fornecedor(String cnpj, String nome, String telefone, Endereco endereco){
        this.cnpj=cnpj;
        this.nome=nome;
        this.telefone=telefone;
        this.endereco=endereco;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Telefone: "+getTelefone()+
              "\n CNPJ: "+getCnpj()+
              "\n Endereço do fornecedor: "+getEndereco();
    }
}
