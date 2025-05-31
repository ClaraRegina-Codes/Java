package exemploClasseAbstrataPessoa;
public class Professor extends Pessoa{
    //herdando a classe abstrata pessoa
    
    //atributos da classe espécie
    private String titulo;
    private String areaAtuacao;

    //métodos GETe SET 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    public Professor(String nome, double gratificacao, double salario, Filiacao filiacao, String titulo, String areaAtuacao){
        super(nome, gratificacao, salario, filiacao);
        this.areaAtuacao=areaAtuacao;
        this.titulo=titulo;
    }
    //método herdado da classe abstrata, escrito da mesma maneira e aplicado uma instrução
    //as variáveis usadas no método herdado devem ser do tipo protect na classe abstrata
    public double salarioFinal(){
        return (salario +(salario*0.1)+gratificacao);
    }
    public String toString(){
        return"\n Dados do professor: "+
              "\n Nome: "+getNome()+
              "\n Dados da Filiação: "+getFiliacao()+
              "\n Título: "+getTitulo()+
              "\n Área de atuação: "+getAreaAtuacao()+
              "\n Salário: "+getSalario()+
              "\n Salário final: "+salarioFinal(); //não tem get, pois o método não tem get
    }
   
}
