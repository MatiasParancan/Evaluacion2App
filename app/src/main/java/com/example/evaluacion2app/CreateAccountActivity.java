package com.example.evaluacion2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {
    EditText edtNombre;
    EditText edtCorreo;
    EditText edtPassword;
    EditText edtRepeatPassword;
    Button btnCrearCuenta;
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        edtNombre = findViewById(R.id.createAccount_editText_nombre);
        edtCorreo = findViewById(R.id.createAccount_editText_email);
        edtPassword = findViewById(R.id.createAccount_editText_password);
        edtRepeatPassword = findViewById(R.id.createAccount_editText_repeatPassword);
        btnCrearCuenta = findViewById(R.id.createAccount_button_crearCuenta);
        btnRegresar = findViewById(R.id.createAccount_button_regresar);

        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtPassword.equals(edtRepeatPassword)) {
                    Intent mainActivity = new Intent(CreateAccountActivity.this, MainActivity.class);
                    startActivity(mainActivity);
                } else {
                    Toast.makeText(CreateAccountActivity.this, "Contraseñas no coinciden.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(CreateAccountActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}