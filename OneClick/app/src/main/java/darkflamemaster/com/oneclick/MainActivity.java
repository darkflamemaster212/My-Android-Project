package darkflamemaster.com.oneclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtvHoten;
    Button btnHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvHoten = (TextView) findViewById(R.id.textViewHoTen);
        btnHello = (Button) findViewById(R.id.buttonHello);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvHoten.setText("Hello World");
            }
        });
    }
}
