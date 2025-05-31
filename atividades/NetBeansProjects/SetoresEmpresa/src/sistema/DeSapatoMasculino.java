package sistema;
public class DeSapatoMasculino extends Fornecedor implements Imposto{
    private String estilo;
    private String telefone;

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public DeSapatoMasculino (String nome, double totalArrecadado, String estilo, String telefone){
        super(nome, totalArrecadado);
        this.estilo=estilo;
        this.telefone=telefone;

    }
    public double CalculaImposto(){
        return(totalArrecadado * TARIFAM);
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Total arrecadado: "+getTotalArrecadado()+
              "\n Estilo: "+getEstilo()+
              "\n Telefone: "+getTelefone()+
              "\n Cálculo do imposto: "+CalculaImposto();
               
    }
}
