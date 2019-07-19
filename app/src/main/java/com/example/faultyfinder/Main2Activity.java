package com.example.faultyfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
ImageView sticker;
TextView result;
TextView nameentered;
Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main2);
        sticker = (ImageView) findViewById(R.id.sticker_result);
        result = (TextView) findViewById(R.id.result);
        nameentered = (TextView) findViewById(R.id.name_entered);
        back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(getBaseContext(),MainActivity.class);

                startActivity(act1);
            }
        });
        Bundle bundle = getIntent().getExtras();
        String names2 = bundle.getString("nameac1");
        finder(names2);

    }

    void finder(String names) {
        names = names.toLowerCase();
        names = names.replaceAll("\\s", "");
        nameentered.setText(names);
        switch (names) {
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

