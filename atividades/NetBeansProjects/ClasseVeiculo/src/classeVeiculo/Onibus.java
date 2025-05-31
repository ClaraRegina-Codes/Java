package classeVeiculo;
public class Onibus extends Veiculo{
    private int qtdPassageiros;
    private Montadora montadora;

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    public Onibus(String cor, String placa, int ano, Double preco, Proprietario proprietario, int qtdPassageiros, Montadora montadora){
        super(cor, placa, ano, preco, proprietario);
        this.montadora=montadora;
        this.qtdPassageiros=qtdPassageiros;
    }
        public String toString(){
        return"\n Cor: "+getCor()+
              "\n Placa: "+getPlaca()+
              "\n Ano: "+getAno()+
              "\n Preço: "+getPreco()+
              "\n Quantidade de passageiros: "+getQtdPassageiros()+
              "\n Montadora: "+getMontadora()+
              "\n\n Dados do proprietário: "+getProprietario()+
              "\n IPVA: "+ipva()+
              "\n Seguro: "+seguro(); 
    }
    public Double ipva(){
        return (preco*0.05);
    }
    public Double seguro(){
        return(preco*0.25);
    }
}
