package example.codeclan.com.top20list;

/**
 * Created by user on AD 2017/4/19.
 */

public class Song {

    private Integer ranking;
    private String title;
    private String artist;

    public Song(Integer ranking, String title, String artist){
        this.ranking = ranking;
        this.title = title;
        this.artist = artist;

    }

    public Integer getRanking() {return ranking;}

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }



}
