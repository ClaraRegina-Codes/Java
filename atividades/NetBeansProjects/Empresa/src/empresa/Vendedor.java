package empresa;
public class Vendedor extends Funcionario{
    private String setorVendas;
    private Double comissao;
    private Double totalVendido;

    public String getSetorVendas() {
        return setorVendas;
    }

    public void setSetorVendas(String setorVendas) {
        this.setorVendas = setorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }
    public Vendedor(String nome, String endereco, int matr, Double salario, String setorVendas, Double comissao, Double totalVendido){
        super(nome,endereco,matr,salario);
        this.comissao=comissao;
        this.setorVendas=setorVendas;
        this.totalVendido=totalVendido;
    }
    public String toString(){
        return"\n nome: "+getNome()+
              "\n endereço: "+getEndereco()+
              "\n matrícula: "+getMatr()+
              "\n Salário: "+getSalario()+
              "\n Setor de Vendas: "+getSetorVendas()+
              "\n Comissão: "+getComissao()+
              "\n Total vendido: "+getTotalVendido();
        
    }
}
