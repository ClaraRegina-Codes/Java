package shopping;
public class Atendente {
    private String nome;
    private int matricula;
    protected static double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Atendente(String nome, double salario, int matricula){
        this.matricula=matricula;
        this.nome=nome;
        this.salario=salario;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatricula()+
              "\n Salário: "+getSalario()+
              "Salario final: "+calculaSalarioFinal();
    }
    public static double calculaSalarioFinal(){
        return (salario+(salario*0.08));
    }
}
