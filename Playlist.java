import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> Songs;




     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        Songs = new ArrayList<Song>();

    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a songgit
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void add(Song mysong){
        Songs.add(mysong);
    }


    public Song getSong(int index){
        return Songs.get(index);
    }


    public void like(Song mysong){
        Songs.get(Songs.indexOf(mysong)).setLiked(true);;
    }

    public void remove(Song mysong){
        Songs.remove(mysong);
    }

    public void playlist(){
        System.out.println(Songs);
    }

    public int size(){
        return Songs.size();
    }



    public void liked(){
        ArrayList<Song> Liked = new ArrayList<Song>();
        for (int i = 0; i<Songs.size(); i++){
            if (Songs.get(i).isLiked().equals("Yes")){
                Liked.add(Songs.get(i));
            }

        }
        System.out.println(Liked);
    }
    public String duration(){
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        for (int i = 0; i<Songs.size(); i++){
            seconds += Songs.get(i).getDuration();

        }
        minutes += seconds/60;
        seconds = seconds%60;
        hours += minutes/60;
        minutes = minutes%60;
        return " " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
    }

    public void removeUnliked(){
        for (int i = 0; i<Songs.size(); i++){
            if (Songs.get(i).isLiked().equals("No")){
                Songs.remove(i);
            }

        }
    }














}
