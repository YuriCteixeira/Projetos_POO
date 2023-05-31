package colegio_jesuitas;


public class Alunos_turma {
    Turma idTurma;
    Aluno idAluno;

    public Alunos_turma() {
    }

    public Alunos_turma(Turma idTurma, Aluno idAluno) {
        this.idTurma = idTurma;
        this.idAluno = idAluno;
    }
    
    //Métodos
    public void alocarAluno(){}
    public void excluirAluno(){}
    public void transferirAluno(){}
    public String imprimir_info() {
        return String.format("Turma %s -> %s\nLista de Alunos:\nMatrícula do aluno:  %s\nNome do Aluno: %s\nnota1: %f\nnota2: %f\nnota3: %f\nmedia: %f\nSituação:",
                this.getidTurma(), this.getnomeTurma(), this.getidAluno(), this.getnota1, this.getnota2, this.getnota3);
    }
}
