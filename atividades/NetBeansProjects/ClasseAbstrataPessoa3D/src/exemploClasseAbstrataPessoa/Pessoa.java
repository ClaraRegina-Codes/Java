package exemploClasseAbstrataPessoa;
public abstract class Pessoa {
    //classe modelo, abstrata, não é instanciada na classe principal
    
    private String nome;
    protected double gratificacao; //use protected para manipular essa variável na classe espécie
    protected double salario;
    private Filiacao filiacao; //fragmento
    
    
    //métodos GET e SET são concretos, NÃO coloque o modificador abstract
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
    
    //construtor (NÃO coloque o modificador abstract
    public Pessoa(String nome, double gratificacao, double salario, Filiacao filiacao){
        this.filiacao=filiacao;
        this.gratificacao=gratificacao;
        this.nome=nome;
        this.salario=salario;
    }
    //método abstrato não possui instruções;
    public abstract double salarioFinal();
}
