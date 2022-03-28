package cntt61.son61136475;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String arr[]=getResources().getStringArray(R.array.options);
        ListView lv=(ListView) findViewById(R.id.list_option);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,android.R.id.text1, arr);
        lv.setAdapter(adapter);
        TextView txt=(TextView) findViewById(R.id.txt);
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent,
                                            View view,
                                            int pos,
                                            long id) {
                        txt.setText("position :"+pos+" ; value ="+arr[pos]);
                    }
                });
    }
}