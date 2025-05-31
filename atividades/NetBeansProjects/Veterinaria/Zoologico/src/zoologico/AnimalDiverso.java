package zoologico;
public class AnimalDiverso extends Galpao{
    private String nome;
    private Gato gato;
    private Cachorro cachorro;
    private Ovelha ovelha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Ovelha getOvelha() {
        return ovelha;
    }

    public void setOvelha(Ovelha ovelha) {
        this.ovelha = ovelha;
    }
    public AnimalDiverso(int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante, String nome, Gato gato, Cachorro cachorro, Ovelha ovelha){
        super(numero, largura, comprimento, expositor, visitante);
        this.nome=nome;
        this.cachorro=cachorro;
        this.gato=gato;
        this.ovelha=ovelha;
        
    }
        public String toString(){
        return"\n Nome: "+getNome()+
              "\n Número: "+getNumero()+
              "\n Comprimento: "+getComprimento()+
              "\n Largura: "+getLargura()+
              "\n Expositor: "+getExpositor()+
              "\n Visitante: "+getVisitante()+
              "\n Gato: "+getGato()+
              "\n Cachorro: "+getCachorro()+
              "\n Ovelha: "+getOvelha();
    }
}
