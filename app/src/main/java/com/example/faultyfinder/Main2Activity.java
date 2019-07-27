package com.example.faultyfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

public class Main2Activity extends AppCompatActivity {
ImageView sticker;
TextView result;
TextView nameentered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setTitle("Animation2");
        setContentView(R.layout.activity_main2);
        sticker = (ImageView) findViewById(R.id.sticker_result);
        result = (TextView) findViewById(R.id.result);
        nameentered = (TextView) findViewById(R.id.name_entered);

        Bundle bundle = getIntent().getExtras();
        String names2 = bundle.getString("nameac1");
        finder(names2);

    }

    @Override
    public void onBackPressed() {
        Animation aniFade= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
        sticker.startAnimation(aniFade);
        result.startAnimation(aniFade);
        nameentered.startAnimation(aniFade);
        Intent prev = new Intent(this, MainActivity.class);
        overridePendingTransition(R.anim.fadeout,R.anim.fadeout);
        finish();
        startActivity(prev);
    }

    void finder(String names) {
        String nametodisplay;
        names = names.toLowerCase();
        names = names.replaceAll("\\s", "");
        nametodisplay=names;
        nametodisplay = nametodisplay.substring(0,1).toUpperCase()+ names.substring(1).toLowerCase();
        nameentered.setText(nametodisplay);
        switch (names) {
            case "aditya":
                result.setText("Helping always,BUT NOT FAULTY");
                sticker.setImageResource(R.drawable.aditya);
                break;
            case "yash":
                result.setText("CR,NOT FAULTY");
                sticker.setImageResource(R.drawable.yash);
                break;
            case "sukum":
                result.setText("Gammer and youtuber,NOT FAULTY");
                sticker.setImageResource(R.drawable.sukum);
                break;
            case "mayuresh":
                result.setText("Gamer,NOT FAULTY");
                sticker.setImageResource(R.drawable.mayuresh);
                break;
            case "sanket":
                result.setText("TOPPER BOY,NOT FAULTY");
                sticker.setImageResource(R.drawable.sanket);
                break;
            case "akash":
                result.setText("HE IS HACKER,NOT FAULTY");
                sticker.setImageResource(R.drawable.akash);
                break;
            case "sahil":
                 result.setText("Please enter with surname for same names");
                 break;
            case "sahilpardi":
                 result.setText("HE IS JOCKER BOY,NOT FAULTY");
                 sticker.setImageResource(R.drawable.joker);
                 break;
            case "sahilpawar":
                 result.setText("HE IS BUNKER BOY,NOT FAULTY");
                sticker.setImageResource(R.drawable.sahilpawar);
                break;
            case "aakash":
                result.setText("HE IS HACKER,NOT FAULTY");
                sticker.setImageResource(R.drawable.akash);
                break;
            case "pranav":
                result.setText("HE IS KARAD BOY,,NOT FAULTY");
                sticker.setImageResource(R.drawable.pranav);
                break;
            case "shreetej":
               result.setText("PUBG PLAYER WILL BE PRO SOON,NOT FAULTY");
                sticker.setImageResource(R.drawable.shreetej);
                break;
            case "shashank":
                result.setText("YEAH,, YOU ARE ,,ONE AND ONLY ONE FAULTY");
                sticker.setImageResource(R.drawable.right);
                break;

            case "hariom":
                result.setText("HE IS NOT FAULTY BUT HE IS BEST FRIEND OF HIM");
                sticker.setImageResource(R.drawable.hariom);
                break;
            case "siddesh":
                result.setText("HE IS HERO");
                sticker.setImageResource(R.drawable.siddesh);
                break;
            case "mayur":
                result.setText("ATTENDS EVERY LECTURE");
                sticker.setImageResource(R.drawable.mayur);
                break;


            default:
                result.setText("YOU ARE WRONG,,,TRY TO ASK HARIOM OR SANKET");
                sticker.setImageResource(R.drawable.wrong);
                break;
        }

    }
}

