package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LoginButtons;
        final EditText NameEdit;
        final EditText PasswordText;
        NameEdit = findViewById(R.id.NameLogin);
        LoginButtons = findViewById(R.id.LoginButton);
        PasswordText = findViewById(R.id.editTextTextPassword);


        LoginButtons.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Typed Login: " + NameEdit.getText().toString() + "\r\n Typed password: " + PasswordText.getText().toString(), Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}