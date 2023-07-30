package com.example.estelar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent != null) {
            int imageResId = intent.getIntExtra("imageResId", 0);
            String description = intent.getStringExtra("description");

            ImageView imageView = findViewById(R.id.imageView);
            imageView.setImageResource(imageResId);

            TextView descriptionTextView = findViewById(R.id.descriptionTextView);
            descriptionTextView.setText(description);
        }

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
            Button closeAppButton = findViewById(R.id.closeAppButton);
        closeAppButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Cerrar todas las actividades y finalizar la aplicación
                    finishAffinity();
                }
        });
    }
}
