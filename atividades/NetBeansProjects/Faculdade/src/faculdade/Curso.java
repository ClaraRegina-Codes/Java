package faculdade;
public class Curso {
    private String nome;
    private int codigo;
    private Area area;
    private Disciplina disciplina;

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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Curso(String nome, int codigo, Area area, Disciplina disciplina){
        this.nome=nome;
        this.codigo=codigo;
        this.area=area;
        this.disciplina=disciplina;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Área: "+getArea()+
              "\n Disciplina: "+getDisciplina();
    }
}
