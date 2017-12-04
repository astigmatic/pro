package com.example.adam.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = findViewById(R.id.et1);

        final EditText y = findViewById(R.id.et2);

        Button z = findViewById(R.id.but1);

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String a = x.getText().toString();
               y.setText(a);
            }
        });

    }
}
