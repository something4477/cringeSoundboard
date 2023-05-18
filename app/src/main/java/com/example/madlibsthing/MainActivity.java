package com.example.madlibsthing;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer soundOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void plVineBoom(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.vineboom);
        soundOut.start();
    }
    public void plTyrone(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.tyrone);
        soundOut.start();
    }
    public void plReverbFart(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.reverbfart);
        soundOut.start();
    }
    public void plPipe(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.pipe);
        soundOut.start();
    }
    public void plHorse(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.horse);
        soundOut.start();
    }
    public void plDoit(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.doit);
        soundOut.start();
    }
    public void plHorn(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.horn);
        soundOut.start();
    }
    public void plFunky(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.funky);
        soundOut.start();
    }
    public void plLoudFart(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.loudfart);
        soundOut.start();
    }
    public void plFogHorn(View v) {
        soundOut=MediaPlayer.create(MainActivity.this,R.raw.foghorn);
        soundOut.start();
    }


}