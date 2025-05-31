package zoologico;
public class Gato {
    private String cor;
    private String raca;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Gato(String raca, String cor){
        this.raca=raca;
        this.cor=cor;
    }
    public String toString(){
        return"\n Raça: "+getRaca()+
              "\n Cor: "+getCor();
    }
}
