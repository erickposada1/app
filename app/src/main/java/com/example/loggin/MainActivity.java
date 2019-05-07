package com.example.loggin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguiente = (Button)findViewById(R.id.bt1);
        siguiente.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent (MainActivity.this, pantalla2.class);


                startActivity(siguiente);

            }
        });
    }
    public void salir (View view)
    {
        finish();
    }



}
