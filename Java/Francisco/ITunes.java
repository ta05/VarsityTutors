public class ITunes {
    public static void main(String[] args) {
        Playlist pl = new Playlist();
        pl.addLast("Joe Rogan", 55.5);
        pl.add("Conspiracy", 45.3, 1);
        pl.addFirst("Serial", 48.9);
        pl.addLast("Mythology", 42.6);

        pl.displayPlaylistForward();

        pl.add("Tales", 39.7, 3);

        pl.displayPlaylistBackward();

        pl.deleteFirst();
        pl.deleteLast();

        pl.displayPlaylistForward();

        pl.add("Historical Figures", 42.0, 2);
        pl.add("Cults", 41.8, 0);
        pl.add("Serial Killers", 45.3, 4);

        pl.deleteEpisode("Conspiracy");
        pl.deleteEpisode("Hunger");

        pl.displayPlaylistForward();

        System.out.println(pl.deleteEveryNthEpisode(5));
    }
}
