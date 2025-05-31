package sistema;
public abstract class Curso {
    private String tipo;
    private int cargaHoraria; 
    protected static Double nota1;
    protected static Double nota2;
    protected static Double nota3; 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    public Curso(String tipo, int cargaHoraria, Double nota1, Double nota2, Double nota3){
        this.cargaHoraria=cargaHoraria;
        this.tipo=tipo;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
    }
    public abstract String toString();
}
