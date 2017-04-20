package example.codeclan.com.top20list;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Top10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top20list);

        Top10Songs top10Songs = new Top10Songs();
        ArrayList<Song> list = top10Songs.getList();

        Top10Adapter top10SongsAdapter = new Top10Adapter(this, list);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(top10SongsAdapter);
    }



    public void getSong(View listItem){
        Song song = (Song) listItem.getTag();
        Log.d("Song title ", song.getTitle());

    }

}