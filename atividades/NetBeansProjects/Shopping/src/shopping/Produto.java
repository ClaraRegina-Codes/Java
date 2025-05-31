package shopping;
public class Produto {
    private int codigo;
    private String nome;
    private Double preco;
    private Fornecedor fornecedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    public Produto(String nome, int codigo, Double preco, Fornecedor fornecedor){
        this.nome=nome;
        this.codigo=codigo;
        this.preco=preco;
        this.fornecedor=fornecedor;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Preço: "+getPreco()+
              "\n\n Fornecedor do produto: "+getFornecedor();
    }
}
