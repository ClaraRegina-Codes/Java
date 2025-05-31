package empresa;
public class Equipamento {
    private String configuracao;
    private String marca;

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Equipamento(String configuacao, String marca){
        this.configuracao=configuracao;
        this.marca=marca;
    }
    public String toString(){
        return"\n Marca: "+getMarca()+
              "\n Configuração: "+getConfiguracao();
    }
}
