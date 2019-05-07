package com.example.loggin;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {
    public TextView nomb, fecha1,  correo;

    int actual=2019;
    Button atras, enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        nomb=(TextView)findViewById(R.id.name1);
        correo=(TextView)findViewById(R.id.email);
        fecha1=(TextView)findViewById(R.id.fecha);
        enviar = (Button)findViewById(R.id.envio);
        enviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                                Intent i = new Intent(pantalla2.this,pantalla3.class);
                i.putExtra ("dato1", (CharSequence) nomb);
                i.putExtra ("dato2", (Parcelable) correo);

                startActivity(i);


                }

            }
        );
        atras = (Button)findViewById(R.id.btatras);
        atras.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
            Intent siguiente = new Intent (pantalla2.this, MainActivity.class);


            startActivity(siguiente);

        }
        });


    }


    public void salir1 (View view)
    {
        finish();
        System.exit(0);
    }
}
