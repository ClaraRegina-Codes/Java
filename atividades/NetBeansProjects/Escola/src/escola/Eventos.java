package escola;
public class Eventos extends Fornecedor{
    private String tipoEvento;

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public Eventos (String nome, String cpf, String endereco, int investimento, String tipoEvento){
        super(nome,cpf,endereco, investimento);
        this.tipoEvento=tipoEvento;
    }
     public String toString(){
        return "\n nome: "+getNome()+
                "\n CPF: "+getCpf()+
                "\n Endereço: "+getEndereco()+
                "\n investimento: "+getInvestimento()+
                "\n Tipo de evento: "+getTipoEvento();
    }           
}
