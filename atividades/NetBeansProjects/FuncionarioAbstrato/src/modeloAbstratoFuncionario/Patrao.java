package modeloAbstratoFuncionario;
public class Patrao {
    private String nome;
    private int idade;
    private Empresa empresa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Patrao(String nome, int idade, Empresa empresa){
        this.empresa=empresa;
        this.nome=nome;
        this.idade=idade;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Idade: "+getIdade()+
              "\n Dados da empresa: "+getEmpresa();
    }
}
