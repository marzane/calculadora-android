package com.marzane.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public EditText etNumero1;
    public EditText etNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
    }

    public void sumarNumeros(View vista){
        //Toast.makeText(this, "sumarNumeros", Toast.LENGTH_SHORT).show();

        int numero1 = Integer.parseInt(etNumero1.getText().toString());
        int numero2 = Integer.parseInt(etNumero1.getText().toString());
        int suma = numero1 + numero2;

        Toast.makeText(this, suma, Toast.LENGTH_SHORT).show();

    }
}