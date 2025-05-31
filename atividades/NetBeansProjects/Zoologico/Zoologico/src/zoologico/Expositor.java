package zoologico;
public class Expositor {
    private String nome;
    private String codigo;
    private Stand stand;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }
   public Expositor(String nome, String codigo, Stand stand){
       this.nome=nome;
       this.codigo=codigo;
       this.stand=stand;
   }
   public String toString(){
       return"\n Nome: "+getNome()+
             "\n Código: "+getCodigo()+
             "\n Stand: "+getStand();
   }
}
