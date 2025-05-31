package shopping;
public class Produto {
    private String nome;
    private int codigo;
    private Double preco;
    private Fornecedor fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Produto (String nome, int codigo, Double preco, Fornecedor fornecedor){
        this.codigo=codigo;
        this.fornecedor=fornecedor;
        this.nome=nome;
        this.preco=preco;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Preço: "+getPreco()+
              "\n Fornecedor: "+getFornecedor();
    }
}
