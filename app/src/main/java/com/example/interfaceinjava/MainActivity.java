package com.example.interfaceinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnThrowJab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Boxer boxerA = new Boxer();
        btnThrowJab = findViewById(R.id.btnThrowJab);
        boxerA.throwJab();
        Toast.makeText(MainActivity.this, boxerA.throwJab(), Toast.LENGTH_SHORT).show();

        //an anonymous view class implements onclick interface must instantiate the methods
        btnThrowJab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, boxerA.throwJab(), Toast.LENGTH_SHORT).show();
                btnThrowJab.setText(boxerA.throwJab());
            }
        });

        Log.i("TAG","git");

    }
}
