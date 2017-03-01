package darkflamemaster.com.bustime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstScreen extends AppCompatActivity {

    Button btnStart;
    RelativeLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        btnStart = (Button) findViewById(R.id.buttonStart);
        screen = (RelativeLayout) findViewById(R.id.activity_first_screen) ;
        screen.setBackgroundResource(R.drawable.screen);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date now = new Date(); //Lấy thời gian
                now.setHours(6);
                now.setMinutes(10);
                //Lấy giờ và phút
                DateFormat dfOnlyHour = new SimpleDateFormat("HH");
                DateFormat dfOnlyMin = new SimpleDateFormat("mm");
                String hour = dfOnlyHour.format(now);
                String min = dfOnlyMin.format(now);



                 if ((Integer.parseInt(hour) < 5) || ((Integer.parseInt(hour) == 5) && (Integer.parseInt(min) < 30))) {
                     Intent NotWorkYet = new Intent(FirstScreen.this, NotWorkingTimeYet.class);
                     startActivity(NotWorkYet);
                 } else {
                     if ((Integer.parseInt(hour) > 18) || ((Integer.parseInt(hour) == 18) && (Integer.parseInt(min)) > 30)) {
                         Intent OutWorkTime = new Intent(FirstScreen.this, OutOfWorkTime.class);
                         startActivity(OutWorkTime);
                     } else {
                         Intent Normal = new Intent(FirstScreen.this, MainActivity.class);
                         startActivity(Normal);
                     }
                 }
            }
        }
            );
        }
    }
