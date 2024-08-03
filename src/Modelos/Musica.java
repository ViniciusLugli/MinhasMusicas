package Modelos;

public class Musica extends Audio{
    private String album;
    private String banda;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public double getClassificacao() {
        if (getTotalReproducoes() >  2000){
            return 10;
        } else {
            return 7;
        }
    }
}
