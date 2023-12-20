package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  //khai báo các biến giao diện ở đây
    EditText edtE, edtP;
    Button btnL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //khai bao cac dia chi id o day
        edtE = findViewById(R.id.edtE);
        edtP = findViewById(R.id.edtP);
        btnL = findViewById(R.id.btnL);

        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= edtE.getText().toString();
                String password = edtP.getText().toString();
            }
        });
    }
}