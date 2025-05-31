package modeloBanco;
public class CartaoCredito {
    private int numero;
    private String dataCriacao;
    protected static Double valorDaCompra;
    private TransacaoCartao transacaoCartao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public TransacaoCartao getTransacaoCartao() {
        return transacaoCartao;
    }

    public void setTransacaoCartao(TransacaoCartao transacaoCartao) {
        this.transacaoCartao = transacaoCartao;
    }
    public CartaoCredito(int numero, String dataCriacao, Double valorDaCompra, TransacaoCartao transacaoCartao){
        this.dataCriacao=dataCriacao;
        this.numero=numero;
        this.valorDaCompra=valorDaCompra;
        this.transacaoCartao=transacaoCartao;
    }
    public String toString(){
        return"\n Número: "+getNumero()+
              "\n Data da criação: "+getDataCriacao()+
              "\n Valor da compra: "+getValorDaCompra()+
              "\n Saldo parcial: "+saldoParcial();  
    }
    public static Double saldoParcial(){
        return (Fisica.saldoAtual()-valorDaCompra);
    }
}
