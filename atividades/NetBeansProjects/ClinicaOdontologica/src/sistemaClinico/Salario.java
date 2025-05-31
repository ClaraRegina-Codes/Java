package sistemaClinico;
public class Salario {
    private Double valor;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Salario(Double valor){
        this.valor=valor;
    }
    public String toString(){
        return"\n Valor: "+getValor();
    }
}
