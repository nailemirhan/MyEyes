package com.yazilimindunyasi.www.myeyes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class IlkGiris extends AppCompatActivity {
    boolean gizlilik=false;
    boolean hizmet=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_giris);
    }
    public void onBrowserGizlilikSozlesmesi(View view)
    {
        gizlilik=true;
        ((ImageView)findViewById(R.id.GizlilikEmoji)).setBackgroundResource(R.drawable.tikisareti);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tr"));
        startActivity(browserIntent);
    }
    public void onBrowserHizmetSozlesmesi(View view)
    {
        hizmet=true;
        ((ImageView)findViewById(R.id.HizmetEmoji)).setBackgroundResource(R.drawable.tikisareti);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tr"));
        startActivity(browserIntent);
    }
    public void KullaniciTercihineGec(View view)
    {
        if (hizmet==true && gizlilik==true)
        {
            Intent intocan = new Intent(IlkGiris.this, KullaniciTercihi.class);
            startActivity(intocan);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Lütfen Hizmet Sözleşmesi ve Gizlilik Politikası yazılarına tıklayıp kurallarımızı okuyunuz.", Toast.LENGTH_SHORT).show();
        }
    }

}
