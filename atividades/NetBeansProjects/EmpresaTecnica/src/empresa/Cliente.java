package empresa;
public class Cliente extends Pessoa{
    private double horasGastas;
    protected static int qtdPaginaImpressa;
    private Internet internet;
    private Impressao impressao;

    public double getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public int getQtdPaginaImpressa() {
        return qtdPaginaImpressa;
    }

    public void setQtdPaginaImpressa(int qtdPaginaImpressa) {
        this.qtdPaginaImpressa = qtdPaginaImpressa;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Impressao getImpressao() {
        return impressao;
    }

    public void setImpressao(Impressao impressao) {
        this.impressao = impressao;
    }
    public Cliente(String cpf, String nome, Endereco endereco, double horasGastas, int qtdPaginaImpressa, Internet internet, Impressao impressao){
        super(cpf, nome, endereco);
        this.horasGastas=horasGastas;
        this.impressao=impressao;
        this.internet=internet;
        this.qtdPaginaImpressa=qtdPaginaImpressa;
   
    }
    public String toString(){
       return"\n Nome: "+getNome()+
             "\n CPF: "+getCpf()+
             "\n\n Endereço de Cliente: "+getEndereco()+
             "\n Horas gastas: "+getHorasGastas()+
             "\n Quantidade de páginas impressas: "+getQtdPaginaImpressa()+
             "\n\n Informações Internet: "+getInternet()+
             "\n\n Informações Impressão: "+getImpressao();
    }
    
}
