package cntt.ntu.pshs_bai2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase DataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataBase = SQLiteDatabase.openOrCreateDatabase("/data/data/cntt61.h61133717/MyBook.db", null);
        TaoVaThemDuLieu();
        NapSACHvaoListview();
    }

    void TaoVaThemDuLieu() {
        String sqlXoaBang = "DROP TABLE IF EXISTS THO";
        DataBase.execSQL(sqlXoaBang);
        String sqlTaoBang = "CREATE TABLE THO ( ThoID integer PRIMARY KEY, " + "   Ten, " + "   TacGia)";
        DataBase.execSQL(sqlTaoBang);
        String SQLThem1 = "INSERT INTO THO VALUES(1, 'Đường Về Quê Mẹ', 'Đoàn Văn Cừ')";
        DataBase.execSQL(SQLThem1);
        String SQLThem2 = "INSERT INTO THO VALUES(2, 'Việt Nam Quê Hương Ta', 'Nguyễn Đình Thi')";
        DataBase.execSQL(SQLThem2);
        String SQLThem3 = "INSERT INTO THO VALUES(3, 'Quê Hương', 'Nguyễn Đình Huân') ";
        DataBase.execSQL(SQLThem3);
        String SQLThem4 = "INSERT INTO THO VALUES(4, 'Tràng Giang', 'Huy Cận')";
        DataBase.execSQL(SQLThem4);
        String SQLThem5 = "INSERT INTO THO VALUES(5, 'Đất Nước', 'Nguyễn Đình Thi')";
        DataBase.execSQL(SQLThem5);
    }

    void NapSACHvaoListview() {
        ListView listView = (ListView) findViewById(R.id.lvTho);
        ArrayList<String> dsTho = new ArrayList<String>();
        Cursor cs = DataBase.rawQuery("SELECT * FROM THO", null);
        cs.moveToFirst();
        while (true) {
            if (cs.isAfterLast() == true) break;
            int ms = cs.getInt(0);
            String tenTho = cs.getString(1);
            String tacgia = cs.getString(2);
            String dong = String.valueOf(ms) + " --- " + tenTho + "----" + String.valueOf(tacgia);
            dsTho.add(dong);
            cs.moveToNext();

        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dsTho);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String dongChon = dsTho.get(i);
                int k = dongChon.indexOf(" ");
                String ma = dongChon.substring(0, k);
                EditText edChon = (EditText) findViewById(R.id.edtMSCHON);
                edChon.setText(ma);
            }
        });
    }
}