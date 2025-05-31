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
        return"\n Número: "+getNumero()+
              "\n Descrição: "+getDescricao()+
              "\n País: "+getPais()+
              "\n Informações do Atendente: "+getAtendente()+
              "\n Informações do Cliente: "+getCliente();
    }
}
