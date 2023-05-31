package atividade_loja;

class Livro extends Produto {

    private String autor;

    public Livro(String descricao, String autor) {
        super.setDescricao(descricao);
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return String.format("Descricao: %s", this.autor);
    }
}
