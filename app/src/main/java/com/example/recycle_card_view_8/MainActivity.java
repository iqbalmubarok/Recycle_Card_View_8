package com.example.recycle_card_view_8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBioIqbal, btnBioRagil, btnCardView, btnRecycleView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBioIqbal = findViewById(R.id.btn_bio_iqbal);
        btnBioRagil = findViewById(R.id.btn_bio_ragil);
        btnCardView = findViewById(R.id.btn_card_view);
        btnRecycleView = findViewById(R.id.btn_recycle_view);

        btnBioIqbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bioIqbal = new Intent(MainActivity.this, bio_iqbal.class);
                startActivity(bioIqbal);
            }
        });

        btnBioRagil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bioRagil = new Intent(MainActivity.this, bio_ragil.class);
                startActivity(bioRagil);
            }
        });

        btnCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cardView = new Intent(MainActivity.this, CardView.class);
                startActivity(cardView);
            }
        });

        btnRecycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recycleView = new Intent(MainActivity.this, RecycleView.class);
                startActivity(recycleView);
            }
        });
    }
}

