package darkflamemaster.com.bustime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OutOfWorkTime extends AppCompatActivity {

    TextView txtvLast;
    TextView txtvPreLast;
    RelativeLayout screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_of_work_time);
        txtvLast = (TextView) findViewById(R.id.OutTime1) ;
        txtvPreLast = (TextView) findViewById(R.id.OutTime2);
        screen = (RelativeLayout) findViewById(R.id.activity_out_of_work_time);
        screen.setBackgroundResource(R.drawable.screen);

        Date now = new Date();

        DateFormat dfOnlyHour = new SimpleDateFormat("HH");
        DateFormat dfOnlyMin = new SimpleDateFormat("mm");
        String hour = dfOnlyHour.format(now);
        String min = dfOnlyMin.format(now);

        Time a = new Time(Integer.parseInt(hour),Integer.parseInt(min),0);

        Time b = new Time(18,30,0);
        Time c = new Time(18,0,0);

        Time d = TimeSub(b,a);
        Time e = TimeSub(c,a);

        int hourFromLast = d.getHours();
        int minFromLast = d.getMinutes();

        int hourFromPreLast = e.getHours();
        int minFromPreLast = e.getMinutes();

        txtvLast.setText(String.valueOf(hourFromLast)+" giờ "+String.valueOf(minFromLast)+" phút");
        txtvPreLast.setText(String.valueOf(hourFromPreLast)+" giờ "+ String.valueOf(minFromPreLast+" phút"));
    }

    public Time TimeSub(Time before, Time after) {
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
        if (hourAt == hourBf) {
            hourResult = 0;
            minResult = minAt - minBf;
        }
        if (hourAt > hourBf) {
            hourResult = hourAt - hourBf;
            if (minAt >= minBf) {
                minResult = minAt - minBf;
            }
            if (minAt < minBf) {
                minResult = 60 - (minBf - minAt);
                hourResult--;
            }
        }
        Time result = new Time(hourResult, minResult, 0);
        return result;
    }
}
