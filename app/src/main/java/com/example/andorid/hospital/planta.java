package com.example.andorid.hospital;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;

public class planta extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        ArrayList<String> message = new ArrayList<String>();

        message = intent.getStringArrayListExtra(MainActivity.pacientes[0]);
        System.out.println("fndjkfhdshoidHFDAHADHJADJADF  ENTRO");

        rellenar(message);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planta);
    }

    public void rellenar(ArrayList<String> info){

        Button boton1 = (Button) findViewById(R.id.hab1);
        boton1.setText(info.get(0));
        System.out.println("fndjkfhdshoidHFDAHADHJADJADF  "+info.get(0));


    }
}
