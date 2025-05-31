package sistema;
public class Cliente implements QtdProduto{
    private String cpf;
    private String nome;
    private Vendedor vendedor;
    private Sandalia sandalia;
    private Tenis tenis;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Sandalia getSandalia() {
        return sandalia;
    }

    public void setSandalia(Sandalia sandalia) {
        this.sandalia = sandalia;
    }

    public Tenis getTenis() {
        return tenis;
    }

    public void setTenis(Tenis tenis) {
        this.tenis = tenis;
    }
    public Cliente(String nome, String cpf, Vendedor vendedor, Tenis tenis, Sandalia sandalia){
        this.cpf=cpf;
        this.nome=nome;
        this.sandalia=sandalia;
        this.vendedor=vendedor;
        this.tenis=tenis;
    }
    public static double totalPagar(){
        return(QTDTENIS*(Tenis.precoTenis+(Tenis.precoTenis*0.27))+(QTDSANDALIA*(Sandalia.precoSandalia+(Sandalia.precoSandalia*0.31))));
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF: "+getCpf()+
              "\n\n Informações do vendedor: "+getVendedor()+
              "\n\n Informações de Tênis: "+getTenis()+
              "\n\n Informações da sandália: "+getSandalia();
    }
}
