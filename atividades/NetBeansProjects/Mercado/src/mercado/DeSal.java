package mercado;
public class DeSal extends Pao{
    private int quantidade;
    private Double tempoParaAssar;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTempoParaAssar() {
        return tempoParaAssar;
    }

    public void setTempoParaAssar(Double tempoParaAssar) {
        this.tempoParaAssar = tempoParaAssar;
    }
    
    public DeSal(String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao, int quantidade, Double tempoParaAssar){
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao);
        this.quantidade=quantidade;
        this.tempoParaAssar=tempoParaAssar;
    }
    public String toString(){
        return "\n data de fabricação: "+getDataFabricacao()+
                "\n data de validade: "+getDataValidade()+
                "\n quantidade: "+getQuantidade()+
                "\n código: "+getCodigo()+
                "\n Tempo de fermentação: "+getTempoFermentacao()+
                "\n Tempo para assar: "+getTempoParaAssar();
                
    }
}
