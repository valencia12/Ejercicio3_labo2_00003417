package com.example.labo3;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.color1id);
        btn2 = findViewById(R.id.color2id);
        btn3 = findViewById(R.id.color3id);


        btn1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                int[] Colores1 = {R.color.color11, R.color.color12, R.color.color13, R.color.color14, R.color.color15};
                int viewId = v.getId();
                switch (viewId) {
                    case R.id.color1id: {
                        btn1.setBackgroundColor(getColor(Colores1[(int) Math.floor(Math.random() * 6)]));
                        break;
                    }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                int[] Colores2 = {R.color.color21, R.color.color22, R.color.color23, R.color.color24, R.color.color25};
                int viewId = v.getId();
                switch (viewId) {
                    case R.id.color2id: {
                        btn2.setBackgroundColor(getColor(Colores2[(int) Math.floor(Math.random() * 5)]));
                        break;
                    }
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                int[] Colores3 = {R.color.color31, R.color.color32, R.color.color33, R.color.color34, R.color.color35};
                int viewId = v.getId();
                switch (viewId) {
                    case R.id.color3id: {
                        btn3.setBackgroundColor(getColor(Colores3[(int) Math.floor(Math.random() * 5)]));
                        break;
                    }
                }
            }
        });




    }
}
