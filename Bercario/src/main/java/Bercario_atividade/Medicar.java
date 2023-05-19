package Bercario_atividade;

import java.util.Date;

public class Medicar {
    //Atributos
    Baby bebe;
    Medico medico;
    Medicamento remedio;
    float qtde_aplicada;
    Date dia_hora = new Date();
    
    //Método
    String aplicar_remedio(){
    return String.format("Prontuário do(a) paciente: \nNome da criança: %s\nNome do médico: %s\nMedicação ministrada: %s\nDose: %s\n Data e hora: %s",
            this.bebe, this.medico, this.remedio, this.qtde_aplicada, this.dia_hora);
    }
    } 
