package sistemaClinico;
public class Cargo {
    private String nome;
    private Salario salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }
    public Cargo(String nome, Salario salario){
        this.nome=nome;
        this.salario=salario;
    }
    public String toString(){
        return"\n Nome do cargo: "+getNome()+
              "\n Salário: "+getSalario();
    }
}
