package com.laercioeana.alcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float Gasolina = 0;
    float Alcool = 0;
    float x = 0;


    EditText idGasolina,idAlcool;
    TextView idResultado ;
    Button idVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idGasolina = (EditText)  findViewById(R.id.idGasolina);
        idAlcool = (EditText)  findViewById(R.id.idAlcool);
        idResultado = (TextView) findViewById(R.id.idResultado);
        idVerificar = (Button) findViewById(R.id.idVerificar);

        idVerificar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View idVerificar) {
                Alcool = Float.parseFloat(idAlcool.getText().toString());
                Gasolina = Float.parseFloat(idGasolina.getText().toString());

                   x = Alcool / Gasolina;

                  if(x <= 0.7){
                      idResultado.setText("Álcool!");

                  }else {
                      idResultado.setText("Gasolina!");
                  }
            }
        });



    }
}