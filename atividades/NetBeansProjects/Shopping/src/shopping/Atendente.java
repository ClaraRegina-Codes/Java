package shopping;
public class Atendente {
    private int matricula;
    private String nome;
    private Double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Atendente(int matricula, String nome, Double salario){
        this.nome=nome;
        this.matricula=matricula;
        this.salario=salario;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatricula()+
              "\n Salário: "+getSalario();
    }
}
