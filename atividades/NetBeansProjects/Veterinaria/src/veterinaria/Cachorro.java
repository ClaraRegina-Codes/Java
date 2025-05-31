package veterinaria;
public class Cachorro extends Animal{
    private String nome;
    private Fisica fisica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
    public Cachorro(int qtdAnos, String nome, Fisica fisica){
        super(qtdAnos);
        this.nome=nome;
        this.fisica=fisica;
    }
    public String toString(){
        return"\n Nome do cachorro:  "+getNome()+
              "\n Quantidade de anos: "+getQtdAnos()+
              "\n Responsável pelo cachorro: "+getFisica();
    }
}
