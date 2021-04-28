package sample.model;

import java.util.ArrayList;
import java.util.List;

/** Classes **/

public class Receita {
    private String nome;
    private String descricao;
    private List<Ingrediente> ingredientes;

    /** Getter e Setter **/

    public Receita() { ingredientes = new ArrayList<>();}
    public List<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    public void setIngrediente(String nome, double qtde, String unidadeMedida){
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome(nome);
        ingrediente.setQtde(qtde);
        ingrediente.setUnidadeMedida(unidadeMedida);
        ingredientes.add(ingrediente);
    }

    public void setIngredientes(Ingrediente ingrediente){
        this.ingredientes = ingredientes;

    }

    public void setNome(String nome) {this.nome = nome;}

    public String getNome() {return nome;}

    public void setDescricao(String descricao){this.descricao = descricao;}

    public String getDescricao() {return descricao;}

    /** ToString **/

    @Override
    public String toString() {
        return "Receita{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}

