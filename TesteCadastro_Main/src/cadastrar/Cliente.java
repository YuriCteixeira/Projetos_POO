package cadastrar;


public class Cliente extends Pessoa{
   private int codigo;
   
    public Cliente() {
    }

    public Cliente(String nome, Data nascimento, int codigo){
        super(nome, nascimento);
        this.codigo = codigo;
        
    }
    
    public Cliente(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
   
   
   @Override
   public String ImprimeDados(){
        return String.format("Código: %d\nNome: %s\nData de Nascimento: %s/%s/%s\n",this.codigo,super.nome, this.nascimento.getDia(),this.nascimento.getMes(), this.nascimento.getAno());
        }

   
    
}
