package disciplinaMatematica;
public class AplicacaoPratica {
    private String descricao;
    private Retangulo retangulo;
    private Quadrado quadrado;
    private Circulo circulo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Retangulo getRetangulo() {
        return retangulo;
    }

    public void setRetangulo(Retangulo retangulo) {
        this.retangulo = retangulo;
    }

    public Quadrado getQuadrado() {
        return quadrado;
    }

    public void setQuadrado(Quadrado quadrado) {
        this.quadrado = quadrado;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }
    public AplicacaoPratica(String descricao, Quadrado quadrado, Circulo circulo, Retangulo retangulo){
        this.circulo=circulo;
        this.descricao=descricao;
        this.quadrado=quadrado;
        this.retangulo=retangulo;
    }
    public String toString(){
        return"\n Descrição: "+getDescricao()+
              "\n\n Informações do círculo: "+getCirculo()+
              "\n\n Informações do retângulo: "+getRetangulo()+
              "\n\n Informações do quadrado: "+getQuadrado();
    }
}
