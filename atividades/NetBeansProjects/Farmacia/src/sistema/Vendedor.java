package sistema;
public class Vendedor extends Funcionario implements PercentInss, Pagamento{
    private int idade;
    private Cliente cliente;
    private Medicamento medicamento;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public Vendedor(String nome, String matr, double salario, Endereco endereco, int idade, Cliente cliente, Medicamento medicamento){
        super(nome, matr, salario, endereco);
        this.idade=idade;
        this.cliente=cliente;
        this.medicamento=medicamento;
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatr()+
              "\n Idade: "+getIdade()+
              "\n Salário: "+getSalario()+
              "\n INSS: "+Inss()+
              "\n Comissão: "+comissao()+
              "\n Salário final: "+salarioFinal()+
              "\n\n Informações do endereço: "+getEndereco()+
              "\n\n Informações do cliente: "+getCliente()+
              "\n\n Informações do medicamento: "+getMedicamento();
    }
    public double Inss(){
       return(salario*PERCVENDEDOR); 
    }
    public double comissao(){
        return(DoCliente.preco*PERCVENDEDOR);
    }
    public double salarioFinal(){
        return(salario+comissao()-(salario*PERCVENDEDOR));
    }
}
