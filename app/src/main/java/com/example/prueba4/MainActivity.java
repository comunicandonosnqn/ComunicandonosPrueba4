package com.example.prueba4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    MediaPlayer mp2;
    ImageButton botonGato;
    ImageButton botonPerro;
    ImageButton videoGato;
    ImageButton videoPerro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonGato = (ImageButton)findViewById(R.id.botonGato);
        videoGato = (ImageButton)findViewById(R.id.buttonVideoGato);

        botonPerro = (ImageButton)findViewById(R.id.botonPerro);
        videoPerro = (ImageButton)findViewById(R.id.imageButton);

        mp = MediaPlayer.create(this, R.raw.gato);
        mp2 = MediaPlayer.create(this, R.raw.perro);




        botonGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        botonPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        videoGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));

            }
        });
        //boton del video Perro
        videoPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VideoActivity.class));

            }
        });
    }
}
