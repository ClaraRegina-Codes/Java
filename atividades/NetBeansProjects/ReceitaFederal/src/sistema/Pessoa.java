package sistema;
public abstract class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome){
        this.nome=nome;
    }
    public abstract String toString();
}
