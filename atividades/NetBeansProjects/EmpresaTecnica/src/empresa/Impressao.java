package empresa;
public class Impressao extends Servico{
    private double valorImpressao;

    public double getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }
    public Impressao(String nome, double valorImpressao){
        super(nome);
        this.valorImpressao=valorImpressao;
    }
    public double totalPagar(){
        return(valorImpressao*Cliente.qtdPaginaImpressa);
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Valor impressão: "+getValorImpressao()+
              "\n Total a pagar: "+totalPagar();
    }
              
}
