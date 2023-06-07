package atividade_loja;

public class Livro extends Produto {

    protected String autor;

    public Livro(String descricao) {
        super.setDescricao(descricao);
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return String.format("Descricao: %s", this.autor);
    }

    
}
