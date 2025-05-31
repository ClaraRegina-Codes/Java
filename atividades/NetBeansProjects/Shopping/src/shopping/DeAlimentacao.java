package shopping;
public class DeAlimentacao extends Loja{
    private String pais;
    private Cliente cliente;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public DeAlimentacao(int numero, String descricao, Atendente atendente, String pais, Cliente cliente){
        super(numero, descricao, atendente);
        this.cliente=cliente;
        this.pais=pais;
    }
  public String toString(){
        return"\n Número da loja: "+getNumero()+
              "\n País: "+getPais()+
              "\n\n Informações do cliente: "+getCliente()+
              "\n Descrição: "+getDescricao()+
              "\n\n Atendente da loja: "+getAtendente();
    }
}
