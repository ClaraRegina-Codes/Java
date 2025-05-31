package shopping;
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Produto produto;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Cliente(String nome, String cpf, Endereco endereco, Produto produto){
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
        this.produto=produto;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n\n Endereço do cliente: "+getEndereco()+
              "\n\n Produto - Compra do cliente: "+getProduto();
    }
}
