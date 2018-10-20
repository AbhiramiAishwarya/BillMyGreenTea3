package com.abhiaishu.win7.billmygreentea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView res;
    EditText input;
    Button button;
    String quant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = findViewById(R.id.result);
        input = findViewById(R.id.quantity);

        button = findViewById(R.id.Total);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                try {
                    quant = input.getText().toString();
                    int quantity = Integer.parseInt(quant);
                    quantity = quantity * 10;
                    res.setText(quantity + "");
                } catch (NumberFormatException e) {
                }

            }
        });
    }
    }
