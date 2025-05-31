package associacaoFuncionario;
public class Cliente {
    private String nome;
    private String cpf;
    private Venda venda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public Cliente(String nome, String cpf, Venda venda){
        this.nome=nome;
        this.cpf=cpf;
        this.venda=venda;
    }
    public String toString(){
        return"\n nome do cliente: "+getNome()+
              "\n CPF do cliente: "+getCpf()+
              "\n Compra: "+getVenda();
    }
}
