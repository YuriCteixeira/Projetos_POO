
package colegio_jesuitas;


public class Aluno {
    private String idAluno;
    private String nome;
    
    public Aluno(){
        
    }

    public Aluno(String idAluno, String nome) {
        this.idAluno = idAluno;
        this.nome = nome;
    }

    public String getidAluno() {
        return idAluno;
    }

    public void setidAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }
}
