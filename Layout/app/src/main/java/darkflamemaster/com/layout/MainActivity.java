package darkflamemaster.com.layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtvKetQua;
    Button btnTong;
    EditText edt1, edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.editTextso1);
        edt2 = (EditText) findViewById(R.id.editTextso2);
        txtvKetQua = (EditText) findViewById(R.id.textViewKetQua);
        btnTong = (Button) findViewById(R.id.buttonTong);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edt1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = edt2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int Tong = so1 + so2;
                txtvKetQua.setText(String.valueOf(Tong));

            }
        });

    }
}
