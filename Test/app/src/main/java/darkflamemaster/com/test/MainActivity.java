package darkflamemaster.com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvTime = (TextView) findViewById(R.id.textViewTime);

        Date now = new Date();
        SimpleDateFormat df = new SimpleDateFormat("E");
        String a = df.format(now);
        txtvTime.setText(a);

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
                hourResult = hourResult - 1;
            }
        }
        Time result = new Time(hourResult,minResult,0);
        return  result;
    }
}
