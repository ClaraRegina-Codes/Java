package faculdade;
public class Disciplina {
    private String nome;
    private int codigo;
    private GradeCurricular gradeCurricular;
    private Sala sala;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public GradeCurricular getGradeCurricular() {
        return gradeCurricular;
    }

    public void setGradeCurricular(GradeCurricular gradeCurricular) {
        this.gradeCurricular = gradeCurricular;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public Disciplina(String nome, int codigo, GradeCurricular gradeCurricular, Sala sala){
        this.codigo=codigo;
        this.gradeCurricular=gradeCurricular;
        this.sala=sala;
        this.nome=nome;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Sala: "+getSala()+
              "\n Código: "+getCodigo()+
              "\n Grade curricular: "+getGradeCurricular();
    }
}
