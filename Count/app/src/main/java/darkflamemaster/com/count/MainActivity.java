package darkflamemaster.com.count;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtCount;
    TextView txtvTime;
    Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCount = (EditText) findViewById(R.id.editTextTime);
        btnCount = (Button) findViewById(R.id.buttonCount);
        txtvTime = (TextView) findViewById(R.id.textViewCount);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = edtCount.getText().toString();
                txtvTime.setText(time);
                int Time = Integer.parseInt(time);
                CountDownTimer count = new CountDownTimer( Time*1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String s = txtvTime.getText().toString();
                        int t = Integer.parseInt(s);
                        t = t - 1;
                        s = String.valueOf(t);
                        txtvTime.setText(s);

                    }

                    @Override
                    public void onFinish() {
                        txtvTime.setText("0");
                        Toast.makeText(MainActivity.this,"Done !",Toast.LENGTH_LONG).show();

                    }
                };
                count.start();

            }
        });
    }
}
