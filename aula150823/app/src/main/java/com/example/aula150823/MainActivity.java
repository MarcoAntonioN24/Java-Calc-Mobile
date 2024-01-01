package com.example.aula150823;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button soma = findViewById(R.id.soma);
        Button subtracao1 = findViewById(R.id.subtracao);
        Button multiplicacao1 = findViewById(R.id.multiplicacao);
        Button divisao1 = findViewById(R.id.divisao);
        EditText n1 = findViewById(R.id.number1);
        EditText n8 = findViewById(R.id.number8);
        TextView r = findViewById(R.id.result);
        Button bclean = findViewById(R.id.btclean);


       //BOTÃO SOMA
      soma.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if ((n1.getText().toString().trim().isEmpty())) {
                  Toast.makeText(getApplicationContext(),"Insira o primeiro número",Toast.LENGTH_SHORT).show();
                  n1.requestFocus();

              }
              else if ((n8.getText().toString().trim().isEmpty())) {
                  Toast.makeText(getApplicationContext(),"Insira o segundo número",Toast.LENGTH_SHORT).show();
                  n8.requestFocus();

              }


              else {
                  double numero1 = Double.parseDouble(n1.getText().toString());
                  double numero8 = Double.parseDouble(n8.getText().toString());
                  double soma = numero1 + numero8;

                  //String soma2 = String.valueof(soma);
                  // r.setText("HU" + soma);

                  r.setText("" + soma);
              }
          }
      });



      //BOTÃO SUBTRAÇÃO
      subtracao1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if ((n1.getText().toString().trim().isEmpty())) {
                  Toast.makeText(getApplicationContext(), "Insira o primeiro número", Toast.LENGTH_SHORT).show();
                  n1.requestFocus();

              } else if ((n8.getText().toString().trim().isEmpty())) {
                  Toast.makeText(getApplicationContext(), "Insira o segundo número", Toast.LENGTH_SHORT).show();
                  n8.requestFocus();

              }
              else {


                  double numero1 = Double.parseDouble(n1.getText().toString());
                  double numero8 = Double.parseDouble(n8.getText().toString());
                  double subtracao1 = numero1 - numero8;
                  r.setText("" + subtracao1);
              }
          }
      });

      // botão limpar tela
        bclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1.setText("");
                n8.setText(null);
                r.setText("");
            }
        });

        //BOTÃO MULTIPLICAÇÃO
        multiplicacao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((n1.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(), "Insira o primeiro número", Toast.LENGTH_SHORT).show();
                    n1.requestFocus();

                } else if ((n8.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(), "Insira o segundo número", Toast.LENGTH_SHORT).show();
                    n8.requestFocus();

                }
                else {


                    double numero1 = Double.parseDouble(n1.getText().toString());
                    double numero8 = Double.parseDouble(n8.getText().toString());
                    double multiplicacao1 = numero1 * numero8;
                    r.setText("" + multiplicacao1);
                }


            }
        });

        //BOTÃO DIVISÃO
        divisao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((n1.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(), "Insira o primeiro número", Toast.LENGTH_SHORT).show();
                    n1.requestFocus();

                } else if ((n8.getText().toString().trim().isEmpty())) {
                    Toast.makeText(getApplicationContext(), "Insira o segundo número", Toast.LENGTH_SHORT).show();
                    n8.requestFocus();

                }
                else {


                    double numero1 = Double.parseDouble(n1.getText().toString());
                    double numero8 = Double.parseDouble(n8.getText().toString());
                    double divisao1 = numero1 / numero8;
                    r.setText("" + divisao1);
                }

            }
        });

    }
}