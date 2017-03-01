package com.darkflamemaster.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Dark Flame Master on 2/6/2017.
 */

public class Email extends Activity implements View.OnClickListener{

    EditText personEmail, intro, personName, stupidThing, hatefulAction, outro;
    String emailAdd, beginning, name, stupidAction, hatefulAct, out;
    Button sendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        initializeVars(); //hàm tự tạo ở dưới
        sendEmail.setOnClickListener(this);
    }

    private void initializeVars() {
        personEmail = (EditText) findViewById(R.id.etEmail);
        intro = (EditText) findViewById(R.id.etIntro);
        personName = (EditText) findViewById(R.id.etName);
        stupidThing = (EditText) findViewById(R.id.etThing);
        hatefulAction = (EditText) findViewById(R.id.etAction);
        outro = (EditText) findViewById(R.id.etOutTro);
        sendEmail = (Button) findViewById(R.id.bSendEmail);
    }

    @Override
    public void onClick(View v) {

        convertEditTextToString();
        String emailaddress[] = {emailAdd};
        String message = "Well hello"
                + name
                + " I just want to say"
                + beginning
                + ". Not only that but I hate when you "
                + stupidAction
                + ", that just really make me crazy. I just want to make you "
                + hatefulAct
                + ". Welp, that's all I wanted to chit-chatter about, oh and"
                + out
                +". Oh also if you get bored you should check out https://www.facebook.com/ZzAkiSatohzZ"
                + '\n' + "PS. I think I love you...     ";

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL,emailaddress);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,"I hate you !");
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(emailIntent);

    }

    private void convertEditTextToString() {
        emailAdd = personEmail.getText().toString();
        beginning = intro.getText().toString();
        name = personName.getText().toString();
        stupidAction =  stupidThing.getText().toString();
        hatefulAct = hatefulAction.getText().toString();
        out = outro.getText().toString();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
