package shopping;
public class Alimentacao extends Setor{
    private int qtdeLoja;
    private DeAlimentacao deAlimentacao;

    public int getQtdeLoja() {
        return qtdeLoja;
    }

    public void setQtdeLoja(int qtdeLoja) {
        this.qtdeLoja = qtdeLoja;
    }

    public DeAlimentacao getDeAlimentacao() {
        return deAlimentacao;
    }

    public void setDeAlimentacao(DeAlimentacao deAlimentacao) {
        this.deAlimentacao = deAlimentacao;
    }
    public Alimentacao(int numero, int qtdeLoja, DeAlimentacao deAlimentacao){
        super(numero);
        this.deAlimentacao=deAlimentacao;
        this.qtdeLoja=qtdeLoja;
    }
    public String toString(){
        return"\n Quantidade de loja: "+getQtdeLoja()+
              "\n Número: "+getNumero()+
              "\n\n Informações da loja de alimentação: "+getDeAlimentacao();
        
    }
    
}
