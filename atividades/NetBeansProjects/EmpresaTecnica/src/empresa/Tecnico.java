package empresa;
public class Tecnico extends Pessoa implements Salario, HoraExtra{
    private String matr;
    private double gratificacao;
    private Equipamento equipamento;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    public Tecnico(String cpf, String nome, Endereco endereco, String matr, double gratificacao, Equipamento equipamento){
        super(cpf, nome, endereco);
        this.equipamento=equipamento;
        this.gratificacao=gratificacao;
        this.matr=matr;
    }
    public double calculaSalario(){
        return(sal + gratificacao+(qtdHoraExtra*valorHoraExtra));
    }
    public String toString(){
        return"\n Nome: "+getNome()+
             "\n CPF: "+getCpf()+
             "\n\n Endereço de Cliente: "+getEndereco()+
             "\n Matrícula: "+getMatr()+
             "\n Gratificação: "+getGratificacao()+
             "\n\n Informações de equipamento: "+getEquipamento();
    }
}
