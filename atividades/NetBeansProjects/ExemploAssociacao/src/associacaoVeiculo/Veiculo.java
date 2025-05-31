package associacaoVeiculo;
public class Veiculo {
    //transformando uma classe fragmento em atributo da classe todo, associações
    private String placa;
    private String cor;
    private Motor motor;
    private Roda roda;
    private Porta porta;

    //Getter e Setter de todos os atributos, inclusive os atributos classes fragmentos
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }
    //construtor de agregação, não houve instância das classes fragmentos em objetos
    public Veiculo(String placa, String cor, Motor motor, Roda roda, Porta porta){
        this.placa=placa;
        this.cor=cor;
        this.motor=motor;
        this.porta=porta;
        this.roda=roda;
        
    }
    //imprime os dados de maneira personalizada, exemplo especifica que a roda é do veículo
    public String toString(){
        return"dados do veículo: "+
                "\n placa: "+getPlaca()+
                "\n cor: "+getCor()+
                "\n motor do veículo: "+getMotor()+
                "\n roda do veículo: "+getRoda()+
                "\n porta do veículo: "+getPorta();
    }
}
