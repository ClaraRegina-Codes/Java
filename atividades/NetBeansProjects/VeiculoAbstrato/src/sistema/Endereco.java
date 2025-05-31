package sistema;
public class Endereco {
    private String rua;
    private String numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Endereco(String numero, String rua){
        this.numero=numero;
        this.rua= rua;
    }
    public String toString(){
        return"\n Número: "+getNumero()+
              "\n Rua: "+getRua();
    }
}
