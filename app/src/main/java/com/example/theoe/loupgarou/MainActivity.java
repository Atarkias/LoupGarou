package com.example.theoe.loupgarou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mode_narrateur;
    private Button mode_ligne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mode_narrateur = findViewById(R.id.bouton_mode_narrateur);
        this.mode_ligne = findViewById(R.id.boutton_mode_ligne);

        mode_narrateur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent otherActivity = new Intent(getApplicationContext(), ModeNarrateur.class);
                startActivity(otherActivity);
                finish();
            }
        });

        mode_ligne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent otherActivity = new Intent(getApplicationContext(),ModeEnLigne.class);
                startActivity(otherActivity);
                finish();
            }
        });
    }
}
