package shopping;
public class Contrato {
    private int numero;
    protected static double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public Contrato(int numero, double valor){
        this.numero=numero;
        this.valor=valor;
    }
    public String toString(){
        return"\n Número: "+getNumero()+
              "\n Valor: "+getValor();
    }
    public static double calculaValorFinal(){
        return (valor+Box.valorAluguel+Locatario.taxaCondominio);
    }
    
}
