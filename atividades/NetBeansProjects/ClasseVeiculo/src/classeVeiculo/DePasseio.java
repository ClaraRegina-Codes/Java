package classeVeiculo;
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
    public DePasseio(String cor, String placa, int ano, Double preco, Proprietario proprietario, String marca, String descricao, Montadora montadora){
        super(cor, placa, ano, preco, proprietario);
        this.descricao=descricao;
        this.marca=marca;
        this.montadora=montadora;
    }
            public String toString(){
        return"\n Cor: "+getCor()+
              "\n Placa: "+getPlaca()+
              "\n Ano: "+getAno()+
              "\n Preço: "+getPreco()+
              "\n Marca "+getMarca()+
              "\n Descrição: "+getDescricao()+
              "\n Montadora: "+getMontadora()+
              "\n\n Dados do proprietário: "+getProprietario()+
              "\n IPVA: "+ipva()+
              "\n Seguro: "+seguro(); 
    }
    public Double ipva(){
        return (preco*0.03);
    }
    public Double seguro(){
        return(preco*0.15);
    }
}
