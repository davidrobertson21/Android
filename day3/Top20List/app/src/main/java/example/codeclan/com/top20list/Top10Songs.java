package example.codeclan.com.top20list;

import java.util.ArrayList;

/**
 * Created by user on AD 2017/4/19.
 */

public class Top10Songs {

    private ArrayList<Song> list;

    public Top10Songs(){
        list = new ArrayList<Song>();
        list.add(new Song(1, "Sign Of The Times", "Harry Styles"));
        list.add(new Song(2, "Shape Of You", "Ed Sheeran"));
        list.add(new Song(3, "Galway Girl", "Ed Sheeran"));
        list.add(new Song(4, "Symphony (feat. Zara Larsson)", "Clean Bandit"));
        list.add(new Song(5, "Passionfruit", "Drake"));
        list.add(new Song(6, "Something Just Like This", "The Chainsmokers & Coldplay"));
        list.add(new Song(7, "Solo Dance", "Martin Jensen"));
        list.add(new Song(8, "Stay (feat. Alessia Cara)", "Zedd"));
        list.add(new Song(9, "It Ain't Me", "Kygo & Selena Gomez"));
        list.add(new Song(10, "Castle On The Hill", "Ed Sheeran"));

    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }

}
