package associacaoFuncionario;
public class Dependente {
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Dependente(int quantidade){
        this.quantidade=quantidade;
    }
    public String toString(){
        return"\n Quantidade: "+getQuantidade();
    }
}
