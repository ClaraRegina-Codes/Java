package sistema;
public class DeSapatoFeminino extends Fornecedor implements Imposto{
    private String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    public DeSapatoFeminino(String nome, double totalArrecadado, String faixaEtaria){
        super(nome, totalArrecadado);
        this.faixaEtaria=faixaEtaria;
    }
    
    public double CalculaImposto(){
        return(totalArrecadado * TARIFAF);
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Total arrecadado: "+getTotalArrecadado()+
              "\n Faixa etária: "+getFaixaEtaria()+
              "\n Cálculo do imposto: "+CalculaImposto();
    }
}
