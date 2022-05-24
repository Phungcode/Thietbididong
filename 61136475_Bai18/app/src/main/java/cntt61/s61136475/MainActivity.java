package cntt61.s61136475;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView chon;
    String arr[]={"Inter","SamSung","Nokia","Simen","AMD","KIC","ECD"};
    ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arr);
        setListAdapter(adapter);
        chon=(TextView) findViewById(R.id.selection);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
        String text="position = "+position+"; value = "+arr[position];
        chon.setText(text);
    }
}