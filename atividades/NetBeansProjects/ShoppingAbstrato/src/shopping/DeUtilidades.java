package shopping;
public class DeUtilidades extends Loja{
    private int qtdeProduto;
    private Cliente cliente;
    private Box box;

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
    public DeUtilidades(int numero, String descricao, Atendente atendente,int qtdeProduto, Cliente cliente, Box box){
        super(numero, descricao, atendente);
        this.box=box;
        this.cliente=cliente;
        this.qtdeProduto=qtdeProduto;
    }
    public String toString(){
        return"\n Número: "+getNumero()+
              "\n Descrição: "+getDescricao()+
              "\n Quantidade de produtos: "+getQtdeProduto()+
              "\n\n Informações do Atendente: "+getAtendente()+
              "\n\n Informações do Cliente: "+getCliente();
    }
}
