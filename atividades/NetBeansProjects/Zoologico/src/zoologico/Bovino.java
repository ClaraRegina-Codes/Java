package zoologico;
public class Bovino extends Galpao {
    private String descricao;
    private AnimalBovino animalBovino;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AnimalBovino getAnimalBovino() {
        return animalBovino;
    }

    public void setAnimalBovino(AnimalBovino animalBovino) {
        this.animalBovino = animalBovino;
    }
    public Bovino(int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante, String descricao, AnimalBovino animalBovino){
        super(numero,largura,comprimento,expositor,visitante);
        this.descricao=descricao;
        this.animalBovino=animalBovino;
    }
    public String toString(){
        return"\n Descrição: "+getDescricao()+
              "\n Número: "+getNumero()+
              "\n Comprimento: "+getComprimento()+
              "\n Largura: "+getLargura()+
              "\n Expositor: "+getExpositor()+
              "\n Visitante: "+getVisitante()+
              "\n Animal Bovino: "+getAnimalBovino();
    }
}
