package cadastrar;


public class Gerente extends Funcionario{
    private String area;

    public Gerente() {
    }
    
    public Gerente(String nome, Data nascimento, float salario, String area){
        super(nome, nascimento, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    @Override
     public String ImprimeDados(){
        return String.format("Nome: %s\nData de Nascimento: %s/%s/%s\nSalario: %f\nÁrea: %s\n",super.nome, this.nascimento.getDia(),this.nascimento.getMes(), this.nascimento.getAno(),this.getSalario());
        }
    @Override
    public double calculaImposto (float salario){
        return salario - (salario * 0.05);
    }
}
