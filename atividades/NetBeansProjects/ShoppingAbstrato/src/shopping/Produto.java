package shopping;
public class Produto {
    private String nome;
    private int codigo;
    protected static double preco;
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

    public double getPreco() {
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
    public Produto(String nome, int codigo, double preco, Fornecedor fornecedor){
        this.codigo=codigo;
        this.fornecedor=fornecedor;
        this.nome=nome;
        this.preco=preco;
    }
    public static double calculaPrecoFinal(){
        return (preco+(preco*0.7));
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Preço: "+getPreco()+
              "\n\n Fornecedor do produto: "+getFornecedor();
    }
}
