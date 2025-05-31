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
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }

    public DeAlimentacao(String descricao, int numero, Atendente atendente, String pais){
        super(descricao, numero, atendente);
        this.pais=pais;
    }
    public String toString(){
        return"\n Descrição: "+getDescricao()+
              "\n Número: "+getNumero()+
              "\n Cliente: "+getCliente()+
              "\n Atendente: "+getAtendente()+
              "\n Pais: "+getPais();
        
    }
    
}
