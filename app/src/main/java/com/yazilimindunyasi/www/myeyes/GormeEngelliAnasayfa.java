package com.yazilimindunyasi.www.myeyes;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class GormeEngelliAnasayfa extends AppCompatActivity {

    int zaman= 33;  //GormeEngelliAnasayfa adlı ses kaydının toplam zamanı
    Handler handle = null;
    Runnable runnable = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorme_engelli_anasayfa);

        MediaPlayer mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.gormeengellianasayfa);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();



        handle = new Handler();
        runnable = new Runnable() {

            @Override
            public void run() {
                if (zaman != 0) {
                    zaman--;
                } else {
                    ((Button)findViewById(R.id.btn_Bildirim)).setEnabled(true);
                    ((Button)findViewById(R.id.btn_VideoluIstek)).setEnabled(true);
                    ((Button)findViewById(R.id.btn_ResimliIstek)).setEnabled(true);
                    handle.removeCallbacks(runnable);
                }
                handle.postDelayed(runnable, 1000);

            }
        };
        runnable.run();
    }
}
