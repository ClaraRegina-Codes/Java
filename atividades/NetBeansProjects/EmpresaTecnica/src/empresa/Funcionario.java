package empresa;
public class Funcionario extends Pessoa implements Comissao{
    private int matr;
    private double valorComissao;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }
    public Funcionario(String cpf, String nome, Endereco endereco, int matr, double valorComissao){
        super(cpf, nome, endereco);
        this.matr=matr;
        this.valorComissao=valorComissao;
    }
    public double calculaSalComissao(){
        return(sal +valorComissao);
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n\n Endereço do funcionário: "+getEndereco()+
              "\n Matrícula: "+getMatr()+
              "\n Valor comissão: "+getValorComissao()+
              "\n Calcula salário com comissão: "+calculaSalComissao();
    }
    
}
