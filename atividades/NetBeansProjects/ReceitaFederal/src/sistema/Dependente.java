package sistema;
public class Dependente {
    private int codigo;
    private int idade;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Dependente(String nome, int idade, int codigo){
        this.codigo=codigo;
        this.idade=idade;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Idade: "+getIdade()+
              "\n Código: "+getCodigo();
    }
}
