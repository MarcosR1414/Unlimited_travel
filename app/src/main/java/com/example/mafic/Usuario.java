package com.example.mafic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_usuario);

        // Ajustar los insets para el layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar el listener para el clic en food_image
        ImageView foodImage = findViewById(R.id.food_image);
        foodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a Alojamientos.java al hacer clic
                Intent intent = new Intent(Usuario.this, Alojamientos.class);
                startActivity(intent);
            }
        });

        // Configurar el listener para el clic en food_image1
        ImageView foodImage1 = findViewById(R.id.food_image1);
        foodImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a Tours.java al hacer clic
                Intent intent = new Intent(Usuario.this, Tours.class);
                startActivity(intent);
            }
        });
    }
}
