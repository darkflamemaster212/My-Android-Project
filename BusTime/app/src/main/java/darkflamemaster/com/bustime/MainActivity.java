package darkflamemaster.com.bustime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtvNextBus;
    TextView txtvNextBusMin;
    TextView txtvPreBus;
    TextView txtvPreBusMin;
    TextView txtvX2PreBus;
    TextView txtvX2PreBusMin;
    LinearLayout screen;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        back = (Button) findViewById(R.id.buttonBack);
        txtvNextBus = (TextView) findViewById(R.id.textViewNextBus);
        txtvPreBus = (TextView) findViewById(R.id.textViewPreBus);
        txtvX2PreBus = (TextView) findViewById(R.id.textViewX2PreBus);
        txtvNextBusMin = (TextView) findViewById(R.id.textViewNextBusMin);
        txtvPreBusMin = (TextView) findViewById(R.id.textViewPreBusMin);
        txtvX2PreBusMin = (TextView) findViewById(R.id.textViewX2PreBusMin);
        screen = (LinearLayout) findViewById(R.id.activity_main);
        screen.setBackgroundResource(R.drawable.screen);

        Date now = new Date(); //Lấy thời gian
        now.setHours(6);
        now.setMinutes(10);

        //Lấy giờ và phút
        DateFormat dfOnlyHour = new SimpleDateFormat("HH");
        DateFormat dfOnlyMin = new SimpleDateFormat("mm");
        String hour = dfOnlyHour.format(now);
        String min = dfOnlyMin.format(now);

        //Tạo lịch xe chạy
        Time[] TimeList = new Time[40];
        TimeList[0] = new Time(5,30,0);
        TimeList[1] = new Time(5,40,0);
        TimeList[2] = new Time(5,50,0);
        TimeList[3] = new Time(6,00,0);
        TimeList[4] = new Time(6,20,0);
        TimeList[5] = new Time(6,40,0);
        TimeList[6] = new Time(7,00,0);
        TimeList[7] = new Time(7,20,0);
        TimeList[8] = new Time(7,40,0);
        TimeList[9] = new Time(8,00,0);
        TimeList[10] = new Time(8,20,0);
        TimeList[11] = new Time(8,40,0);
        TimeList[12] = new Time(9,00,0);
        TimeList[13] = new Time(9,30,0);
        TimeList[14] = new Time(10,00,0);
        TimeList[15] = new Time(10,20,0);
        TimeList[16] = new Time(10,40,0);
        TimeList[17] = new Time(10,55,0);
        TimeList[18] = new Time(11,10,0);
        TimeList[19] = new Time(11,25,0);
        TimeList[20] = new Time(11,40,0);
        TimeList[21] = new Time(12,00,0);
        TimeList[22] = new Time(12,20,0);
        TimeList[23] = new Time(12,40,0);
        TimeList[24] = new Time(13,00,0);
        TimeList[25] = new Time(13,25,0);
        TimeList[26] = new Time(13,50,0);
        TimeList[27] = new Time(14,15,0);
        TimeList[28] = new Time(14,40,0);
        TimeList[29] = new Time(15,05,0);
        TimeList[30] = new Time(15,30,0);
        TimeList[31] = new Time(15,50,0);
        TimeList[32] = new Time(16,10,0);
        TimeList[33] = new Time(16,30,0);
        TimeList[34] = new Time(16,40,0);
        TimeList[35] = new Time(16,50,0);
        TimeList[36] = new Time(17,10,0);
        TimeList[37] = new Time(17,30,0);
        TimeList[38] = new Time(18,00,0);
        TimeList[39] = new Time(18,30,0);

        //Tạo biến time chứa thời gian hiện tại
        Time OnlyTime = new Time(Integer.parseInt(hour), Integer.parseInt(min),0);


        int i = 0;
        int next = 0;
        int pre = 0;
        int x2pre = 0;
        while (OnlyTime.after(TimeList[i])) {
            i++;
        }
        next = i;
        pre = i - 1;
        x2pre = i - 2;
        Time nextBus = TimeSub(OnlyTime, TimeList[next]);
        int TimeToNextBus = nextBus.getMinutes();
        Time preBus = TimeSub(TimeList[pre], OnlyTime);
        int TimeToPreBus = preBus.getMinutes();
        Time x2preBus = TimeSub(TimeList[x2pre], OnlyTime);
        int TimeToX2PreBus = x2preBus.getMinutes();

        txtvNextBus.setText(TimeList[next].toString());
        txtvPreBus.setText(TimeList[pre].toString());
        txtvX2PreBus.setText(TimeList[x2pre].toString());
        txtvNextBusMin.setText(String.valueOf(TimeToNextBus));
        txtvPreBusMin.setText(String.valueOf(TimeToPreBus));
        txtvX2PreBusMin.setText(String.valueOf(TimeToX2PreBus));


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToFirst = new Intent(MainActivity.this,FirstScreen.class);
                startActivity(backToFirst);
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
