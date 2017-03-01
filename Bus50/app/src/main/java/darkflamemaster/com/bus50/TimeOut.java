package darkflamemaster.com.bus50;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeOut extends AppCompatActivity {

    TextView txtvLast;
    TextView txtvPreLast;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_out);
        txtvLast = (TextView) findViewById(R.id.OutTime1) ;
        txtvPreLast = (TextView) findViewById(R.id.OutTime2);
        btnBack = (Button) findViewById(R.id.ButtonOKTO);

        Date now = new Date();
        //now.setHours(18);
        //now.setMinutes(45);

        DateFormat dfOnlyHour = new SimpleDateFormat("HH");
        DateFormat dfOnlyMin = new SimpleDateFormat("mm");
        SimpleDateFormat df = new SimpleDateFormat("E");
        String hour = dfOnlyHour.format(now);
        String min = dfOnlyMin.format(now);
        String day = df.format(now);

        Time a = new Time(Integer.parseInt(hour),Integer.parseInt(min),0);

        Time b = new Time(18,30,0);
        Time c = new Time(18,0,0);
        Time cn = new Time(18,5,0);

        Time d = TimeSub(b,a);
        Time e = TimeSub(c,a);
        Time f = TimeSub(cn,a);

        int hourFromLast = d.getHours();
        int minFromLast = d.getMinutes();

        int hourFromPreLast = e.getHours();
        int minFromPreLast = e.getMinutes();
        int minFromPreLast2 = f.getMinutes();

        txtvLast.setText(String.valueOf(hourFromLast)+" giờ "+String.valueOf(minFromLast)+" phút");
        if(day.equals("CN")==true)
        {
            txtvPreLast.setText(String.valueOf(hourFromPreLast)+" giờ "+ String.valueOf(minFromPreLast2+" phút"));
        }
        else {
            txtvPreLast.setText(String.valueOf(hourFromPreLast)+" giờ "+ String.valueOf(minFromPreLast+" phút"));
        }


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoBack = new Intent(TimeOut.this,BeginScreen.class);
                startActivity(GoBack);
            }
        });
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
