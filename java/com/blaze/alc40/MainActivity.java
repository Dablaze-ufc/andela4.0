package com.blaze.alc40;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.alc_button);
        button2 = findViewById(R.id.profile_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutme();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlcabout();
            }
        });

    }
    public void openAlcabout(){
        Intent intentalcabout = new Intent(this, Alcabout.class);
        startActivity(intentalcabout);
    }
    public void openAboutme(){
        Intent intentaboutme = new Intent(this, Aboutme.class);
        startActivity(intentaboutme);
    }
}
