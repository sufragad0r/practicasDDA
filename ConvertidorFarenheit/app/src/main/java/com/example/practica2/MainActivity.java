package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editTemperatura = findViewById(R.id.temperaturaF);
        TextView txtCentigrados = findViewById(R.id.txt_centigrados);
        Button boton = findViewById(R.id.btn_convertir);

        boton.setOnClickListener(v->{
            double temperatura = Double.parseDouble(editTemperatura.getText().toString());
            if(temperatura != 0) {
                double i = temperatura-32;
                temperatura = (i*5)/9;
                String temperaturaString = String.valueOf(temperatura);
                String centigrados = getString(R.string.temperatura_c,temperaturaString);
                txtCentigrados.setText(centigrados);
            }else{
                Toast.makeText(this,R.string.you_should_write_here,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}