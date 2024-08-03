package Modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;
    private double duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void curte(){
        totalCurtidas++;
    }

    public void reproduz(){
        totalReproducoes++;
    }

}
