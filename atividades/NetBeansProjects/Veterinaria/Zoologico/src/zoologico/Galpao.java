package zoologico;
public class Galpao {
    private int numero;
    private Double largura;
    private Double comprimento;
    private Visitante visitante;
    private Expositor expositor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Expositor getExpositor() {
        return expositor;
    }

    public void setExpositor(Expositor expositor) {
        this.expositor = expositor;
    }
    public Galpao(int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante){
        this.numero=numero;
        this.comprimento=comprimento;
        this.largura=largura;
        this.expositor=expositor;
        this.visitante=visitante;
    }

}
