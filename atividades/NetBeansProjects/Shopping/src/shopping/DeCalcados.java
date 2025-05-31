package shopping;
public class DeCalcados extends Loja {
    private String tipoProduto;
    private Cliente cliente;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public DeCalcados(int numero, String descricao, Atendente atendente,String tipoProduto, Cliente cliente){
        super(numero, descricao, atendente);
        this.cliente=cliente;
        this.tipoProduto=tipoProduto;
    }
    public String toString(){
        return"\n Número da loja: "+getNumero()+
              "\n Descrição: "+getDescricao()+
              "\n Tipo de Produto: "+getTipoProduto()+
              "\n\n Informações do cliente: "+getCliente()+
              "\n\n Atendente da loja: "+getAtendente();
    }
}
