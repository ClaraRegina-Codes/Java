package sistema;
public class Onibus extends Veiculo {
    private Montadora montadora;
    private int qtdPassageiros;

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    public Onibus(String placa, String cor, int ano, double preco, Proprietario proprietario, Montadora montadora, int qtdPassageiros){
        super(placa, cor, ano, preco, proprietario);
        this.qtdPassageiros=qtdPassageiros;
        this.montadora=montadora;
    }
    public double ipva(){
        return (preco*0.5);
    }
    public double seguro(){
        return (preco*0.25);
    }
    public String toString(){
        return"\n Placa: "+getPlaca()+
              "\n Cor: "+getCor()+
              "\n Ano: "+getAno()+
              "\n Preço: "+getPreco()+
              "\n IPVA: "+ipva()+
              "\n Seguro: "+seguro()+
              "\n Quantidade de passageiros: "+getQtdPassageiros()+
              "\n\n Informações da montadora: "+getMontadora()+
              "\n\n Informações do proprietário: "+getProprietario();
    }
    
}
