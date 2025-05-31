package mercado;
public class Recheado extends DeDoce{
    private String descricaoRecheio;

    public String getDescricaoRecheio() {
        return descricaoRecheio;
    }

    public void setDescricaoRecheio(String descricaoRecheio) {
        this.descricaoRecheio = descricaoRecheio;
    }
    public Recheado(String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao, String descricao, String descricaoRecheio){
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao, descricao);
        this.descricaoRecheio=descricaoRecheio;
        
    }
    public String toString(){
        return "\n data de fabricação: "+getDataFabricacao()+
                "\n data de validade: "+getDataValidade()+
                "\n código: "+getCodigo()+
                "\n Tempo de fermentação: "+getTempoFermentacao()+
                "\n Descrição geral: "+getDescricao()+
                "\n Descrição do Recheio: "+getDescricaoRecheio();
    }
}
