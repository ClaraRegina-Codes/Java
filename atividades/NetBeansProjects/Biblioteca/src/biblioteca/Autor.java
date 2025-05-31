package biblioteca;
public class Autor {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Autor(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n CPF "+getCpf();
    }
}
