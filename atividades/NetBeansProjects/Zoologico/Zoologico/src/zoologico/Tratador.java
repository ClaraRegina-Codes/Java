package zoologico;
public class Tratador {
    private String matr;
    private String nome;
    private Racao racao;

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

    public Racao getRacao() {
        return racao;
    }

    public void setRacao(Racao racao) {
        this.racao = racao;
    }
    public Tratador(String nome, String matr, Racao racao){
        this.nome=nome;
        this.matr=matr;
        this.racao=racao;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatr()+
              "\n Ração: "+getRacao();
    }
    
}
