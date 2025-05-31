package shopping;
public class Cliente {
    private String nome;
    private String cpf;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Cliente(String nome, String cpf, Produto produto){
        this.nome=nome;
        this.cpf=cpf;
        this.produto=produto;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n Produto: "+getProduto();
    }
}
