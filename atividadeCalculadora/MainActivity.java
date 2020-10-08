package com.example.mycalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtN1;
    EditText txtN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);
    }

    public void somar(View v) {
        String n1String = txtN1.getText().toString();
        String n2String = txtN2.getText().toString();

        if (n1String.isEmpty() || n2String.isEmpty()) {
            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Erro");
            msg.setMessage("Digite dois números corretamente!");
            msg.setNeutralButton("OK", null);
            msg.show();
        } else {

            Double n1 = Double.parseDouble(n1String);
            Double n2 = Double.parseDouble(n2String);

            Double resultado = n1 + n2;

            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Resultado");
            msg.setMessage("O resultado da soma é: " + resultado);
            msg.setNeutralButton("Ok", null);
            msg.show();
        }
    }

    public void subtrair(View v) {
        String n1String = txtN1.getText().toString();
        String n2String = txtN2.getText().toString();

        if (n1String.isEmpty() || n2String.isEmpty()) {
            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Erro");
            msg.setMessage("Digite dois números corretamente!");
            msg.setNeutralButton("Ok", null);
            msg.show();
        } else {
            Double n1 = Double.parseDouble(n1String);
            Double n2 = Double.parseDouble(n2String);

            Double resultado = n1 - n2;

            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Resutado");
            msg.setMessage("O resultado da subtração é: " + resultado);
            msg.setNeutralButton("Ok", null);
            msg.show();

        }
    }

    public void multiplicar(View v) {
        String n1String = txtN1.getText().toString();
        String n2String = txtN2.getText().toString();

        if (n1String.isEmpty() || n2String.isEmpty()){
            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Erro");
            msg.setMessage("Digite dois números corretamente!");
            msg.setNeutralButton("Ok", null);
            msg.show();
        } else {
            Double n1 = Double.parseDouble(n1String);
            Double n2 = Double.parseDouble(n2String);

            Double resultado = n1 * n2;

            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Resultado");
            msg.setMessage("O Resultado da multiplicação é: " + resultado);
            msg.setNeutralButton("Ok", null);
            msg.show();
        }
    }

    public void dividir(View v) {
        String n1String = txtN1.getText().toString();
        String n2String = txtN2.getText().toString();

        if (n1String.isEmpty() || n2String.isEmpty()) {
            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Erro");
            msg.setMessage("Digite dois números corretamente!");
            msg.setNeutralButton("Ok", null);
            msg.show();
        } else if (n2String.equals("0")) {
            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Erro");
            msg.setMessage("Impossível dividir por Zero");
            msg.setNeutralButton("Ok", null);
            msg.show();
        } else {
            Double n1 = Double.parseDouble(n1String);
            Double n2 = Double.parseDouble(n2String);

            Double resultado = n1 / n2;

            AlertDialog.Builder msg = new AlertDialog.Builder(this);

            msg.setTitle("Resultado");
            msg.setMessage("O resultado da divisão é: " + resultado);
            msg.setNeutralButton("Ok", null);
            msg.show();
        }
    }
}