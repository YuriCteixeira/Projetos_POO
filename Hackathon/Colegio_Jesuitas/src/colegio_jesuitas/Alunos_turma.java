
package colegio_jesuitas;

public class Alunos_turma {
    
    private String idTurma;
    private String idAluno;

    public Alunos_turma() {
    }

    public Alunos_turma(String idTurma, String idAluno) {
        this.idTurma = idTurma;
        this.idAluno = idAluno;
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }
    
    public void alocarAluno(String idAluno, String idTurma){
        setIdTurma(idTurma);
        setIdAluno(idAluno);
    }
    
}
