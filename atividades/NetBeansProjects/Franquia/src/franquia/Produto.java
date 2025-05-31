package franquia;
public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private Fornecedor fornecedor;
    private TipoProduto tipoProduto;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    public Produto(String nome, String codigo, double preco, TipoProduto tipoProduto, Fornecedor fornecedor){
        this.nome=nome;
        this.codigo=codigo;
        this.preco=preco;
        this.tipoProduto=tipoProduto;
        this.fornecedor=fornecedor;
    }
    public String toString(){
        return"\n nome: "+getNome()+
              "\n código: "+getCodigo()+
              "\n preço: "+getPreco()+
              "\n Tipo de produto: "+getTipoProduto()+
              "\n Fornecedor do produto: "+getFornecedor();
    }
}
