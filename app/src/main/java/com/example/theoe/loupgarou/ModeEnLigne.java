package com.example.theoe.loupgarou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModeEnLigne extends AppCompatActivity {

    private Button creerPartie;
    private Button rejoindrePartie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_en_ligne);

        this.creerPartie = findViewById(R.id.button_creerPartie);
        this.rejoindrePartie = findViewById(R.id.button_rejoindrePartie);

        creerPartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(), FicheCreationPartie.class);
                startActivity(otheractivity);
                finish();
            }
        });

        rejoindrePartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otheractivity = new Intent(getApplicationContext(),FicheRejoindePartie.class);
                startActivity(otheractivity);
                finish();
            }
        });
    }
}

