package com.yazilimindunyasi.www.myeyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KullaniciTercihi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_tercihi);
    }

    public void OturumGormeEngelli(View view)
    {
        Intent i = new Intent(getApplicationContext(), GormeEngelliAnasayfaOncesi.class);
        startActivity(i);
    }
    public void OturumGonullu(View view)
    {
        Intent i = new Intent(getApplicationContext(), GonulluOturumAcma.class);
        startActivity(i);
    }

}
