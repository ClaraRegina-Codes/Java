package disciplinaMatematica;
public class Quadrado extends FiguraGeometrica implements ObjetoGeometrico{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public Quadrado(String nome, double lado){
        super(nome);
        this.lado=lado;
    }
    public double CalculaArea(){
        return(lado*lado);
    }
    public double CalculaPerimetro(){
        return(4*lado);
    }
    public String toString(){
        return"\n Nome da figura geométrica: "+getNome()+
              "\n Lado menor: "+getLado()+
              "\n Área do quadrado: "+CalculaArea()+
              "\n Perímetro do quadrado: "+CalculaPerimetro();
    }
}
