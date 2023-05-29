
package colegio_jesuitas;


public class Turma {
    
    private String idTurma;
    private String nomeTurma;
    private int QtdeAlunos;

    public Turma() {
    }
    
    public Turma(String idTurma, String nomeTurma, int QtdeAlunos) {
        this.idTurma = idTurma;
        this.nomeTurma = nomeTurma;
        this.QtdeAlunos = QtdeAlunos;
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getQtdeAlunos() {
        return QtdeAlunos;
    }

    public void setQtdeAlunos(int QtdeAlunos) {
        this.QtdeAlunos = QtdeAlunos;
    }
    
    
    
}
