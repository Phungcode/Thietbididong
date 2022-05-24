package cntt61.son61136475;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ten;
    TextView chon;
    Button btn;
    ListView listView;
    ArrayList<String> arrayList=null;
    ArrayAdapter<String> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ten=(EditText) findViewById(R.id.edtten);
        chon=(TextView) findViewById(R.id.tvselection);
        btn=(Button) findViewById(R.id.btnNhap);

        listView=(ListView) findViewById(R.id.lv);

        arrayList=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                arrayList.add(ten.getText()+"");
                adapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                chon.setText("position: "+ i+"; value = "+arrayList.get(i));
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                arrayList.remove(i);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}