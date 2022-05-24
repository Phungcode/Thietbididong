package cntt.ntu.pshs_bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText ChieuCao, Day;
    private Button CV, DT, CL;
    private TextView KQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CV = (Button) findViewById(R.id.chuvi);
        DT = (Button) findViewById(R.id.dientich);
        CL = (Button) findViewById(R.id.xoa_text);
        ChieuCao = (EditText) findViewById(R.id.chieucao);
        Day = (EditText) findViewById(R.id.day);
        KQ = (TextView) findViewById(R.id.ketqua);

        CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double C = Double.parseDouble(ChieuCao.getText().toString());
                double D = Double.parseDouble(Day.getText().toString());
                Double CHUVI = (C + D) * 2;
                KQ.setText(String.valueOf(CHUVI));
            }
        });

        DT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double C = Double.parseDouble(ChieuCao.getText().toString());
                double D = Double.parseDouble(Day.getText().toString());
                Double DIENTICH = C * D;
                KQ.setText(String.valueOf(DIENTICH));
            }
        });

        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChieuCao.setText("");
                Day.setText("");
                KQ.setText("");
            }
        });

    }
}