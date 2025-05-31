package sistema;
public class Tenis extends Calcado implements Custo{
    private String marca;
    private int tamanho;
    protected static double precoTenis;
    private DeSapatoFeminino deSapatoFeminino;
    private DeSapatoMasculino deSapatoMasculino;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPrecoTenis() {
        return precoTenis;
    }

    public void setPrecoTenis(double precoTenis) {
        this.precoTenis = precoTenis;
    }

    public DeSapatoFeminino getDeSapatoFeminino() {
        return deSapatoFeminino;
    }

    public void setDeSapatoFeminino(DeSapatoFeminino deSapatoFeminino) {
        this.deSapatoFeminino = deSapatoFeminino;
    }

    public DeSapatoMasculino getDeSapatoMasculino() {
        return deSapatoMasculino;
    }

    public void setDeSapatoMasculino(DeSapatoMasculino deSapatoMasculino) {
        this.deSapatoMasculino = deSapatoMasculino;
    }
    public Tenis(String modelo, String codigo, String marca, int tamanho, double precoTenis, DeSapatoFeminino deSapatoFeminino, DeSapatoMasculino deSapatoMasculino){
        super(modelo, codigo);
        this.deSapatoFeminino=deSapatoFeminino;
        this.deSapatoMasculino=deSapatoMasculino;
        this.marca=marca;
        this.precoTenis=precoTenis;
        this.tamanho=tamanho;
    }
    public String toString(){
       return"\n Modelo: "+getModelo()+
             "\n Marca: "+getMarca()+
             "\n Código: "+getCodigo()+
             "\n Tamanho: "+getTamanho()+
             "\n Preço tênis: "+getPrecoTenis()+
             "\n Preço final: "+precoFinal()+
             "\n Cálculo do valor de custo: "+calculaValorCusto();
    }
    public double precoFinal(){
       return(precoTenis+(precoTenis*0.27)); 
    }
    public double calculaValorCusto(){
       return(precoFinal()-(precoFinal()*PERCTENIS)); 
    }
}
