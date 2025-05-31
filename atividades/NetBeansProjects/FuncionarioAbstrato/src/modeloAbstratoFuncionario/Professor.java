package modeloAbstratoFuncionario;
public class Professor {
    private String nome;
    private String matr;
    private Qualificacao qualificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public Qualificacao getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(Qualificacao qualificacao) {
        this.qualificacao = qualificacao;
    }
    public Professor(String nome, String matr, Qualificacao qualificacao){
        this.matr=matr;
        this.nome=nome;
        this.qualificacao=qualificacao;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatr()+
              "\n Qualificação: "+getQualificacao();
    }
    
}
