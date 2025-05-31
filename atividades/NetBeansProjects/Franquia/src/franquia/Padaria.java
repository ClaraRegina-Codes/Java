package franquia;
public class Padaria {
    private String nome;
    private String cnpj;
    private String telefone;
    private Produto produto;
    private Cliente cliente;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Padaria (String nome, String cnpj, String telefone, Cliente cliente, Endereco endereco, Produto produto ){
        this.nome=nome;
        this.cnpj=cnpj;
        this.telefone=telefone;
        this.endereco=endereco;
        this.produto=produto;
        this.cliente=cliente;
    }
    public String toString(){
        return"\n nome da padaria: "+getNome()+
              "\n CNPJ da padaria: "+getCnpj()+
              "\n Telefone da padaria: "+getTelefone()+
              "\n Endereço da padaria: "+getEndereco()+
              "\n Produto da padaria: "+getProduto();
    }
}
