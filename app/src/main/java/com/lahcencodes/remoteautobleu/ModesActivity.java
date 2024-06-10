package com.lahcencodes.remoteautobleu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ModesActivity extends AppCompatActivity {

    private Button buttonAutomatic;
    private Button buttonManual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        buttonAutomatic = findViewById(R.id.button_automatic);
        buttonManual = findViewById(R.id.button_manual);

        buttonAutomatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModesActivity.this, AutomaticActivity.class);
                startActivity(intent);
            }
        });

        buttonManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement navigation to ManualActivity
            }
        });
    }
}
