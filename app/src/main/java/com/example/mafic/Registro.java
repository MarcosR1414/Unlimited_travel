package com.example.mafic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {
    TextView tv_Iniciar_sesion;
    MaterialButton btnRegistrarsee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        // Referencia al TextView para iniciar sesión
        tv_Iniciar_sesion = findViewById(R.id.tv_Iniciar_sesion);
        tv_Iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a la MainActivity (inicio de sesión)
                Intent intentReg = new Intent(Registro.this, MainActivity.class);
                startActivity(intentReg);
            }
        });

        // Referencia al botón de registro
        btnRegistrarsee = findViewById(R.id.btn_registrarsee);
        btnRegistrarsee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a Usuario.java
                Intent intentUsuario = new Intent(Registro.this, Usuario.class);
                startActivity(intentUsuario);
            }
        });
    }
}
