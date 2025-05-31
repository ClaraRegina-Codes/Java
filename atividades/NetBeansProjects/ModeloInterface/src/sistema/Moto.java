package sistema;
public class Moto extends Veiculo{
    private int cilindrada;
    private String tipo; 
    private Marca marca;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Moto(int ano, String cor, String placa, Double preco, int cilindrada, String tipo, Marca marca){
        super(ano, cor, placa, preco);
        this.cilindrada=cilindrada;
        this.marca=marca;
        this.tipo=tipo;
    }
    public String toString(){
        return"\n Ano: "+getAno()+
              "\n Cor: "+getCor()+
              "\n Placa: "+getPlaca()+
              "\n Preço: "+getPreco()+
              "\n Tipo: "+getTipo()+
              "\n Cilindrada: "+getCilindrada()+
              "\n\n Informações da Marca: "+getMarca();
    }
}
