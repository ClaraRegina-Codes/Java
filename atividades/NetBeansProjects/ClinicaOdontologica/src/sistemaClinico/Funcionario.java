package sistemaClinico;
public class Funcionario {
    private String nome;
    private Endereco endereco;
    private Cargo cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public Funcionario(String nome, Endereco endereco, Cargo cargo){
        this.nome=nome;
        this.endereco=endereco;
        this.cargo=cargo;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Endereço: "+getEndereco()+
              "\n Cargo: "+getCargo();
    }

}
