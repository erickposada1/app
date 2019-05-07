package com.example.loggin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class pantalla3 extends AppCompatActivity {
 TextView tvDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
    }

 private void datos()
 {
     Bundle extras = getIntent().getExtras();
     String da1 = extras.getString("dato1");
     String da2 = extras.getString("dato2");
     tvDatos = (TextView)findViewById(R.id.tvDatos);
     tvDatos.setText(da1+da2);
 }
}
