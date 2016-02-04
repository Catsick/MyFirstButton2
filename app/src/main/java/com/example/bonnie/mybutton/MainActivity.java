package com.example.bonnie.mybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = (Button) findViewById(R.id.button);

        {
            class MyListener implements View.OnClickListener {
                @Override
                public void onClick(View v) {


                }
            }
         //   MyListener theListener = new MyListener();

            mButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_SHORT).show();

                }
            });
        }


    }
}