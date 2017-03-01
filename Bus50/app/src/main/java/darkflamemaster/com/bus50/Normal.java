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

public class Normal extends AppCompatActivity {

    TextView txtvNextBus;
    TextView txtvNextBusMin;
    TextView txtvPreBus;
    TextView txtvPreBusMin;
    TextView txtvXPreBus;
    TextView txtvXPreBusMin;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        back = (Button) findViewById(R.id.ButtonOK);
        txtvNextBus = (TextView) findViewById(R.id.TextViewNext);
        txtvPreBus = (TextView) findViewById(R.id.TextViewPre);
        txtvXPreBus = (TextView) findViewById(R.id.TextViewXPre);
        txtvNextBusMin = (TextView) findViewById(R.id.TextViewNextMin);
        txtvPreBusMin = (TextView) findViewById(R.id.TextViewPreMin);
        txtvXPreBusMin = (TextView) findViewById(R.id.TextViewXPreMin);

        Date now = new Date(); //Lấy thời gian
        //now.setHours(5);
        //now.setMinutes(35);

        //Lấy giờ và phút
        DateFormat dfOnlyHour = new SimpleDateFormat("HH");
        DateFormat dfOnlyMin = new SimpleDateFormat("mm");
        SimpleDateFormat df = new SimpleDateFormat("E");
        String day = df.format(now);
        //String day = "CN";
        String hour = dfOnlyHour.format(now);
        String min = dfOnlyMin.format(now);

        //Tạo lịch xe chạy
        if (day.equals("CN")==false) //Nếu khác chủ nhật
        {
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
            int xpre = 0;
            while (OnlyTime.after(TimeList[i])) {
                i++;
            }
            next = i;
            pre = i - 1;
            xpre = i - 2;
            if(xpre>=0) {
                Time nextBus = TimeSub(OnlyTime, TimeList[next]);
                int TimeToNextBus = nextBus.getMinutes();
                Time preBus = TimeSub(TimeList[pre], OnlyTime);
                int TimeToPreBus = preBus.getMinutes();
                Time xpreBus = TimeSub(TimeList[xpre], OnlyTime);
                int TimeToXPreBus = xpreBus.getMinutes();

                txtvNextBus.setText(TimeList[next].toString());
                txtvPreBus.setText(TimeList[pre].toString());
                txtvXPreBus.setText(TimeList[xpre].toString());
                txtvNextBusMin.setText(String.valueOf(TimeToNextBus));
                txtvPreBusMin.setText(String.valueOf(TimeToPreBus));
                txtvXPreBusMin.setText(String.valueOf(TimeToXPreBus));
            }
            else {
                Time nextBus = TimeSub(OnlyTime, TimeList[next]);
                int TimeToNextBus = nextBus.getMinutes();
                Time preBus = TimeSub(TimeList[pre], OnlyTime);
                int TimeToPreBus = preBus.getMinutes();
                //Time xpreBus = TimeSub(TimeList[xpre], OnlyTime);
                //int TimeToXPreBus = xpreBus.getMinutes();
                String TimeToXPreBus = "00";

                txtvNextBus.setText(TimeList[next].toString());
                txtvPreBus.setText(TimeList[pre].toString());
                txtvXPreBus.setText("00:00:00");
                txtvNextBusMin.setText(String.valueOf(TimeToNextBus));
                txtvPreBusMin.setText(String.valueOf(TimeToPreBus));
                txtvXPreBusMin.setText(TimeToXPreBus);
            }
        }
        else{
            Time[] TimeList = new Time[30];
            TimeList[0] = new Time(5,30,0);
            TimeList[1] = new Time(6,0,0);
            TimeList[2] = new Time(6,30,0);
            TimeList[3] = new Time(7,0,0);
            TimeList[4] = new Time(7,30,0);
            TimeList[5] = new Time(7,55,0);
            TimeList[6] = new Time(8,20,0);
            TimeList[7] = new Time(8,45,0);
            TimeList[8] = new Time(9,10,0);
            TimeList[9] = new Time(9,35,0);
            TimeList[10] = new Time(10,0,0);
            TimeList[11] = new Time(10,25,0);
            TimeList[12] = new Time(10,50,0);
            TimeList[13] = new Time(11,15,0);
            TimeList[14] = new Time(11,40,0);
            TimeList[15] = new Time(12,5,0);
            TimeList[16] = new Time(12,30,0);
            TimeList[17] = new Time(12,55,0);
            TimeList[18] = new Time(13,25,0);
            TimeList[19] = new Time(13,55,0);
            TimeList[20] = new Time(14,25,0);
            TimeList[21] = new Time(14,55,0);
            TimeList[22] = new Time(15,25,0);
            TimeList[23] = new Time(15,55,0);
            TimeList[24] = new Time(16,25,0);
            TimeList[25] = new Time(16,50,0);
            TimeList[26] = new Time(17,15,0);
            TimeList[27] = new Time(17,40,0);
            TimeList[28] = new Time(18,05,0);
            TimeList[29] = new Time(18,30,0);


            //Tạo biến time chứa thời gian hiện tại
            Time OnlyTime = new Time(Integer.parseInt(hour), Integer.parseInt(min),0);

            int i = 0;
            int next = 0;
            int pre = 0;
            int xpre = 0;
            while (OnlyTime.after(TimeList[i])) {
                i++;
            }
            next = i;
            pre = i - 1;
            xpre = i - 2;
            if(xpre>=0) {
                Time nextBus = TimeSub(OnlyTime, TimeList[next]);
                int TimeToNextBus = nextBus.getMinutes();
                Time preBus = TimeSub(TimeList[pre], OnlyTime);
                int TimeToPreBus = preBus.getMinutes();
                Time xpreBus = TimeSub(TimeList[xpre], OnlyTime);
                int TimeToXPreBus = xpreBus.getMinutes();

                txtvNextBus.setText(TimeList[next].toString());
                txtvPreBus.setText(TimeList[pre].toString());
                txtvXPreBus.setText(TimeList[xpre].toString());
                txtvNextBusMin.setText(String.valueOf(TimeToNextBus));
                txtvPreBusMin.setText(String.valueOf(TimeToPreBus));
                txtvXPreBusMin.setText(String.valueOf(TimeToXPreBus));
            }
            else {
                Time nextBus = TimeSub(OnlyTime, TimeList[next]);
                int TimeToNextBus = nextBus.getMinutes();
                Time preBus = TimeSub(TimeList[pre], OnlyTime);
                int TimeToPreBus = preBus.getMinutes();
                //Time xpreBus = TimeSub(TimeList[xpre], OnlyTime);
                //int TimeToXPreBus = xpreBus.getMinutes();
                String TimeToXPreBus = "00";

                txtvNextBus.setText(TimeList[next].toString());
                txtvPreBus.setText(TimeList[pre].toString());
                txtvXPreBus.setText("00:00:00");
                txtvNextBusMin.setText(String.valueOf(TimeToNextBus));
                txtvPreBusMin.setText(String.valueOf(TimeToPreBus));
                txtvXPreBusMin.setText(TimeToXPreBus);
            }
        }


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToFirst = new Intent(Normal.this,BeginScreen.class);
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
