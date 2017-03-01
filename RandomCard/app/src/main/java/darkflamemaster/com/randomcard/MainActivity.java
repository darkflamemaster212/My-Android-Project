package darkflamemaster.com.randomcard;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgCard;
    Button btnPick;
    RelativeLayout manhinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manhinh = (RelativeLayout) findViewById(R.id.manhinh);
        manhinh.setBackgroundResource(R.drawable.wall);

        imgCard = (ImageView) findViewById(R.id.imageViewCard);
        btnPick = (Button) findViewById(R.id.buttonPick);

        btnPick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CountDownTimer count = new CountDownTimer(1500,10) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        ArrayList<Integer>CardList = new ArrayList<Integer>();
                        CardList.add(R.drawable.c1);
                        CardList.add(R.drawable.c2);
                        CardList.add(R.drawable.c3);
                        CardList.add(R.drawable.c4);
                        CardList.add(R.drawable.c5);
                        CardList.add(R.drawable.c6);
                        CardList.add(R.drawable.c7);
                        CardList.add(R.drawable.c8);
                        CardList.add(R.drawable.c9);
                        CardList.add(R.drawable.c10);
                        CardList.add(R.drawable.cj);
                        CardList.add(R.drawable.cq);
                        CardList.add(R.drawable.ck);
                        CardList.add(R.drawable.d1);
                        CardList.add(R.drawable.d2);
                        CardList.add(R.drawable.d3);
                        CardList.add(R.drawable.d4);
                        CardList.add(R.drawable.d5);
                        CardList.add(R.drawable.d6);
                        CardList.add(R.drawable.d7);
                        CardList.add(R.drawable.d8);
                        CardList.add(R.drawable.d9);
                        CardList.add(R.drawable.d10);
                        CardList.add(R.drawable.dj);
                        CardList.add(R.drawable.dq);
                        CardList.add(R.drawable.dk);
                        CardList.add(R.drawable.h1);
                        CardList.add(R.drawable.h2);
                        CardList.add(R.drawable.h3);
                        CardList.add(R.drawable.h4);
                        CardList.add(R.drawable.h5);
                        CardList.add(R.drawable.h6);
                        CardList.add(R.drawable.h7);
                        CardList.add(R.drawable.h8);
                        CardList.add(R.drawable.h9);
                        CardList.add(R.drawable.h10);
                        CardList.add(R.drawable.hj);
                        CardList.add(R.drawable.hq);
                        CardList.add(R.drawable.hk);
                        CardList.add(R.drawable.s1);
                        CardList.add(R.drawable.s1);
                        CardList.add(R.drawable.s3);
                        CardList.add(R.drawable.s4);
                        CardList.add(R.drawable.s5);
                        CardList.add(R.drawable.s6);
                        CardList.add(R.drawable.s7);
                        CardList.add(R.drawable.s8);
                        CardList.add(R.drawable.s9);
                        CardList.add(R.drawable.s10);
                        CardList.add(R.drawable.sj);
                        CardList.add(R.drawable.sq);
                        CardList.add(R.drawable.sk);
                        CardList.add(R.drawable.jb);
                        CardList.add(R.drawable.jr);


                        Random r = new Random();
                        int Random = r.nextInt(CardList.size());
                        imgCard.setImageResource(CardList.get(Random));

                    }

                    @Override
                    public void onFinish() {

                    }
                };
                count.start();


                CountDownTimer count2 = new CountDownTimer(6000,200) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        ArrayList<Integer>CardList = new ArrayList<Integer>();
                        CardList.add(R.drawable.c1);
                        CardList.add(R.drawable.c2);
                        CardList.add(R.drawable.c3);
                        CardList.add(R.drawable.c4);
                        CardList.add(R.drawable.c5);
                        CardList.add(R.drawable.c6);
                        CardList.add(R.drawable.c7);
                        CardList.add(R.drawable.c8);
                        CardList.add(R.drawable.c9);
                        CardList.add(R.drawable.c10);
                        CardList.add(R.drawable.cj);
                        CardList.add(R.drawable.cq);
                        CardList.add(R.drawable.ck);
                        CardList.add(R.drawable.d1);
                        CardList.add(R.drawable.d2);
                        CardList.add(R.drawable.d3);
                        CardList.add(R.drawable.d4);
                        CardList.add(R.drawable.d5);
                        CardList.add(R.drawable.d6);
                        CardList.add(R.drawable.d7);
                        CardList.add(R.drawable.d8);
                        CardList.add(R.drawable.d9);
                        CardList.add(R.drawable.d10);
                        CardList.add(R.drawable.dj);
                        CardList.add(R.drawable.dq);
                        CardList.add(R.drawable.dk);
                        CardList.add(R.drawable.h1);
                        CardList.add(R.drawable.h2);
                        CardList.add(R.drawable.h3);
                        CardList.add(R.drawable.h4);
                        CardList.add(R.drawable.h5);
                        CardList.add(R.drawable.h6);
                        CardList.add(R.drawable.h7);
                        CardList.add(R.drawable.h8);
                        CardList.add(R.drawable.h9);
                        CardList.add(R.drawable.h10);
                        CardList.add(R.drawable.hj);
                        CardList.add(R.drawable.hq);
                        CardList.add(R.drawable.hk);
                        CardList.add(R.drawable.s1);
                        CardList.add(R.drawable.s1);
                        CardList.add(R.drawable.s3);
                        CardList.add(R.drawable.s4);
                        CardList.add(R.drawable.s5);
                        CardList.add(R.drawable.s6);
                        CardList.add(R.drawable.s7);
                        CardList.add(R.drawable.s8);
                        CardList.add(R.drawable.s9);
                        CardList.add(R.drawable.s10);
                        CardList.add(R.drawable.sj);
                        CardList.add(R.drawable.sq);
                        CardList.add(R.drawable.sk);
                        CardList.add(R.drawable.jb);
                        CardList.add(R.drawable.jr);


                        Random r = new Random();
                        int Random = r.nextInt(CardList.size());
                        imgCard.setImageResource(CardList.get(Random));

                    }

                    @Override
                    public void onFinish() {

                    }
                };
                count2.start();

                CountDownTimer count3 = new CountDownTimer(5000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        ArrayList<Integer>CardList = new ArrayList<Integer>();
                        CardList.add(R.drawable.c1);
                        CardList.add(R.drawable.c2);
                        CardList.add(R.drawable.c3);
                        CardList.add(R.drawable.c4);
                        CardList.add(R.drawable.c5);
                        CardList.add(R.drawable.c6);
                        CardList.add(R.drawable.c7);
                        CardList.add(R.drawable.c8);
                        CardList.add(R.drawable.c9);
                        CardList.add(R.drawable.c10);
                        CardList.add(R.drawable.cj);
                        CardList.add(R.drawable.cq);
                        CardList.add(R.drawable.ck);
                        CardList.add(R.drawable.d1);
                        CardList.add(R.drawable.d2);
                        CardList.add(R.drawable.d3);
                        CardList.add(R.drawable.d4);
                        CardList.add(R.drawable.d5);
                        CardList.add(R.drawable.d6);
                        CardList.add(R.drawable.d7);
                        CardList.add(R.drawable.d8);
                        CardList.add(R.drawable.d9);
                        CardList.add(R.drawable.d10);
                        CardList.add(R.drawable.dj);
                        CardList.add(R.drawable.dq);
                        CardList.add(R.drawable.dk);
                        CardList.add(R.drawable.h1);
                        CardList.add(R.drawable.h2);
                        CardList.add(R.drawable.h3);
                        CardList.add(R.drawable.h4);
                        CardList.add(R.drawable.h5);
                        CardList.add(R.drawable.h6);
                        CardList.add(R.drawable.h7);
                        CardList.add(R.drawable.h8);
                        CardList.add(R.drawable.h9);
                        CardList.add(R.drawable.h10);
                        CardList.add(R.drawable.hj);
                        CardList.add(R.drawable.hq);
                        CardList.add(R.drawable.hk);
                        CardList.add(R.drawable.s1);
                        CardList.add(R.drawable.s1);
                        CardList.add(R.drawable.s3);
                        CardList.add(R.drawable.s4);
                        CardList.add(R.drawable.s5);
                        CardList.add(R.drawable.s6);
                        CardList.add(R.drawable.s7);
                        CardList.add(R.drawable.s8);
                        CardList.add(R.drawable.s9);
                        CardList.add(R.drawable.s10);
                        CardList.add(R.drawable.sj);
                        CardList.add(R.drawable.sq);
                        CardList.add(R.drawable.sk);
                        CardList.add(R.drawable.jb);
                        CardList.add(R.drawable.jr);


                        Random r = new Random();
                        int Random = r.nextInt(CardList.size());
                        imgCard.setImageResource(CardList.get(Random));

                    }

                    @Override
                    public void onFinish() {

                    }
                };
                count3.start();

                ArrayList<Integer>CardList = new ArrayList<Integer>();
                CardList.add(R.drawable.c1);
                CardList.add(R.drawable.c2);
                CardList.add(R.drawable.c3);
                CardList.add(R.drawable.c4);
                CardList.add(R.drawable.c5);
                CardList.add(R.drawable.c6);
                CardList.add(R.drawable.c7);
                CardList.add(R.drawable.c8);
                CardList.add(R.drawable.c9);
                CardList.add(R.drawable.c10);
                CardList.add(R.drawable.cj);
                CardList.add(R.drawable.cq);
                CardList.add(R.drawable.ck);
                CardList.add(R.drawable.d1);
                CardList.add(R.drawable.d2);
                CardList.add(R.drawable.d3);
                CardList.add(R.drawable.d4);
                CardList.add(R.drawable.d5);
                CardList.add(R.drawable.d6);
                CardList.add(R.drawable.d7);
                CardList.add(R.drawable.d8);
                CardList.add(R.drawable.d9);
                CardList.add(R.drawable.d10);
                CardList.add(R.drawable.dj);
                CardList.add(R.drawable.dq);
                CardList.add(R.drawable.dk);
                CardList.add(R.drawable.h1);
                CardList.add(R.drawable.h2);
                CardList.add(R.drawable.h3);
                CardList.add(R.drawable.h4);
                CardList.add(R.drawable.h5);
                CardList.add(R.drawable.h6);
                CardList.add(R.drawable.h7);
                CardList.add(R.drawable.h8);
                CardList.add(R.drawable.h9);
                CardList.add(R.drawable.h10);
                CardList.add(R.drawable.hj);
                CardList.add(R.drawable.hq);
                CardList.add(R.drawable.hk);
                CardList.add(R.drawable.s1);
                CardList.add(R.drawable.s1);
                CardList.add(R.drawable.s3);
                CardList.add(R.drawable.s4);
                CardList.add(R.drawable.s5);
                CardList.add(R.drawable.s6);
                CardList.add(R.drawable.s7);
                CardList.add(R.drawable.s8);
                CardList.add(R.drawable.s9);
                CardList.add(R.drawable.s10);
                CardList.add(R.drawable.sj);
                CardList.add(R.drawable.sq);
                CardList.add(R.drawable.sk);
                CardList.add(R.drawable.jb);
                CardList.add(R.drawable.jr);


                Random r = new Random();
                int Random = r.nextInt(CardList.size());
                imgCard.setImageResource(CardList.get(Random));
            }
        });
    }
}
