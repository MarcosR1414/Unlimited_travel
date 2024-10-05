package com.example.mafic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MaterialButton btnIniciarSesion;
    TextView tvRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia del botón de iniciar sesión
        btnIniciarSesion = findViewById(R.id.btn_iniciar_sesion);

        // Acción para el botón de iniciar sesión
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear el Intent para navegar a Usuario.java
                Intent intent = new Intent(MainActivity.this, Usuario.class);
                startActivity(intent); // Iniciar la nueva actividad
            }
        });

        // Referencia del TextView de registrar
        tvRegistrar = findViewById(R.id.tv_registrar);

        // Acción para el TextView de registrar
        tvRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear el Intent para navegar a Registro.java
                Intent intent = new Intent(MainActivity.this, Registro.class);
                startActivity(intent); // Iniciar la nueva actividad
            }
        });
    }
}
