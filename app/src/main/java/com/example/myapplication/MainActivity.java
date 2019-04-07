package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button subBtn = (Button) findViewById(R.id.subBtn);
        Button mulBtn = (Button) findViewById(R.id.mulBtn);
        Button divBtn = (Button) findViewById(R.id.divBtn);
        final EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        final EditText seoondNumEdittext = (EditText) findViewById(R.id.secondNumEditText);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                Double num2 = Double.parseDouble(seoondNumEdittext.getText().toString());
                Double result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });


        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                Double num2 = Double.parseDouble(seoondNumEdittext.getText().toString());
                Double result = num1 - num2;
                resultTextView.setText(result + "");

            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                Double num2 = Double.parseDouble(seoondNumEdittext.getText().toString());
                Double result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                Double num2 = Double.parseDouble(seoondNumEdittext.getText().toString());
                Double result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });
    }
}
