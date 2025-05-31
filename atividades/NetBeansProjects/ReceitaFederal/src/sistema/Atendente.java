package sistema;
public class Atendente extends Funcionario{
    private String setor;
    private Fisica fisica;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
    public Atendente(String nome, int matricula, double salario, Endereco endereco, String setor, Fisica fisica){
        super(nome, matricula, salario, endereco);
        this.fisica=fisica;
        this.setor=setor;
    }
    public double CalculaSalario(){
        return(salario+(salario*0.15));
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatricula()+
              "\n Salário: "+getSalario()+
              "\n Setor: "+getSetor()+
              "\n\n Informações de endereço: "+getEndereco()+
              "\n\n Informações de física: "+getFisica();
    }
}
