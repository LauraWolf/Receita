package sample.model;

public class Ingrediente {
    private String nome;
    private double qtde;
    private String unidadeMedida;

    public void setNome(String nome){this.nome = nome;}

    public String getNome() {return nome;}

    public void setQtde(double qtde){ this.qtde = qtde;}

    public double getQtde() {return this.qtde;}

    public void setUnidadeMedida(String unidadeMedida){this.unidadeMedida = unidadeMedida;}

    public String getUnidadeMedida() {return unidadeMedida;}

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", qtde=" + qtde +
                ", um='" + unidadeMedida + '\'' +
                '}';
    }
}
