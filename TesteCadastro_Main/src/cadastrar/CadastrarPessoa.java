package cadastrar;

import java.util.ArrayList;

public class CadastrarPessoa {
    private int qtdAtual;
    ArrayList<Pessoa> cdpessoas = new ArrayList<>();
    public CadastrarPessoa() {
    }

    public CadastrarPessoa(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    
    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    
    public void setCadastraPessoa(Pessoa pess){
    this.cdpessoas.add(pess);
    this.qtdAtual = this.cdpessoas.size();
    }
    
    public void ImprimeCadastro(){
        for(int i = 0;i < cdpessoas.size();i++){
            System.out.println(cdpessoas.get(i).ImprimeDados());
        }
        
    }
}
