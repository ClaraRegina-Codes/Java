package sistema;
public class DoCliente extends NotaFiscal{
    private String descricao;
    protected static double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public DoCliente(int numero, String descricao, double preco){
        super(numero);
        this.descricao=descricao;
        this.preco=preco;
    }
    public String toString(){
        return"\n Número: "+getNumero()+
              "\n Descrição: "+getDescricao()+
              "\n Preço: "+getPreco();
    }
}
