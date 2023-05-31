package cadastrar;


public class Funcionario extends Pessoa{
    protected float salario;
    
    
    public Funcionario(){}

    
    
    
    
    public Funcionario(String nome, Data nascimento, float salario){
        super(nome, nascimento);
        this.salario = salario;
        
    } 
    
    public float getSalario() {
        return salario;
    }

    
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    @Override
    public String ImprimeDados(){
        return String.format("Nome: %s\nData de Nascimento: %s/%s/%s\nSalario: %f\n",super.nome, this.nascimento.getDia(),this.nascimento.getMes(), this.nascimento.getAno(), this.salario);
        }
    
    public double calculaImposto (float salario){
        return salario - (salario * 0.03);
    }
}
