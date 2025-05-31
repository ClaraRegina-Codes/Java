package shopping;
public class Locatario {
    private String nome;
    private String codigo;
    protected static double taxaCondominio;
    private Endereco endereco;
    private Contrato contrato;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTaxaCondominio() {
        return taxaCondominio;
    }

    public void setTaxaCondominio(double taxaCondominio) {
        this.taxaCondominio = taxaCondominio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    public Locatario(String nome, String codigo, double taxaCondominio, Endereco endereco, Contrato contrato){
        this.codigo=codigo;
        this.contrato=contrato;
        this.endereco=endereco;
        this.nome=nome;
        this.taxaCondominio=taxaCondominio;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Código: "+getCodigo()+
              "\n Taxa de condomínio: "+getTaxaCondominio()+
              "\n\n Endereço do locatário: "+getEndereco()+
              "\n\n Contrato do locatário: "+getContrato();
    }
}
