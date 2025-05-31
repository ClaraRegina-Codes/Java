package sistema;
public class Carro extends Veiculo{
    private String qtdPortas;
    private Double potencia;
    private Marca marca;

    public String getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(String qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Carro(int ano, String cor, String placa, Double preco, String qtdPortas, Double potencia, Marca marca){
        super(ano, cor, placa, preco);
        this.marca=marca;
        this.potencia=potencia;
        this.qtdPortas=qtdPortas;
    }
    public String toString(){
        return"\n Ano: "+getAno()+
              "\n Cor: "+getCor()+
              "\n Placa: "+getPlaca()+
              "\n Preço: "+getPreco()+
              "\n Quantidade de portas: "+getQtdPortas()+
              "\n Potência: "+getPotencia()+
              "\n\n Informações da Marca: "+getMarca();
    }
}
