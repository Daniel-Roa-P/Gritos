package com.example.danbr.gritos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sonidoPikachu(View view){
        mp= MediaPlayer.create(this, R.raw.pikachu);
        mp.start();
    }

    public void sonidoArticuno(View view){
        mp= MediaPlayer.create(this, R.raw.articuno);
        mp.start();
    }

    public void sonidoLugia(View view){
        mp= MediaPlayer.create(this, R.raw.lugia);
        mp.start();
    }

    public void sonidoSwampert(View view){
        mp= MediaPlayer.create(this, R.raw.swampert);
        mp.start();
    }

    public void sonidoBidoof(View view){
        mp= MediaPlayer.create(this, R.raw.bidoof);
        mp.start();
    }

    public void sonidoLuxray(View view){
        mp= MediaPlayer.create(this, R.raw.luxray);
        mp.start();
    }

    public void sonidoSerperior(View view){
        mp= MediaPlayer.create(this, R.raw.serperior);
        mp.start();
    }

    public void sonidoGoodra(View view){
        mp= MediaPlayer.create(this, R.raw.goodra);
        mp.start();
    }

    public void sonidoPrimarina(View view){

        mp=MediaPlayer.create(this, R.raw.foca);
        mp.start();
    }

}


