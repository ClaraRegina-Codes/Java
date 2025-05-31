package modeloBanco;
public class Fisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Fisica (String nome,String telefone, Double valorGasto, Double limite, Double saldo, Endereco endereco, Conta conta, CartaoCredito cartaoCredito, String cpf){
        super(nome, telefone, valorGasto, limite, saldo, endereco, conta, cartaoCredito);
        this.cpf=cpf;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n Telefone: "+getTelefone()+
              "\n Saldo: "+getSaldo()+
              "\n Limite: "+getLimite()+
              "\n Saldo atual: "+saldoAtual()+
              "\n\n Endereço: "+getEndereco()+
              "\n\n Conta: "+getConta()+
              "\n\n Informações do cartão de crédito: "+getCartaoCredito();
    }
    public static Double saldoAtual(){
        return (saldo - valorGasto);
    }
}
