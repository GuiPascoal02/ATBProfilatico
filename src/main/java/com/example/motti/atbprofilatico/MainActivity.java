package com.example.motti.atbprofilatico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.motti.atbprofilatico.Doencas.Cardiaca;
import com.example.motti.atbprofilatico.Doencas.Estomacal;
import com.example.motti.atbprofilatico.Doencas.Pulmonar;
import com.example.motti.atbprofilatico.Doencas.Renal;

public class MainActivity extends AppCompatActivity {

    Button btn1 = findViewById(R.id.btnPulmonar);
    Button btn2 = findViewById(R.id.btnCardiaca);
    Button btn3 = findViewById(R.id.btnEstomacal);
    Button btn4 = findViewById(R.id.btnRenal);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Pulmonar.class);

                startActivity(it);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Cardiaca.class);

                startActivity(it);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Estomacal.class);

                startActivity(it);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Renal.class);

                startActivity(it);
            }
        });

    }
}
