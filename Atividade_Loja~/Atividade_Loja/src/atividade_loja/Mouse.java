<<<<<<< HEAD:Atividade_Loja~/Atividade_Loja/src/atividade_loja/Mouse.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_loja;

/**
 *
 * @author programador
 */
public class Mouse {
    
=======
package colegio_jesuitas;


public class Notas {
private Aluno idAluno;
private float nota1;   
private float nota2; 
private float nota3; 

    public Notas() {
    }

    public Notas(Aluno idAluno, float nota1, float nota2, float nota3) {
        this.idAluno = idAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Aluno getIdAluno() {
        return idAluno;
    }

    public void setidAluno(Aluno idAluno) {
        this.idAluno = idAluno;
    }

    public float getnota1() {
        return nota1;
    }

    public void setnota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getnota2() {
        return nota2;
    }

    public void setnota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getnota3() {
        return nota3;
    }

    public void setnota3(float nota3) {
        this.nota3 = nota3;
    }

    //Métodos
    public void cadastrarNotas(){}
    public void editarNotas(){}
    public void deletarNotas(){}
    public float calcularMedia(Aluno idAluno, float nota1, float nota2, float nota3){
       return (nota1 + nota2 + nota3)/3;
    }

>>>>>>> 0e40e21f366faabba4cd64db3feecdff3f03f1cb:Colegio_Jesuitas/src/colegio_jesuitas/Notas.java
}
