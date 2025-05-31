package associacaoFuncionario;
public class Produto {
    private int codigo;
    private String descricao;
    private Double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Produto(int codigo, String descricao, Double preco){
        this.codigo=codigo;
        this.descricao=descricao;
        this.preco=preco;
    }
    public String toString(){
        return"\n código: "+getCodigo()+
              "\n Descrição: "+getDescricao()+
              "\n Preço: "+getPreco();
    }
}
