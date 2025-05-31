package franquia;
public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Cliente(String nome, String cpf, int idade, Produto produto){
        this.nome=nome;
        this.cpf=cpf;
        this.idade=idade;
        this.produto=produto;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n idade: "+getIdade()+
              "\n Produto do cliente: "+getProduto();
    }
}
