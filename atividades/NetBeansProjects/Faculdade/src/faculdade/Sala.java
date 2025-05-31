package faculdade;
public class Sala {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Sala(int numero){
        this.numero=numero;
    }
    public String toString(){
        return"\n Número: "+getNumero();
    }
}
