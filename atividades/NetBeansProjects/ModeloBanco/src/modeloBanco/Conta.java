package modeloBanco;
public class Conta {
    private int numConta;
    private Double saldo;
    private Transacao transacao;
    private Agencia agencia;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public Conta(int numConta, Double saldo, Transacao transacao, Agencia agencia){
        this.agencia=agencia;
        this.numConta=numConta;
        this.saldo=saldo;
        this.transacao=transacao;
    }
    public String toString(){
        return"\n Número da conta: "+getNumConta()+
              "\n Saldo: "+getSaldo()+
              "\n Saldo da conta: "+saldoConta()+
              "\n\n Agência: "+getAgencia()+
              "\n\n Transação: "+getTransacao();
    }
    public static Double saldoConta(){
        return(TransacaoCartao.saldoFuturo()-TransacaoCartao.valor);
    }
}
