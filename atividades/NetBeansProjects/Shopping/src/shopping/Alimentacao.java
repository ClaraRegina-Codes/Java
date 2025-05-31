package shopping;
public class Alimentacao extends Setor{
    private int quantidadeLoja;
    private DeAlimentacao deAlimentacao;

    public int getQuantidadeLoja() {
        return quantidadeLoja;
    }

    public void setQuantidadeLoja(int quantidadeLoja) {
        this.quantidadeLoja = quantidadeLoja;
    }

    public DeAlimentacao getDeAlimentacao() {
        return deAlimentacao;
    }

    public void setDeAlimentacao(DeAlimentacao deAlimentacao) {
        this.deAlimentacao = deAlimentacao;
    }
    public Alimentacao(int numero, int quantidadeLoja, DeAlimentacao deAlimentacao){
        super(numero);
        this.deAlimentacao=deAlimentacao;
        this.quantidadeLoja=quantidadeLoja;
    }
    public String toString(){
        return"\n Número do setor: "+getNumero()+
              "\n Quantidade de lojas: "+getQuantidadeLoja()+
              "\n Loja de alimentação: "+getDeAlimentacao();
    }
}
