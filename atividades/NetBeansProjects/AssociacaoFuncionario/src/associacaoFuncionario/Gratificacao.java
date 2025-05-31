package associacaoFuncionario;
public class Gratificacao {
    private Double valor;
    private int quantidade;
    private String validade;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    public Gratificacao(Double valor, int quantidade, String validade){
        this.valor=valor;
        this.quantidade=quantidade;
        this.validade=validade;
    }
    public String toString(){
        return"\n Valor da gratificação: "+getValor()+
              "\n Quantidade: "+getQuantidade()+
              "\n Validade: "+getValidade();
    }
}
