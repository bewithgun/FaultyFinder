package com.example.faultyfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;
    RelativeLayout RL;
    LinearLayout LL;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setTitle("Animation");
        RL = (RelativeLayout) findViewById(R.id.reli);
        LL = (LinearLayout) findViewById(R.id.lini);
        name = (EditText) findViewById(R.id.ed_name_here);
        name.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

        button = (Button) findViewById(R.id.buttoncheck);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result = new Intent(getBaseContext(),Main2Activity.class);

                String names;
                names = name.getText().toString();
                result.putExtra("nameac1",names);
                if(!names.equals("")) {
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(RL,"small_big");
                    pairs[1] = new Pair<View,String>(LL,"copy");



                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                            pairs
                            );
                    startActivity(result, options.toBundle());
                }
                else
                {
                    name.setHint("PLEASE ENTER SOMETHING");
                }
            }
        });

    }









}
