import br.com.alura.desafio.audio.Musica;
import br.com.alura.desafio.audio.Podcast;

public class Principal {

    public static void main(String[] args) {
        //testando a musica e metodos
        Musica musica = new Musica();
        musica.setArtista("blackbear");
        musica.setAlbum("Dead Roses");
        musica.setTitulo("IDFC");
        musica.setDuracaoEmMinutos(3.2);

        musica.curtir();
        musica.curtir();
        musica.reproduz();
        musica.reproduz();
        musica.reproduz();
        musica.classifica();

        System.out.println("A musica " + musica.getTitulo() + " do album " + musica.getAlbum() + " do cantor(a) "
                + musica.getArtista() + " tem " +musica.getDuracaoEmMinutos() + ", " + musica.getTotalDeReproducoes()
                + " reproduções, " + musica.getCurtidas() + " curtidas e está em " + musica.getClassificacao()
                + "º lugar nas paradas");

        //testando o podcast e metodos
        Podcast podcast = new Podcast();
        podcast.setTitulo("NãoPodCast");
        podcast.setDescricao("Um lugar onde não pode nada");
        podcast.setHost("Big Smoke");
        podcast.setDuracaoEmMinutos(60);

        podcast.curtir();
        podcast.curtir();
        podcast.curtir();
        podcast.reproduz();
        podcast.reproduz();
        podcast.reproduz();
        podcast.classifica();

        System.out.println("O podcast " + podcast.getTitulo() + ", que é hosteado pelo " + podcast.getHost() + ", tem "
        + podcast.getDuracaoEmMinutos() + " por episodio e está no top " + podcast.getClassificacao() + " entre os podcasts mais ouvidos com "
        + musica.getTotalDeReproducoes() + " reproduções");
    }
}
