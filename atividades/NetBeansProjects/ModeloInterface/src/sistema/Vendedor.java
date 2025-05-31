package sistema;
public class Vendedor implements SalarioVendedor{
    private String matr;
    private String nome;
    private Double salario;
    private Double totalVendas;
    private Moto moto;
    private Carro carro;
    private Endereco endereco;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Vendedor(String nome, String matr, Double salario, Double totalVendas, Endereco endereco, Carro carro, Moto moto){
        this.nome=nome;
        this.carro=carro;
        this.endereco=endereco;
        this.matr=matr;
        this.moto=moto;
        this.salario=salario;
        this.totalVendas=totalVendas;
    }
    public double Comissao(){
        return(totalVendas*20);
    }
    public double SalarioFinal(){
        return(salario+Comissao());
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatr()+
              "\n Salário: "+getSalario()+
              "\n Total vendas: "+getTotalVendas()+
              "\n Comissão: "+Comissao()+
              "\n Salário final: "+SalarioFinal()+
              "\n\n Endereço do vendedor: "+getEndereco()+
              "\n\n Informações do carro: "+getCarro()+
              "\n\n Informações da moto: "+getMoto();
    }
}
