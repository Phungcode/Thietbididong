package vn.ntu.caculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText dk_soA,dk_soB;
    TextView dk_KQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dk_soA=(EditText) findViewById(R.id.edtA);
        dk_soB=(EditText) findViewById(R.id.edtB);
        dk_KQ=(TextView) findViewById(R.id.edtResurt);
        nutCong=(Button) findViewById(R.id.btnAdd);
        nutTru=(Button) findViewById(R.id.btnSub);
        nutNhan=(Button) findViewById(R.id.btnMul);
        nutChia=(Button) findViewById(R.id.btnDiv);
    }
    public void Xuly_Cong(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua;
        if(!dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = soA+soB;
        }
        else if(dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = 0+soB;
        }
        else if(dk_soB.getText().toString().equals("") && !dk_soA.getText().toString().equals("")){
            KetQua = soA+0;
        }
        else{
            KetQua = 0;
        }
        dk_KQ.setText(String.valueOf(KetQua));
    }
    public void Xuly_Tru(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua;
        if(!dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = soA-soB;
        }
        else if(dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = 0+soB;
        }
        else if(dk_soB.getText().toString().equals("") && !dk_soA.getText().toString().equals("")){
            KetQua = soA+0;
        }
        else{
            KetQua = 0;
        }
        dk_KQ.setText(String.valueOf(KetQua));
    }
    public void Xuly_Nhan(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua;
        if(!dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = soA*soB;
        }
        else if(dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = 0+soB;
        }
        else if(dk_soB.getText().toString().equals("") && !dk_soA.getText().toString().equals("")){
            KetQua = soA+0;
        }
        else{
            KetQua = 0;
        }
        dk_KQ.setText(String.valueOf(KetQua));
    }
    public void Xuly_Chia(View v){
        float soA= Float.parseFloat(dk_soA.getText().toString());
        float soB= Float.parseFloat(dk_soB.getText().toString());
        float KetQua;
        if(!dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = soA/soB;
        }
        else if(dk_soA.getText().toString().equals("") && !dk_soB.getText().toString().equals("")){
            KetQua = 0+soB;
        }
        else if(dk_soB.getText().toString().equals("") && !dk_soA.getText().toString().equals("")){
            KetQua = soA+0;
        }
        else{
            KetQua = 0;
        }
        dk_KQ.setText(String.valueOf(KetQua));
    }
}