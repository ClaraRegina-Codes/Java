package mercado;
public class Assado extends Salgado {
    private Double tempoDeEspera;

    public Double getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(Double tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }
    public Assado(String dataFabricacao, String dataValidade, int codigo, String nome, Double quantidade, Double tempoDeEspera){
        super(dataFabricacao, dataValidade, codigo, nome, quantidade);
        this.tempoDeEspera=tempoDeEspera;
    }
    public String toString(){
        return"\n nome: "+getNome()+
               "\n código: "+getCodigo()+
                "\n quantidade: "+getQuantidade()+
                "\n tempo de espera: "+getTempoDeEspera()+
                "\n data de validade: "+getDataValidade()+
                "\n data de fabricação: "+getDataFabricacao();
    }
}
