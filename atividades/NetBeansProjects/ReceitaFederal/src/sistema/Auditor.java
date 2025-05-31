package sistema;
public class Auditor extends Funcionario{
    protected static double gratificacao;
    private Auditoria auditoria;

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }
    public Auditor(String nome, int matricula, double salario,Endereco endereco, double gratificacao, Auditoria auditoria){
        super(nome, matricula, salario, endereco);
        this.auditoria=auditoria;
        this.gratificacao=gratificacao;
    }
    public double CalculaSalario(){
        return(salario+(salario*gratificacao)+gratificacao);
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatricula()+
              "\n Salário: "+getSalario()+
              "\n Gratificação: "+getGratificacao()+
              "\n Cálculo do salário: "+CalculaSalario()+
              "\n\n Informações do endereço: "+getEndereco()+
              "\n\n Informações da auditoria: "+getAuditoria();
    }
}
