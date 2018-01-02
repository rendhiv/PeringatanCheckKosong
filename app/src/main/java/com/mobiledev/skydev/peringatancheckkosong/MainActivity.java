package com.mobiledev.skydev.peringatancheckkosong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.editText1);
        check = (Button) findViewById(R.id.button1);


        check.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View arg0) {

                if(input.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Input Text Kosong..Tolong masukan Text", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Input Text is Tidak Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}