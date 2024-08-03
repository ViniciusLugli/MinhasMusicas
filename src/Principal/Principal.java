package Principal;

import Modelos.MinhasPreferidas;
import Modelos.Musica;
import Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();
        MinhasPreferidas preferidas = new MinhasPreferidas();

        minhaMusica.setTitulo("Everlong");
        minhaMusica.setBanda("Foo Fighters");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
