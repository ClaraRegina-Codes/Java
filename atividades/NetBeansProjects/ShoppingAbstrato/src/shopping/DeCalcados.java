package shopping;
public class DeCalcados extends Loja{
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
       return"\n Número: "+getNumero()+
             "\n Descrição: "+getDescricao()+
             "\n Tipo do produto: "+getTipoProduto()+
             "\n\n Informações do Atendente: "+getAtendente()+
             "\n\n Informações do Cliente: "+getCliente();
    }
}
