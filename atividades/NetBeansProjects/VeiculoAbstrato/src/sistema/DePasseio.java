package sistema;
public class DePasseio extends Veiculo{
    private String marca;
    private String descricao;
    private Montadora montadora;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    public DePasseio(String placa, String cor, int ano, double preco, Proprietario proprietario, String marca, String descricao, Montadora montadora){
        super(placa, cor, ano, preco, proprietario);
        this.descricao=descricao;
        this.marca=marca;
        this.montadora=montadora;
    }
    public double ipva(){
        return (preco*0.03);
    }
    public double seguro(){
        return (preco*0.15);
    }
    public String toString(){
        return"\n Placa: "+getPlaca()+
              "\n Cor: "+getCor()+
              "\n Ano: "+getAno()+
              "\n Preço: "+getPreco()+
              "\n Marca: "+getMarca()+
              "\n Descrição: "+getDescricao()+
              "\n IPVA: "+ipva()+
              "\n Seguro: "+seguro()+
              "\n\n Informações do proprietário: "+getProprietario();
    }
}
