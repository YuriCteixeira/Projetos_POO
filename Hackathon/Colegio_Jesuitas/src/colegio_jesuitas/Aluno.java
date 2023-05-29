/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio_jesuitas;

/**
 *
 * @author programador
 */
public class Aluno {
    
    private String idAluno;
    private String nome;
    
    public Aluno(){
        
    }

    public Aluno(String idAluno, String nome) {
        this.idAluno = idAluno;
        this.nome = nome;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
