package com.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rdoRajesh, rdoSalman, rdoBhuvan;
    private ImageView imgHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdoRajesh = findViewById(R.id.rdorajesh);
        rdoSalman = findViewById(R.id.rdosalman);
        rdoBhuvan = findViewById(R.id.rdobhuvan);
        imgHero = findViewById(R.id.imghero);

        rdoRajesh.setOnClickListener(this);
        rdoSalman.setOnClickListener(this);
        rdoBhuvan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.rdorajesh:
                Toast.makeText(this,"Rajesh dai",Toast.LENGTH_SHORT).show();
                imgHero.setImageResource(R.drawable.rajesh);
                break;
             case R.id.rdosalman:
                 Toast.makeText(this,"Salman Khan", Toast.LENGTH_SHORT).show();
                 imgHero.setImageResource(R.drawable.salman);
                 break;
            case R.id.rdobhuvan:
                Toast.makeText(this,"Bhuwan kc", Toast.LENGTH_SHORT).show();
                imgHero.setImageResource(R.drawable.bhuvan);
                break;

        }
    }
}
