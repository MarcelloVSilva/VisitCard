package com.example.marcello.visitcard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_ig= (TextView) findViewById(R.id.instagram_text); //txt is object of TextView
        txt_ig.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.instagram.com/narcello/"));
                startActivity(browserIntent);
            }
        });

        TextView txt_twt= (TextView) findViewById(R.id.twitter_text); //txt is object of TextView
        txt_twt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://twitter.com/eusoumarcellov"));
                startActivity(browserIntent);
            }
        });

        TextView txt_google= (TextView) findViewById(R.id.gmail_text); //txt is object of TextView
        txt_google.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://mail.google.com/mail/u/0/?view=cm&tf=0&fs=1&to=marcellovcs@gmail.com"));
                startActivity(browserIntent);
            }
        });
    }

}
