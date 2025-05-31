package disciplinaMatematica;
public class Circulo extends FiguraGeometrica implements ObjetoGeometrico{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public Circulo(String nome, double raio){
        super(nome);
        this.raio=raio;
    }
    public double CalculaArea(){
       return(Math.PI*raio*raio); 
    }
    public double CalculaPerimetro(){
        return(Math.PI*2*raio);
    }
    public String toString(){
        return"\n Nome da figura geométrica: "+getNome()+
              "\n Raio: "+getRaio()+
              "\n Área: "+CalculaArea()+
              "\n Perímetro: "+CalculaPerimetro();
    }
}
