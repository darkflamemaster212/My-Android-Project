package darkflamemaster.com.randomnumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtvRandom1;
    TextView txtvRandom2;
    TextView txtvRandom3;
    TextView txtvRandom4;
    Button btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(
                MainActivity.this,
                "Welcome",
                Toast.LENGTH_SHORT
        ).show();

        txtvRandom1 = (TextView) findViewById(R.id.textViewRandom);
        txtvRandom2 = (TextView) findViewById(R.id.textView2);
        txtvRandom3 = (TextView) findViewById(R.id.textView3);
        txtvRandom4 = (TextView) findViewById(R.id.textView4);

        btnRandom = (Button) findViewById(R.id.buttonRandom);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int n1 = r.nextInt(10);
                int n2 = r.nextInt(10);
                int n3 = r.nextInt(10);
                int n4 = r.nextInt(10);
                txtvRandom1.setText(String.valueOf(n1));
                txtvRandom2.setText(String.valueOf(n2));
                txtvRandom3.setText(String.valueOf(n3));
                txtvRandom4.setText(String.valueOf(n4));
            }
        });

    }
}
