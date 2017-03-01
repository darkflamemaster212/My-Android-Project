package darkflamemaster.com.sumary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    TextView txtvKetQua;
    Button btnTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.editText1);
        edt2 = (EditText) findViewById(R.id.editText2);
        btnTong = (Button) findViewById(R.id.buttonTong);
        txtvKetQua = (TextView) findViewById(R.id.textViewKetQua);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edt1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                String chuoi2 = edt2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);
                int tong = so1 + so2;
                txtvKetQua.setText(String.valueOf(tong));
            }
        });
    }
}
