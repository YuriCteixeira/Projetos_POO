package atividade_loja;

class Mouse extends Produto {

    private String tipo;

    public Mouse(String descricao, String tipo) {
        super.setDescricao(descricao);
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return String.format("Descricao: %s", this.tipo);
    }
}
