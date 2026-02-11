package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.IteratorWay;


public class Main {
    static void main() {
      Playlist playlist = new Playlist();
      Song plagueTaleSong = new   Song("O ma belle lune");
        plagueTaleSong.setLyrics("Ô ma belle lune Ton étreinte et ton bel amour Me rendent comme toi Forte et belle Au lever du jour\n" +
                "\n" +
                "Ô Soleil Lumineux d'en haut Par-dessus les êtres Flamboyant et beau Par-delà les mots Je te dirai tout dans ma lettre\n" +
                "\n" +
                "Ma joie et mon cœur Tu fais tout mon bonheur Ô Soleil Ô Merveille Ô Lumière Tu es pareille à ton père");
        plagueTaleSong.setDuration(20000);
        playlist.addSong(plagueTaleSong);

      Song midnightSong = new   Song("Midnight Signal");
        midnightSong.setLyrics("City lights flicker, stories untold,\n" +
                "Footsteps wander through rivers of gold.\n" +
                "Voices fading in neon skies,\n" +
                "Dreams are written where silence lies.\n" +
                "\n" +
                "Midnight calling, soft and low,\n" +
                "Hearts keep racing, don’t you know.\n" +
                "Shadows dancing, time stands still,\n" +
                "Chasing echoes beyond the hill.");
        midnightSong.setDuration(5000);
        playlist.addSong(midnightSong);

      Song horizonSong = new   Song("Crimson Horizon");
        horizonSong.setLyrics("Scarlet skies at the edge of dawn,\n" +
                "Night retreats but the fire lives on.\n" +
                "Silent roads whisper broken dreams,\n" +
                "Nothing ever is what it seems.\n" +
                "\n" +
                "Through the shadows, through the light,\n" +
                "We keep running from the night.\n" +
                "Hearts are burning, spirits rise,\n" +
                "Chasing hope across the skies.");
        horizonSong.setDuration(4800);
        playlist.addSong(horizonSong);


      Song echoSong = new Song("Echoes of Tomorrow");
        echoSong.setLyrics("Fading memories drift away,\n" +
                "Fragments lost in shades of gray.\n" +
                "Voices calling from distant years,\n" +
                "Carried softly through hopes and fears.\n" +
                "\n" +
                "Every moment, every sigh,\n" +
                "Leaves a trace as time goes by.\n" +
                "In the silence, we still borrow,\n" +
                "Dreams that wake with each tomorrow.");
        echoSong.setDuration(5200);
        echoSong.setFavourite();
        playlist.addSong(echoSong);

        playlist.playPlaylist("favorite");


    }
}
