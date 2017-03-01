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

public class NotWorkYet extends AppCompatActivity {

    TextView txtv;
    Button btnOkFine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_work_yet);

        txtv = (TextView) findViewById(R.id.TextViewNotWorkYet);
        btnOkFine = (Button) findViewById(R.id.ButtonOKFine);

        Date now = new Date();
        //now.setHours(4);
        //now.setMinutes(20);

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

        btnOkFine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Back = new Intent(NotWorkYet.this,BeginScreen.class);
                startActivity(Back);
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
