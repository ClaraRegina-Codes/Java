package sistema;
public class Aluno implements Media, MediaAprovacao{
     private String matr;
     private String nome;
     private DeRadiologia deRadiologia;
     private Endereco endereco;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DeRadiologia getDeRadiologia() {
        return deRadiologia;
    }

    public void setDeRadiologia(DeRadiologia deRadiologia) {
        this.deRadiologia = deRadiologia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Aluno(String nome, String matr, Endereco endereco, DeRadiologia deRadiologia){
        this.deRadiologia=deRadiologia;
        this.endereco=endereco;
        this.matr=matr;
        this.nome=nome;
    }
    
    public double MediaFinalAluno(){
        return((Curso.nota1+Curso.nota2+Curso.nota3)/3);
    }
    
    public String Resultado(){
        Double res = MediaFinalAluno();
        if(res>=MEDIAFINAL){
            return "Aprovado";
        }else{
            return"Reprovado";
        }
    }
    public String toString(){
        return"\n Nome: "+getNome()+
              "\n Matrícula: "+getMatr()+
              "\n Média final: "+MediaFinalAluno()+
              "\n Situação: "+Resultado()+
              "\n\n Endereço do aluno: "+getEndereco()+
              "\n\n Informações do curso de radiologia: "+getDeRadiologia();
    }
}
