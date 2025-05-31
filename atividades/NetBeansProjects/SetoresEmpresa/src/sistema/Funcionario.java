package sistema;
public abstract class Funcionario {
    private String matr;
    private String nome;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome, String matr){
        this.matr=matr;
        this.nome=nome;
    }
    public abstract String toString();

    
}
