
package colegio_jesuitas;

public class Notas {
    
    private String idAluno;
    private double nota1;
    private double nota2;
    private double nota3;

    public Notas() {
    }

    public Notas(String idAluno, double nota1, double nota2, double nota3) {
        this.idAluno = idAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double calculaMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3)/3;
    }
    
    public String resultado(double media){
        String result = "Reprovado(a)";
        if(media >= 7){
            result = "Aprovado(a)";
        }
        return result;
    }
}
