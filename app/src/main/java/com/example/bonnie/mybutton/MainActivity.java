package com.example.bonnie.mybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            Button mButton = (Button) findViewById(R.id.my_button2);


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            {class MyListener implements View.OnClickListener{
                @Override
                public void onClick(View v) {
                    Toast.makeText(mainActivity.this, "Hello", Toast.LENGTH_SHORT).show();

                }
            }
            }

            MyListener theListener = new MyListener();

            mButton.setOnClickListener(theListener);
            }