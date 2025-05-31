package shopping;
public class Setor {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Setor(int numero){
        this.numero=numero;
    }
    public String toSring(){
        return"\n Número do setor: "+getNumero();
    }
}
