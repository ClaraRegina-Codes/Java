package livraria;
public class Endereco {
    private String rua;
    private int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Endereco(String rua, int numero){
        this.rua=rua;
        this.numero=numero;
    }
    public String toString(){
        return "\nrua: "+getRua()+
               "\nnúmero: "+getNumero();
    }
}
