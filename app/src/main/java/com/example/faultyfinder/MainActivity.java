package com.example.faultyfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        name = (EditText) findViewById(R.id.ed_name_here);

        button = (Button) findViewById(R.id.buttoncheck);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result = new Intent(getBaseContext(),Main2Activity.class);

                String names;
                names = name.getText().toString();
                result.putExtra("nameac1",names);
                if(!names.equals("")) {
                    startActivity(result);
                }
                else
                {
                    name.setHint("PLEASE ENTER SOMETHING");
                }
            }
        });
    }








}
