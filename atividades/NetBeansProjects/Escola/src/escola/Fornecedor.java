package escola;
public class Fornecedor extends Pessoa {
    private int investimento;

    public int getInvestimento() {
        return investimento;
    }

    public void setInvestimento(int investimento) {
        this.investimento = investimento;
    }
    public Fornecedor(String nome, String cpf, String endereco, int investimento){
        super(nome,cpf,endereco);
        this.investimento=investimento;
    }
}
