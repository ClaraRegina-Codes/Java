package sistema;
public class Moto extends Veiculo{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public Moto(String placa, String cor, int ano, double preco, Proprietario proprietario, int cilindrada){
        super(placa, cor, ano, preco, proprietario);
        this.cilindrada=cilindrada;
    }
    public double ipva(){
        return (preco*0.8);
    }
    public double seguro(){
        return (preco*0.5);
    }
    public String toString(){
        return"\n Placa: "+getPlaca()+
              "\n Cor: "+getCor()+
              "\n Ano: "+getAno()+
              "\n Preço: "+getPreco()+
              "\n Cilindrada: "+getCilindrada()+
              "\n IPVA: "+ipva()+
              "\n Seguro: "+seguro()+
              "\n\n Informações do proprietário: "+getProprietario();
    }
}
