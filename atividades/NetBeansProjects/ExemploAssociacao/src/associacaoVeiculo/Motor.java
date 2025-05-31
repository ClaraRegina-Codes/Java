package associacaoVeiculo;
public class Motor {
    private Double potencia;
    private String tipoCombustivel;
    
    //Getter e Setter:
    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    
    //Construtor da classe fragmento Motor
    public Motor(Double potencia, String tipoCombustivel){
        this.potencia=potencia;
        this.tipoCombustivel=tipoCombustivel;
    }
    
    
    //Método toString para imprimir dados genéricos
    //a especificação dos dados ocorre na classe todo
    public String toString(){
        return "\n potência: "+getPotencia()+
               "\n tipo de combustível: "+getTipoCombustivel();
    }
}
