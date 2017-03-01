package darkflamemaster.com.bus50;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BeginScreen extends AppCompatActivity {

    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_screen);
        btnStart = (Button) findViewById(R.id.ButtonStart);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date now = new Date(); //Lấy thời gian
                //now.setHours(18);
                //now.setMinutes(45);
                //now.setHours(4);
                //now.setMinutes(20);

                //Lấy giờ và phút
                DateFormat dfOnlyHour = new SimpleDateFormat("HH");
                DateFormat dfOnlyMin = new SimpleDateFormat("mm");
                String hour = dfOnlyHour.format(now);
                String min = dfOnlyMin.format(now);
                if ((Integer.parseInt(hour) < 5) || ((Integer.parseInt(hour) == 5) && (Integer.parseInt(min) < 30))) {
                    Intent NotWork = new Intent(BeginScreen.this,NotWorkYet.class);
                    startActivity(NotWork);
                } else {
                    if ((Integer.parseInt(hour) > 18) || ((Integer.parseInt(hour) == 18) && (Integer.parseInt(min)) > 30)) {
                        Intent OutWorkTime = new Intent(BeginScreen.this, TimeOut.class);
                        startActivity(OutWorkTime);
                    } else {
                        Intent Nm = new Intent(BeginScreen.this, Normal.class);
                        startActivity(Nm);
                    }
                }
            }
        });

    }
    public Time TimeSub(Time before, Time after)
    {
        int hourBf;
        int minBf;
        int hourAt;
        int minAt;
        int hourResult = 0;
        int minResult = 0;
        hourBf = before.getHours();
        hourAt = after.getHours();
        minAt = after.getMinutes();
        minBf = before.getMinutes();
        if (hourAt == hourBf)
        {
            hourResult = 0;
            minResult = minAt - minBf;
        }
        if (hourAt>hourBf)
        {
            hourResult = hourAt - hourBf;
            if (minAt >= minBf)
            {
                minResult = minAt - minBf;
            }
            if (minAt<minBf)
            {
                minResult = 60 - ( minBf - minAt);
                hourResult--;
            }
        }
        Time result = new Time(hourResult,minResult,0);
        return  result;
    }
}
