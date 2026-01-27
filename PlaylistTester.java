/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...`
         */
        p.add(new Song("fur elise", "Beethoven", 180));
        p.add(new Song("Rap Snitch Knishes", "MF Doom", 173));
        p.add(new Song("I Just Might", "Bruno Mars", 213));
        p.add(new Song("Blinding Lights", "The Weeknd", 200));
        p.add(new Song("Levitating", "Dua Lipa", 203));

        System.out.println("Printing the songs...\n");
        p.playlist();



        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        Song s1 = p.getSong(0);
        Song s2 = p.getSong(2);
        p.like(s1);
        p.like(s2);
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        for(int i = 0; i < p.size(); i++) {
            Song curerrentSong = p.getSong(i);
            System.out.println(curerrentSong.getName() + "\n");
            
        }

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        Song s3 = p.getSong(1);
        p.like(s3);

        for(int i = 0; i < p.size(); i++) {
            Song curerrentSong = p.getSong(i);
            System.out.println(curerrentSong.getName() + "\n");
            
        }

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        p.remove(s1);

        for(int i = 0; i < p.size(); i++) {
            Song curerrentSong = p.getSong(i);
            System.out.println(curerrentSong.getName() + "\n");
            
        }

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p.liked();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        p.duration();

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnliked();

        for(int i = 0; i < p.size(); i++) {
            Song curerrentSong = p.getSong(i);
            System.out.println(curerrentSong.getName() + "\n");
            
        }
    }
}
