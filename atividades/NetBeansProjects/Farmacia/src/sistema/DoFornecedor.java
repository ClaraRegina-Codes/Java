package sistema;
public class DoFornecedor extends NotaFiscal{
    private String descricao;
    private String data;
    private double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public DoFornecedor(int numero, String data, String descricao, double preco){
        super(numero);
        this.data=data;
        this.descricao=descricao;
        this.preco=preco;
    }
    public String toString(){
        return"\n Número: "+getNumero()+
              "\n Data: "+getData()+
              "\n Descrição: "+getDescricao()+
              "\n Preço: "+getPreco();
    }
}
