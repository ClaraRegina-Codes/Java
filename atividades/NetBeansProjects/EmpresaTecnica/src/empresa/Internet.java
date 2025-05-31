package empresa;
public class Internet extends Servico implements HoraExtra{
    private double valorHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public Internet(String nome, double valorHora){
        super(nome);
        this.valorHora=valorHora;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Valor Hora: "+getValorHora()+
              "\n Quantidade de hora extra: "+qtdHoraExtra+
              "\n Valor da hora extra: "+valorHoraExtra+
              "\n Total a pagar: "+totalPagar();
    }
    public double totalPagar() {
        return (valorHora*qtdHoraExtra);
    }
    
    
}
