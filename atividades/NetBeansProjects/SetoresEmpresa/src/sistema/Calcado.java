package sistema;
public abstract class Calcado {
    private String codigo;
    private String modelo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Calcado(String modelo, String codigo){
        this.codigo=codigo;
        this.modelo=modelo;
    }
    public abstract String toString();
    public abstract double precoFinal();
}
