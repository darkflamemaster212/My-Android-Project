package darkflamemaster.com.bustime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NotWorkingTimeYet extends AppCompatActivity {

    TextView txtv;
    RelativeLayout screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_working_time_yet);

        txtv = (TextView) findViewById(R.id.textViewNotWorkYet);
        screen = (RelativeLayout) findViewById(R.id.activity_not_working_time_yet) ;
        screen.setBackgroundResource(R.drawable.screen);

        Date now = new Date();

        DateFormat dfOnlyHour = new SimpleDateFormat("HH");
        DateFormat dfOnlyMin = new SimpleDateFormat("mm");
        String hour = dfOnlyHour.format(now);
        String min = dfOnlyMin.format(now);

        Time a = new Time(Integer.parseInt(hour),Integer.parseInt(min),0);

        Time b = new Time(5,30,0);

        Time c = TimeSub(a,b);

        int minTilStart = c.getMinutes();
        int hourTilStart = c.getHours();

        txtv.setText(String.valueOf(hourTilStart)+" giờ "+String.valueOf(minTilStart)+" phút");


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


