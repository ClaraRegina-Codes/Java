package sistema;
public class Sandalia extends Calcado implements Custo{
    private String material;
    private String cor;
    protected static double precoSandalia;
    private DeSapatoFeminino deSapatoFeminino;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoSandalia() {
        return precoSandalia;
    }

    public void setPrecoSandalia(double precoSandalia) {
        this.precoSandalia = precoSandalia;
    }

    public DeSapatoFeminino getDeSapatoFeminino() {
        return deSapatoFeminino;
    }

    public void setDeSapatoFeminino(DeSapatoFeminino deSapatoFeminino) {
        this.deSapatoFeminino = deSapatoFeminino;
    }
    public Sandalia(String modelo, String codigo, String cor, String material, double precoSandalia, DeSapatoFeminino deSapatoFeminino){
        super(modelo, codigo);
        this.cor=cor;
        this.deSapatoFeminino=deSapatoFeminino;
        this.material=material;
        this.precoSandalia=precoSandalia;
    }
    public String toString(){
       return"\n Modelo: "+getModelo()+
             "\n Cor: "+getCor()+
             "\n Código: "+getCodigo()+
             "\n Material: "+getMaterial()+
             "\n Preço sandália: "+getPrecoSandalia()+
             "\n Preço final: "+precoFinal()+
             "\n Cálculo do valor de custo: "+calculaValorCusto(); 
    }
    public double precoFinal(){
        return(precoSandalia+(precoSandalia*PERCSANDALIA));
    }
    public double calculaValorCusto(){
       return(precoFinal()-(precoFinal()*PERCSANDALIA)); 
    }
}
