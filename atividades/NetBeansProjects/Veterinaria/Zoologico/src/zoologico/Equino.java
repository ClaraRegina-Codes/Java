package zoologico;
public class Equino extends Galpao{
    private String descricao;
    private int qtdAnimal;
    private AnimalEquino animalEquino;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdAnimal() {
        return qtdAnimal;
    }

    public void setQtdAnimal(int qtdAnimal) {
        this.qtdAnimal = qtdAnimal;
    }

    public AnimalEquino getAnimalEquino() {
        return animalEquino;
    }

    public void setAnimalEquino(AnimalEquino animalEquino) {
        this.animalEquino = animalEquino;
    }
    public Equino(int numero, Double largura, Double comprimento, Expositor expositor, Visitante visitante, String descricao, int qtdAnimal, AnimalEquino animalEquino){
        super(numero,largura,comprimento,expositor,visitante);
        this.descricao=descricao;
        this.qtdAnimal=qtdAnimal;
        this.animalEquino=animalEquino;
    }
    public String toString(){
        return"\n Descrição: "+getDescricao()+
              "\n Qunatidade de animais: "+getQtdAnimal()+
              "\n Número: "+getNumero()+
              "\n Comprimento: "+getComprimento()+
              "\n Largura: "+getLargura()+
              "\n Expositor: "+getExpositor()+
              "\n Visitante: "+getVisitante()+
              "\n Animal Equino: "+getAnimalEquino();
    }
}
