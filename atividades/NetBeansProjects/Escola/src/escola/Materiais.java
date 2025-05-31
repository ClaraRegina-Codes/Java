package escola;
public class Materiais extends Fornecedor{
    private String material;
    private int quantidade;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Materiais(String nome, String cpf, String endereco, int investimento, String material, int quantidade){
        super(nome,cpf,endereco, investimento);
        this.material=material;
        this.quantidade=quantidade;
    }
    
}
