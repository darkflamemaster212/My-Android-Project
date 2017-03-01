package darkflamemaster.com.wallpaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout Manhinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Manhinh = (RelativeLayout) findViewById(R.id.Manhinh);
        Manhinh.setBackgroundResource(R.drawable.wallpaper);
    }
}
