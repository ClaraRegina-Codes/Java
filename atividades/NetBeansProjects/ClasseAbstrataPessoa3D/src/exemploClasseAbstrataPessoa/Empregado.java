package exemploClasseAbstrataPessoa;
public class Empregado extends Pessoa{
    private String matr;
    private String setor;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public Empregado(String nome, double gratificacao, double salario, Filiacao filiacao, String matr, String setor){
        super(nome, gratificacao, salario, filiacao);
        this.gratificacao=gratificacao;
        this.matr=matr;
        this.salario=salario;
        this.setor=setor;
    }
    
    public double salarioFinal(){
        return (salario + gratificacao);
    }
    
    public String toString(){
        return"\n Dados do empregado: "+
              "\n Nome: "+getNome()+
              "\n Dados da Filiação: "+getFiliacao()+
              "\n Matrícula: "+getMatr()+
              "\n Setor: "+getSetor()+
              "\n Salário: "+getSalario()+
              "\n Salário final: "+salarioFinal(); 
    }
}
