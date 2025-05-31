package classeVeiculo;
public class Moto extends Veiculo{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public Moto(String cor, String placa, int ano, Double preco, Proprietario proprietario, int cilindrada){
        super(cor, placa, ano, preco, proprietario);
        this.cilindrada=cilindrada;
    }
    public String toString(){
        return"\n Cor: "+getCor()+
              "\n Placa: "+getPlaca()+
              "\n Ano: "+getAno()+
              "\n Preço: "+getPreco()+
              "\n Cilindrada: "+getCilindrada()+
              "\n\n Dados do proprietário: "+getProprietario()+
              "\n IPVA: "+ipva()+
              "\n Seguro: "+seguro(); 
    }
    public Double ipva(){
        return (preco*0.08);
    }
    public Double seguro(){
        return(preco*0.05);
    }
}
