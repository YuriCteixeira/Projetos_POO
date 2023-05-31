/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio_jesuitas;

/**
 *
 * @author programador
 */
public class Turma {
 
    private String idTurma;
    private String nomeTurma;
    

    public Turma() {
    }
    
    public Turma(String idTurma, String nomeTurma, int QtdeAlunos) {
        this.idTurma = idTurma;
        this.nomeTurma = nomeTurma;
        
    }

    public String getidTurma() {
        return idTurma;
    }

    public void setidTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getnomeTurma() {
        return nomeTurma;
    }

    public void setnomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    
}
