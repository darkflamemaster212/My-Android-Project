package darkflamemaster.com.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgAndroid;
    Button btnAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAndroid = (ImageView) findViewById(R.id.imageViewAndroid);
        btnAndroid = (Button) findViewById(R.id.buttonAndroid);

        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgAndroid.setImageResource(R.mipmap.ic_launcher);
            }
        });
    }
}
