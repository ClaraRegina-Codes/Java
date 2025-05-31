package disciplinaMatematica;
public class Retangulo extends FiguraGeometrica implements ObjetoGeometrico{
    private double ladoMenor;
    private double ladoMaior;

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }
    public Retangulo(String nome, double ladoMenor, double ladoMaior){
        super(nome);
        this.ladoMaior=ladoMaior;
        this.ladoMenor=ladoMenor;
    }
    public double CalculaArea(){
        return(ladoMaior*ladoMenor);
    }
    public double CalculaPerimetro(){
        return((2*ladoMaior)+(2*ladoMenor));
    }
    public String toString(){
        return"\n Nome da figura geométrica: "+getNome()+
              "\n Lado menor: "+getLadoMenor()+
              "\n Lado maior: "+getLadoMaior()+
              "\n Área do retângulo: "+CalculaArea()+
              "\n Perímetro do retângulo: "+CalculaPerimetro();
    }
    
}
