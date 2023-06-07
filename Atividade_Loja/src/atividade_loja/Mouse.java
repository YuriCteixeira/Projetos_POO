package atividade_loja;

import atividade_loja.Produto;
import atividade_loja.Produto;
import atividade_loja.Produto;

public class Mouse extends Produto {

    protected String tipo;

    public Mouse(String descricao) {
        super.setDescricao(descricao);
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return String.format("Descricao: %s", this.tipo);
    }

    void setTipo(String gamer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
