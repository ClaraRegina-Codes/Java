package shopping;
public abstract class Setor {
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

    public abstract String toString();
}
