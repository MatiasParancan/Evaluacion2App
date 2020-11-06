package com.example.evaluacion2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String correo = "admin@mail.com";
    String password = "admin123";
    EditText edtLogin_email;
    EditText edtLogin_password;
    TextView tvCreateAccount;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLogin_email = findViewById(R.id.login_editText_email);
        edtLogin_password = findViewById(R.id.login_editText_password);
        tvCreateAccount = findViewById(R.id.login_textView_crearCuenta);

        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        tvCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createAccount_Activity = new Intent(MainActivity.this, CreateAccountActivity.class);
                startActivity(createAccount_Activity);
            }
        });
    }

    public void goToHomePage() {
        if (correo.equals(edtLogin_email.getText().toString()) && password.equals(edtLogin_password.getText().toString())) {
            Intent homeActivity = new Intent(this, HomeActivity.class);
            startActivity(homeActivity);
        } else {
            Toast.makeText(this, "Credenciales incorrectas.", Toast.LENGTH_SHORT).show();
        }
    }
}