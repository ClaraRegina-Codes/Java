package shopping;
public class DeUtilidades extends Loja{
    private int quantidadeProduto;
    private Box box;
    private Cliente cliente;

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    
    public DeUtilidades(int numero, String descricao, Atendente atendente, int quantidadeProduto,Box box, Cliente cliente){
        super(numero, descricao, atendente);
        this.box=box;
        this.quantidadeProduto=quantidadeProduto;
        this.cliente=cliente;
    }
    public String toString(){
        return"\n Número da loja: "+getNumero()+
              "\n Descrição: "+getDescricao()+
              "\n Quantidade de Produto: "+getQuantidadeProduto()+
              "\n\n Box: "+getBox()+
              "\n\n Informações do cliente: "+getCliente()+
              "\n\n Atendente da loja: "+getAtendente();
    }
}
