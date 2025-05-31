package sistema;
public abstract class Fornecedor {
    private String nome;
    protected static double totalArrecadado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setTotalArrecadado(double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }
    public Fornecedor(String nome, double totalArrecadado){
        this.nome=nome;
        this.totalArrecadado=totalArrecadado;
    }
    public abstract String toString();
    
}
