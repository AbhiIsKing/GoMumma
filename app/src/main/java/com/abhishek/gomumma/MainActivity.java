package com.abhishek.gomumma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputLoginID, inputPassword;
    Button login;
    TextView forgotPassword, createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLoginID = findViewById(R.id.input_login_id);
        inputPassword = findViewById(R.id.input_password);
        login = findViewById(R.id.login);
        forgotPassword = findViewById(R.id.forget_password);
        createAccount = findViewById(R.id.create_account);

        login.setOnClickListener(view -> {

        });

        forgotPassword.setOnClickListener(view -> {

        });

        createAccount.setOnClickListener(view -> {

        });
    }
}