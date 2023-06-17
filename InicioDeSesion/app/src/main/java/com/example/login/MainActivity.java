package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userText, passwordText;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userText = (EditText)  findViewById(R.id.user);
        passwordText = (EditText) findViewById(R.id.password);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = userText.getText().toString();
                String password = passwordText.getText().toString();

                if(username.equals("user") && (password.equals("contrasenia"))){
                    Toast.makeText(MainActivity.this, getString(R.string.welcome), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),NewActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, getString(R.string.invalid_credentials), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}