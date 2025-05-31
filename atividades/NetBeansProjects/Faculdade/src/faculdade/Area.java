package faculdade;
public class Area {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Area(String tipo){
        this.tipo=tipo;
    }
    public String toString(){
        return"\n Tipo: "+getTipo();
    }
}
