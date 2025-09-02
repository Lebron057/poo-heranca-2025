package app;

public class Tarefa extends Atividade { // Classe Tarefa recebe de herança os atibutos da classe Atividade
    private boolean isConcluido; // atributos booleanos tem como prefixos "is"

    public boolean isConcluido() { // getter
        return isConcluido;
    }
    public void setConcluido(boolean isConcluido) { // setter
        this.isConcluido = isConcluido;
    }

    public Tarefa(long id, String descricao, boolean isConcluido) {
        this.setId(id);
        this.setDescricao(descricao);
        this.setConcluido(isConcluido);
    }
}