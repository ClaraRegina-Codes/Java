package sistema;
public class Vendedor extends Funcionario implements CalculaSalario{
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public Vendedor(String nome, String matr, String setor){
        super(nome, matr);
        this.setor=setor;
    }
    public double salarioReceber(){
        return(SALARIO + (Cliente.totalPagar() * 0.15) + AUXTRANSPORTE);
    }
    public String toString(){
       return"\n Nome: "+getNome()+
             "\n Matrícula: "+getMatr()+
             "\n Setor: "+getSetor()+
             "\n Salário: "+SALARIO+
             "\n Aux. Transporte: "+AUXTRANSPORTE+
             "\n Salário a receber: "+salarioReceber();
    }


    
}
