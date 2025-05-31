package mercado;
public class Frito extends Salgado{
    private String tempoDeMassa;

    public String getTempoDeMassa() {
        return tempoDeMassa;
    }

    public void setTempoDeMassa(String tempoDeMassa) {
        this.tempoDeMassa = tempoDeMassa;
    }
    
    public Frito(String dataFabricacao, String dataValidade, int codigo, String nome, Double quantidade, String tempoDeMassa){
        super (dataFabricacao, dataValidade, codigo, nome, quantidade);
        this.tempoDeMassa=tempoDeMassa;
    }
      public String toString(){
        return"\n nome: "+getNome()+
               "\n código: "+getCodigo()+
                "\n quantidade: "+getQuantidade()+
                "\n tempo de massa: "+getTempoDeMassa()+
                "\n data de validade: "+getDataValidade()+
                "\n data de fabricação: "+getDataFabricacao();
      }   
}
